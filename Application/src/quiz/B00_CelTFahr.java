package quiz;

import java.util.Scanner;


public class B00_CelTFahr {
	/*
	 * 사용자가 섭씨(℃)온도를 입력하면 화씨(Ｆ)로 몇도인지
	 * 알려주는 프로그램을 만들어보세요 (온도 변환 공식은 구글링)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨℃를 입력하세요: ");
		double celsius = sc.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.printf("섭씨 %.3f℃는 화씨 %.3fＦ입니다.", celsius, fahrenheit);
		
	}
	
	
}
