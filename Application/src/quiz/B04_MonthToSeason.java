package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {
	
	/*
	 * 사용자로부터 몇 월인지 입력받으면 해당하는 계절을 출력해보세요
	 * (switch - case문으로 한번, if문으로 한번)
	 */
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		//		int month = new Scanner(System.in).nextInt(); (재사용 불가)
		// 스캐너를 만든 후 변수에 저장하지 않으면 다시 쓸 수 없다
		switch(month) {
			case 1,2,3:
				System.out.print("겨울\n");
				break;
			case 4,5,6:
				System.out.print("봄\n");
				break;
			case 7,8,9:
				System.out.print("여름\n");
				break;
			case 10,11,12:
				System.out.print("가을\n");
				break;
			default:
				System.out.print("정확한 값을 입력하세요\n");
				break;
		}
//		int month2 = new Scanner(System.in).nextInt(); (너무 많은 자원을 사용하는 것이다)
		int month1 = sc.nextInt();
		
		if(month1 >=1 && month1 <= 3) {
			System.out.print("겨울");
		}else if(month1 >=4 && month1 <= 6) {
			System.out.print("봄");
		}else if(month1 >=7 && month1 <= 9) {
			System.out.print("여름");
		}else if(month1 >=10 && month1 <= 12) {
			System.out.print("가을");
		}else {
			System.out.print("정확한 값을 입력하세요");
		}
	
	}
	
}
