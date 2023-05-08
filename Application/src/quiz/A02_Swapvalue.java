package quiz;

import java.util.Random;

public class A02_Swapvalue {
	public static void main(String[] args) {
		// "랜덤 번호 생성 기계"를 만든ㄴ다
		Random ran = new Random();
		
		int a = ran.nextInt(30);
		int b = ran.nextInt(30);
		
		// "랜덤 번호 생성 기계로 부터 번호를 하나씩 받아온다 (범위는 0 ~ 29)
		
		System.out.println("바꾸기 전 a: " + a);
		System.out.println("바꾸기 전 b: " + b);
		
		//코드를 추가해 두 변수의 값을 바꾸어 출력해보세요 (다른곳은 변경 불가능)
		
		int tmp = a; // 값을 덮어쓰기전에 잠깐 보관해준다
		
		a = b;
		b = tmp;
		
		System.out.println("바꾼 후 a: " + a);
		System.out.println("바꾼 후 b: " + b);
		
	}
}
