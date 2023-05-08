package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.OjdbcConnection;

public class J03_practice {
	/*
	 *  (1) sqlDeveloper로 DB에 새 계정을 추가한다
	 *  
	 *  (2) 해당 계정에 새 테이블을 추가한다 (주제 자유, 컬럼 4개 이상,컬럼 타입 Date가 반드시 포함되어야 함)
	 *  
	 *  (3) 해당 테이블에서 사용할 시퀀스를 생성한다
	 *  
	 *  (4) 프로그램을 실행하면 해당 테이블에 INSERT를 진행한다
	 *  
	 *  (5) SqlDeveloper에서 INSERT가 잘 되었는지 확인한다
	 */
	public static void main(String[] args) {
		String query = "INSERT INTO ice_cream VALUES(?,?,?,ice_cream_seq.nextval)";
		
		try(
			Connection conn = OjdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
		){
			pstmt.setString(1, "메로나");
			pstmt.setInt(2, 800);
			pstmt.setDate(3, java.sql.Date.valueOf("2023-03-17"));
			//pstmt.setInt(4, 4);
			int row = pstmt.executeUpdate();
			System.out.println(row + "행이 추가되었습니다");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
