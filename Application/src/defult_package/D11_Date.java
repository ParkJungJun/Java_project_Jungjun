package defult_package;

import java.util.Date;

public class D11_Date {
	/*
	 *  # java.util.Date
	 *  
	 *  - 시간 및 날짜 정보를 보관할 수 있는 클래스
	 *  - 오래된 클래스이기 때문에 데이터를 보관하는 용도로만 사용하고 
	 *    메서드는 잘 사용하지 않는다
	 *  
	 *  
	 */
	public static void main(String[] args) {
		//아무것도 안넣고 생성하면 현재 시간
		Date d1 = new Date();
		System.out.println(d1);
		
		// Long타입 값을 전달하여 유닉스 타임으로 시간을 생성
		Date d2 = new Date(100000000000L);
		System.out.println(d2);
		
		/*
		 * System.currentTimeMillis() : 시스템으로부터 현재 유닉스 타임을 받아온다
		 * ※ Unix Time - 1970년 1월 1일 이후로 시간이 얼마나 흘렀는지 1/1000초로 센 것
		 */
		System.out.println("현재 시간: " + System.currentTimeMillis());
		
		System.out.println("Unix Time 0:" + new Date(0L));
		System.out.println("Unix Time -500000000000: " + new Date(-500000000000L));
		System.out.println("Unix Time +500000000000: " + new Date(500000000000L));
		System.out.println("Unix Time 현재 시간: " + new Date(System.currentTimeMillis()));
		
		Date now = new Date();
		Date longtimeAgo = new Date(0L);
		
		// date.after(anotherDate) : 해당 시간이 전달한 시간보다 뒤인지 물어본다
		System.out.println(now.after(longtimeAgo));
		
		// date.before(anotherDate): 해당 시간이 전달한 시간보다 앞인지 물어본다
		System.out.println(now.before(longtimeAgo));
		
		//date.getTime(): 해당 인스턴스로부터 유닉스 타임을 꺼낸다
		System.out.println(now.getTime());
		
		// date.setTime(long) : 전달한 유닉스 타임으로 시간을 변경한다
		Date children = new Date();
		while(children.getMonth() != 4 || children.getDate() != 5) {
			long time = children.getTime();
			children.setTime(time + 1000 * 60 * 60 * 24);
		}
		System.out.println(children);
		System.out.println("---------------------------");
		// 1970년 1월 1일 오전 9시부터 10번째 일요일을 찾아서 출력해보세요
		
		Date sunday10th = new Date(0L);
		int oneday = 1000*60*60*24;
		int count = 0;
		while (sunday10th.getDay() != 0 || count < 10 ) {
			sunday10th.setTime(sunday10th.getTime() + oneday);
			if(sunday10th.getDay() == 0) {
				System.out.println((count+1) + "번째 일요일 발견" + sunday10th);
				++count;
			}
		}
		// 일요일 번호 찾기 (0이 일요일이다)
//		for(int i = 0; i < 10; ++i) {
//			System.out.println(sunday10th.getDay());
//			sunday10th.setTime(sunday10th.getTime() + oneday);
//		}
		System.out.println("---------------------------");
		Date d = new Date(0L);
		int day = 1000*60*60*24;
		int cnt = 0;
		while(d.getDay() != 0 || cnt < 10) {
			d.setTime(d.getTime() + day);
			if(d.getDay() == 0) {
				System.out.println((cnt+1) + "번째 일요일입니다" + d);
				++cnt;
			}
		}
	}
}
