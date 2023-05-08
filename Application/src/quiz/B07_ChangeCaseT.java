package quiz;

import java.util.Scanner;

public class B07_ChangeCaseT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
//		System.out.println(text);
		
		for(int i = 0; i< text.length(); ++i) {
			char ch = text.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				System.out.printf("%c", ch - ('a' - 'A'));
			} else if (ch >= 'A' && ch <= 'Z') {
				System.out.printf("%c", ch + ('a' - 'A'));
			} else {
				System.out.printf("%c", ch);
			}
		}
//		System.out.println(text.charAt(0));
//		System.out.println(text.charAt(1));
//		System.out.println(text.charAt(2));
//		System.out.println(text.charAt(3));
//		System.out.println(text.charAt(4));
//		System.out.println(text.charAt(5));
	}

}
