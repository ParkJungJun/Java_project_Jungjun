package quiz;
import java.util.Scanner;


public class B00_Agecalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 해를 입력하시오 : ");
		int num = sc.nextInt();
		int year = 2023;
		System.out.printf("당신의 한국 나이는 %d세입니다. \n", year - num + 1);
	}
	/*
	 * 사용자가 태어난 해를 입력하면 한국 나이를 알려주는 프로그램을 만들어보세요
	 * (단, 생일 계산은 하지 않습니다)
	 */
	
}
