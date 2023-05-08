package quiz;
import java.util.Scanner;
public class B03_FastAlarm {
	/*
	 * 사용자로부터 시간과 분을 입력 받으면
	 * 45분 이른 시간을 출력해주는 프로그램을 만들어보세요
	 * (단, 시간은 0 ~ 23 사이 분은 0 ~ 59 사이의 값이 입력되어야 한다)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간을 입력하세요 : ");
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if (!(hour < 0 || hour > 23 || min < 0 || min > 59)) {
			
			if (hour == 0 && min < 45) {
			System.out.printf(" %d시 %d분", hour + 23 , min + 15);
			}	
			else if (min >= 45) {
			System.out.printf(" %d시 %d분", hour , min - 45);
			}else if (min < 45) {
			System.out.printf(" %d시 %d분", hour -1 , min + 15);
		 }
		}
	
	}
}
