package test2;

import java.util.Scanner;

public class Random{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.print(ch(a));
	}
	static char[] ch(String a){
		int b = a.length();
		char[] c = new char[b];
		for(int i = 0; i < b; ++i){
		c[i] = a.charAt(i);
		}
		for(int i = 0; i < 10; ++i){
			int ran = (int)(Math.random() * b);
			char d = c[0];
			c[0] = c[ran];
			c[ran] = d;
		}
		return c;
	}
}
