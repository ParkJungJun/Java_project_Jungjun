package quiz;

import java.util.Arrays;

public class C01_FuntionQuiz2T {
	/*
	 * 1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 함수
	 * 
	 * 2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	 * 
	 * 3. 문자열을 전달하면 해당 문자열을 거꾸로 한 문자열을 반환하는 함수
	 * 
	 * 4. 매서드를 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 함수
	 */
	public static int howManyBasket(int apple, int size) {
		return (int) Math.ceil(apple/(double)size);
	}
	
	public static String shuffleText(String text) {
		// 중복없이 text의 모든 인덱스를 한번씩 뽑아주면 됨
		String shuffled = "";
		int len = text.length();
		boolean[] used = new boolean[len];
		while(shuffled.length() != len) {
			
			int randomIndex = (int)(Math.random() * len);
			
			if(!used[randomIndex]) {
				shuffled += text.charAt(randomIndex);
				used[randomIndex] = true;
			}
		}
		return shuffled;
	}
	
	public static String reverseText(String text) {
		String reversed = "";
		
		int len = text.length();
		
		for(int i = len -1; i >= 0; --i) {
			reversed += text.charAt(i);
		}
		return reversed;
	}
	
	public static int[] lotto() {
		int[] lotto = new int[7];
		
		for(int i = 0; i <lotto.length; ++i) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j <i; ++j) {
				if(lotto[i] == lotto[j]) {
					--i;
					break;
				}
			}
		}
		return lotto;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shuffleText("watermelon"));
		System.out.println(shuffleText("pineapple"));
		
		System.out.println(reverseText("안녕하세요"));
		System.out.println(reverseText("어서옵쇼"));
		
		System.out.println(Arrays.toString(lotto()));
	}

}
