package quiz;

import java.util.Scanner;

public class B07_Palindrome2T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		String lowercase = "";
		int len = word.length();
		
		for(int i =0; i < len; ++i) {
			char ch = word.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				ch += 32;
			}
			
			lowercase += ch;
		}
			
			String reverse = "";
			for (int i = 0; i < len; ++i) {
				reverse += lowercase.charAt(len -1 -i);
			}
			
			System.out.println(word);//원본
			System.out.println(lowercase);//소문자
			System.out.println(reverse);//뒤집은 소문자
			
			System.out.println(lowercase.equals(reverse));//뒤집은 소문자가 일치하는지
	}
}
