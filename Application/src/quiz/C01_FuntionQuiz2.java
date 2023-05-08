package quiz;
import java.util.Arrays;
public class C01_FuntionQuiz2 {
	/*
	 * 1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 함수
	 * 
	 * 2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	 * 
	 * 3. 문자열을 전달하면 해당 문자열을 거꾸로 한 문자열을 반환하는 함수
	 * 
	 * 4. 매서드를 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 함수
	 */
	public static int basketQty(int apple, int basketSize) {
		
		if(apple % basketSize == 0) {
			return apple / basketSize;	
		}else {
			return apple / basketSize +1;
		}
	}
	
	public static char[] randomText(String text) {
		char[] textArr = new char[text.length()];
		for (int i = 0; i < text.length(); ++i) {
			textArr[i] = text.charAt(i);
		}
		for (int i =0; i < 100; ++i) {
			int randomIndex = (int)(Math.random() * textArr.length);
			char temp =textArr[0];
			textArr[0] = textArr[randomIndex];
			textArr[randomIndex] = temp;
		}
		return textArr;
	}
	public static String randomText2(String text) {
		String text2 = "";
		for (int i = text.length() -1; i >= 0; --i) {
			text2 += text.charAt(i);	
		}
		return text2;
	}
	public static int[] lotto() {
		int[] seven = new int[7];
		for(int i = 0; i < seven.length; ++i) {
			seven[i] = (int)(Math.random() * 45) +1;
			for(int j = 0; j < i; ++j) {
				if(seven[j] == seven[i]) {
//					seven[i] = (int)(Math.random() * 45) +1;
//					j = -1;
					--i;
				}
			}
		}
		return seven;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("필요한 바구니의 개수는 " + basketQty(125,8));
		System.out.println(randomText("i am a good boy"));
		System.out.println(randomText2("i am a good boy"));
		System.out.println(Arrays.toString(lotto()));
	}

}
