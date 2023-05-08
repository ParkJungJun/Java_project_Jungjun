package quiz;

import java.util.Scanner;

public class B06_countET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		int len = text.length();
		int count = 0;
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			
			if (ch == 'e' || ch == 'E') {
				++count;
			}
//			System.out.printf("%d번째 문자: %c(%d)\n", i, text.charAt(i), (int)text.charAt(i));
		}
		System.out.println("해당 문자에서 e가 등장한 횟수: " + count);
	}

}
