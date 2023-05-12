package test2;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		String a = "apple";
		int b = a.length();
		char[] c = new char[b];
		for(int i = 0; i < b; ++i) {
			c[i] = a.charAt(i);
			for(int j = 0; j < 100; ++j) {
				char d = c[i];
				c[i] = c[(int)Math.random()*b];
				char z = c[i];
			}
		}
		System.out.println(Arrays.toString(c));
	}
	
}
