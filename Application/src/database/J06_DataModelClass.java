package database;

import java.sql.Connection;

public class J06_DataModelClass {
	/*
	 * # 데이터 모델 클래스
	 * 
	 * - 데이터를 담아 놓는 용도의 클래스 (DTO, Data Transfer Object)
	 * - 꺼내온 데이터를 매개변수 또는 제네릭으로 활용하기 위해 사용하는 클래스
	 * - 조회하는 데이터의 형태대로 만들어 둔다
	 * - 필드값의 접근제이자는 private으로 두고 getter와 setter를 통해 값을 접근해야 한다
	 * - 각 필드의 getter만 달아두면 해당 필드는 읽기 전용이 된다
	 * - setter를 달아 놓으면 수정이 가능한 필드가 된다
	 */
	public static void main(String[] args) {
		
		// (1) 커피의 모든 정보를 조회하여 List에 담아서 리턴하는 메서드
		CoffeeDAO c1 = new CoffeeDAO();
		System.out.println(c1.getAllcoffee());
		// (2) 가격이 3천원 이하인 커피를 조회하여 List에 담아서 리턴하는 메서드
		System.out.println(c1.showUnder3000());
		// (3) 새로운 커피를 하나 추가하는 메서드
		//	  (단, 이미 존재하는 커피는 추가할 수 없다)
		//c1.plusCoffee("ice tea", 4300); (이미 값을 넣어서 오류 남)
		// (4) 여러개의 커피를 한번에 추가하는 메서드
		//     (단, 커피 이름에 중복되는 값이 있다면 모든 Insert를 취소한다)
		
		// (5) 이미 존재하는 커피의 정보를 수정할 수 있는 메서드를 만들어주세요
		// (ex: 가격만 수정하면 다른 값들은 그대로에 가격만 수정되어야 한다)
		// (ex: 이름을 수정할 때는 중복되는 이름이 있다면 수정되지 않아야 한다)
		// Connection Pool 사용하는 방법
//		OjdbcConnectionPool cp = new OjdbcConnectionPool("hr", "1234");
//		try(OjdbcSession session1 = cp.getSession();
//			OjdbcSession session2 = cp.getSession();
//			OjdbcSession session3 = cp.getSession();){
//			Connection conn1 = session1.getConnection();
//			Connection conn2 = session2.getConnection();
//			Connection conn3 = session3.getConnection();
//			System.out.println("---- try 내부 ----");
//			cp.status();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("---- try 외부 ----");
//		cp.status();
	}
}
