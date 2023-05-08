package quiz;

import java.util.Scanner;

public class B07_ChangeCase {
	
	/*
	 * 사용자가 문장을 입력하면
	 * 대문자는 소문자로 소문자는 대문자로 출력해보세요
	 * (영어가 아닌 문자는 그대로 출력)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int len = text.length();
		
		for(int i = 0; i < len; ++i) {
			if(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
				System.out.print((char)(text.charAt(i)+32));
			}
			else if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				System.out.print((char)(text.charAt(i)-32));
			}else {
				System.out.print(text.charAt(i));
			}
			
		}
		
	}

}
