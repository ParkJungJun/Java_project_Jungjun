package quiz;

import java.util.Scanner;

public class B07_PalindromeE {
	/*
	 * 사용자가 단어를 입력하면 해당 단어가 좌우대칭인지 판별해주는 프로그램을 만들어보세요
	 * 
	 * >>level
	 * ->좌우대칭입니다
	 * 
	 * >>Level
	 * ->좌우대칭입니다
	 * 
	 * >>apple
	 * ->좌우대칭이 아닙니다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int n = text.length();
		int count = 0;
		
		for(int i = 0; i < n; ++i) {
			char ch = text.charAt(i);
			char ch2 = text.charAt(n-1-i);
			
//			System.out.println(i);
			if(ch == ch2 || ch == ch2 + 32 || ch == ch2 - 32) {
				
				
			} else if(ch != ch2) {
				
				++count;
			}
		}
		
		if(count == 0) {
			System.out.println("좌우대칭입니다");
		} else if(count >= 1) {
			System.out.println("좌우대칭이 아닙니다");
		}
		
		
	}

}
