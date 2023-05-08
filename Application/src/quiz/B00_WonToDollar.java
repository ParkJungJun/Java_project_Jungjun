package quiz;

import java.util.Scanner;

public class B00_WonToDollar {

	/*
	 * 한국 돈을 입력하면 달러로 얼마인지 출력해주는 프로그램을 만들어보세요
		(환률은 구글검색)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Ctrl + Shift + O : 자동 import 단축키
		
		System.out.print("값을 입력하세요: ");
		int won = sc.nextInt(); //double이 아닌 int를 사용하는게 좋다 한국돈은 0.1단위가 없으니까
		double dollar = won * 0.00077;
		
		System.out.printf("%d￦은 달러 %f＄입니다.", won, dollar);
	}
}
