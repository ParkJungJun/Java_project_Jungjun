package quiz;

public class B02_ConditonQuiz_T {
	public static void main(String[] args) {
		int a =1234;
		
		boolean result1 = a > 10 && a < 20 ; // 변수가 왼쪽에 와야 한다
		System.out.println(result1);
		
		int b = 999;
		
		boolean result2 = b % 2 ==0;
		
		System.out.println(result2);
		
		int c = 77;
		
		boolean result3 = c % 7 ==0;
		
		System.out.println(result3);
		
		int d = 40, e = 70;
		
		boolean result4 = Math.abs(d -e) == 30;
//		boolean result4 = d - e == 30 || d - e ==-30;
		
		System.out.println(result4);
		
		int year = 2000;
		
		boolean isLeapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
		// &&와 ||가 나란히 있을때는 &&를 먼저 한다
		
		System.out.printf("%d년은 윤년입니까? %s\n", year , isLeapYear);
		
		boolean powerOn = false;
		
//		System.out.println(powerOn == false);
		System.out.println(!powerOn); // 이게 좀더 정확한 방법
		
		String str = "yes";
		// ※ 문자열(대문자로 시작하는 타입)은 ==으로 비교하면 안됨
//		System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		// 참조형 변수는 equals() 매서드를 보유하고 있다
		// (모든 참조형 변수는 equals() 매서드를 보유하고 있다)
		
		
		
	}
}
