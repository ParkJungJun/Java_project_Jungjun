package test2;

import java.util.Scanner;

public class Reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println(str(a));
	}
	static String str(String a){
		int b = a.length();
		String c = "";
		for(int i = b-1; i >= 0; --i){
			c += a.charAt(i);
		}
		return c;
	}
}