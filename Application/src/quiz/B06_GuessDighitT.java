package quiz;

import java.util.Scanner;

public class B06_GuessDighitT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int size = 0;
		for(int i =num; i > 0; i /= 10) {
			System.out.println("num" + i);
			++size;
		}
		System.out.printf("입력하신 숫자는 %d자리 숫자입니다.\n", size);
	}
}
