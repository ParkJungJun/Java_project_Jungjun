package database.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J03_PotterWheelE {
	/*
	 * 	# 경품 추첨 이벤트를 구현해 보세요
	 * 
	 *  (1) DB에 경품들의 이름, 당첨 확률, 남은 수량 등을 저장할 수 있는
	 *      테이블이 존재해야 한다
	 *      
	 *  (2) 콘솔에서 뽑기를 진행하면 실제로 DB에서 수량이 줄어들어야 한다
	 *  
	 *  (3) 상품이 모두 소진되면 프로그램이 종료되어야 한다
	 *  
	 *  (4) 리셋 기능을 실행하면 DB의 상품이 다시 충전된다
	 */
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String query = "UPDATE prize SET Pqty = Pqty -1 WHERE Probability BETWEEN ? AND ?";
		try {
			Class.forName(driver);
			
			try (Connection conn = DriverManager.getConnection(url, "jungjun", "1234");
				PreparedStatement pstmt = conn.prepareStatement(query);){
				
				pstmt.setInt(1,(int)Math.round(Math.random()*100));
				pstmt.setInt(2,(int)Math.round(Math.random()*100));
				
				int row = pstmt.executeUpdate();
				System.out.println(row + "번 뽑았습니다");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
