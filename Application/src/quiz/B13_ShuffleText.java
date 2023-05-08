package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_ShuffleText {
	/*
	 * 사용자로부터 단어를 입력받으면
	 * 해당 단어를 랜덤으로 뒤섞어 출력해주는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		Random ran = new Random();
		int len = word.length();
		String shuffle = "";
		
		char [] ch = new char [len];
		for(int i = 0; i < len; ++i) {
			ch [i] = word.charAt(i);
			//int word2 =(int)(Math.random() * len);
			//shuffle += word.charAt(word2);
			//System.out.println(word.charAt(i));
			
			
			
			
		}
		
		for(int i = 0; i < len; ++i) {
			
			int a = ran.nextInt(len);
			if(i != a) {
				char tmp = ch[i];
				ch [i] = ch[a];
				ch [a] = tmp;
				//System.out.println(tmp);
			}
			
		}
		System.out.println(ch);
		
		//System.out.println(shuffle);
	}

}
