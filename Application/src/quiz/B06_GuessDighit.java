package quiz;

import java.util.Scanner;

public class B06_GuessDighit {
	/*
	 * 사용자가 어떤 숫자를 입력하면 (int타입)
	 * 해당 숫자가 몇 자리 숫자인지 알려주는 프로그램을 만들어보세요
	 * 
	 * 123456 -> 6
	 * 1111 -> 4
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = Math.abs(num);
		int b = 0;
		if(a < 10) {
			b = 1;
			System.out.print(b);
		} else if (a <100){
			b = 2;
			System.out.print(b);
		} else if (a < 1000) {
			b = 3;
			System.out.print(b);
		} else if (a < 10000) {
			b = 4;
			System.out.print(b);
		} else if (a < 100000) {
			b = 5;
			System.out.print(b);
		} else if (a < 1000000) {
			b = 6;
			System.out.print(b);
		} else if (a < 10000000) {
			b = 7;
			System.out.print(b);
		} else if (a < 100000000) {
			b = 8;
			System.out.print(b);
		} else if (a < 1000000000) {
			b = 9;
			System.out.print(b);
		} else {
			b = 10;
			System.out.print(b);
		}
		
	}

}
