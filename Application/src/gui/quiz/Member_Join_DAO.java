package gui.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.List;

import database.OjdbcConnection;
import database.StaticResources;


public class Member_Join_DAO {
	
	
	public Member_Join_DAO() {
		
	}
	
	public String id_dupli_chk(String id) {
		String sql = "SELECT * FROM user_info WHERE user_id = '"+id+"'";
		String str_id = "";
		try (Connection conn = OjdbcConnectionJoin.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		) {
			if(rs.next()) {
				return "중복된 ID, 사용 불가능";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "사용가능 ID 입니다.";
		
	}
	
	public void user_info_insert(String id, String pw, String name, String jumin, String email) {
		String sql = "INSERT INTO user_info VALUES (?,?,?,?,?)";
		try (Connection conn = OjdbcConnectionJoin.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			System.out.println(jumin);
			String[] jumin_li = jumin.split("-");
			
			String str_jumin = jumin_li[0]+jumin_li[1].split("x")[0];
			int jumin_int = Integer.parseInt(str_jumin);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setInt(4, jumin_int);
			pstmt.setString(5, email);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
