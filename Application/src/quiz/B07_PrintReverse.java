package quiz;

import java.util.Scanner;

public class B07_PrintReverse {
	/*
	 *  사용자가 어떤 문장을 입력했을 때 해당 문장을 거꾸로 출력해보세요
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int i = text.length();
		for (int index = i; index > 0; --index) {
			System.out.printf("%c", text.charAt(index-1));
		}
	}

}
