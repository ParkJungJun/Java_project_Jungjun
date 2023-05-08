package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoffeeDAO {
	static {
	      try {
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      }catch (ClassNotFoundException e) {
	      e.printStackTrace();
	      }
	}
	private static Connection conn = getConnection();
	private static Connection getConnection(){
	      try {
	    	  return DriverManager.getConnection(
	            "jdbc:oracle:thin:@localhost:1521:XE",
	            "hr",
	            "1234"
	    		);
	      } catch (SQLException e) {
	    	  e.printStackTrace();
	    	  return null;
	      }
	}
	public List<Coffee> getAllcoffee() {
	      String query = "SELECT * FROM coffee";
	      
	      try (
	            PreparedStatement pstmt = conn.prepareStatement(query);
	            ResultSet rs = pstmt.executeQuery()
	      ) {
	         List<Coffee> list = new ArrayList<>();
	         while (rs.next()) {
	            list.add(new Coffee(
	               rs.getInt("coffee_id"),
	               rs.getString("coffee_name"),
	               rs.getInt("coffee_price")
	            ));
	         }
	         return list;
	      }catch (SQLException e) {
	         e.printStackTrace();
	         return null;
	      }
	   }
	public List<Coffee> showUnder3000() {
		String query = "SELECT * FROM coffee WHERE coffee_price <= 3000";
		try(
	        PreparedStatement pstmt = conn.prepareStatement(query);
	        ResultSet rs = pstmt.executeQuery();
	      ) {
			List<Coffee> list = new ArrayList<>();
	         while (rs.next()) {
	            list.add(new Coffee(
	               rs.getInt("coffee_id"),
	               rs.getString("coffee_name"),
	               rs.getInt("coffee_price")
	            ));
	         }
	         return list;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void plusCoffee(String coffee, int price) {
		String query = "INSERT INTO coffee VALUES(coffee_id_seq.nextval,?,?)";
		try(
			Connection conn = OjdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
			){
				pstmt.setString(1, coffee);
				pstmt.setInt(2, price);
				pstmt.executeUpdate();
				System.out.printf("%d원의 %s가 추가되었습니다", price,coffee);
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
}
