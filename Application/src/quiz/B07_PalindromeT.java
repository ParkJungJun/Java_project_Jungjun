package quiz;

import java.util.Scanner;

public class B07_PalindromeT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		String lowercase = "";
		
		
		int len = text.length();
		int mid = text.length() / 2; //5 -> 0,1까지 비교해야 함
									 //6 -> 0,1,2까지 비교해야 함
		
		for(int i =0; i < len; ++i) {
			char ch = text.charAt(i);
			
			//word에서 꺼낸 문자가 대문자인 경우 소문자로 변경하여 누적시키기
			if(ch >= 'A' && ch <= 'Z') {
				ch += 32;
			}
			
			lowercase += ch;
		}
		
		boolean isPalindrome = true;
		
		for(int i = 0; i < mid; ++i) {
			char ch = lowercase.charAt(i);
			char ch2 = lowercase.charAt(len -1 -i);
			
			isPalindrome &= ch == ch2;
			
			if(ch == ch2) {
//				System.out.printf("%d번째 문자와 %d번째 문자가 일치합니다.\n",
//						i, len -1 -i);
			} else {
//				System.out.printf("%d번째 문자와 %d번째 문자가 불일치입니다.\n",
//						i, len -1 -i);
			}
		}
		System.out.println("isPalindrome 여부: " + isPalindrome);
		
	}

}
