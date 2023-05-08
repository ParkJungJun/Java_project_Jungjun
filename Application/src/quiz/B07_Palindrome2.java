package quiz;

import java.util.Scanner;

public class B07_Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		// (1) 단어 내의 모든 대문자를 소문자로 바꾼다
		
		// (2) 거꾸로 뒤집는다
		
		// (3) 원본과 거꾸로 뒤집은 문자열이 일치하면 좌우대칭이다
		
		String lowercase = "";
		int len = word.length();
		
		for(int i =0; i < len; ++i) {
			char ch = word.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				ch += 32;
			}
			
			lowercase += ch;
		}
		String str = "";
//		System.out.print(str.charAt(len-1));
		for(int i = len - 1; i >= 0; --i) {
//			System.out.print(lowercase.charAt(i));
			str += lowercase.charAt(i);
		}
		System.out.print(str);
		System.out.print(lowercase);
		if(str .equals(lowercase)) {
			System.out.print("좌우대칭입니다");
		}else {
			System.out.print("좌우대칭아닙니다");
		}
	}

}
