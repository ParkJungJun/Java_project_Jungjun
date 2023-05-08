package quiz;
import java.util.Scanner;
public class B03_AppleQuiz {
	/*
	 * 사과를 10개씩 담을 수 있는 바구니가 있을 떄
	 * 
	 * 사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한
	 * 바구니의 개수를 알려주는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수를 입력 : ");
		int apple = sc.nextInt();
		int basket;
		if (apple <= 10 && apple >= 1) {
			System.out.println("필요한 바구니는 1개입니다");
		}else if (apple % 10 == 0 && apple > 0) {
			basket = apple / 10;
			System.out.println("필요한 바구니는 " + basket + "개입니다");
		 }else if (apple > 10 ) {
			basket = apple / 10 + 1;
			System.out.println("필요한 바구니는 " + basket + "개입니다");
		  }else {
			  System.out.println("1이상의 값을 입력하세요");
		  }
	}
	
	
}
