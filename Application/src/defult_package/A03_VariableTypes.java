package defult_package;
public class A03_VariableTypes {
	
	/*
	 * #정수 타입들
	 * 
	 * -byte 	(1byte, 8bit)
	 * 
	 *  2^8(256)가지의 값을 표현할 수 있음
		byte타입 변수에 넣을 수 있는 정수의 범위는 -128 ~ +127
	 * 
	 *  0000 0000 : 0
	 *  0000 0001 : 1
	 *  ...
	 *  0111 1111 : 127
	 *  1000 0000 : -128 맨앞의 숫자가 1이면 음수가 되고(0이면 양수) 숫자를 뒤집는다 0111 1111 + 1을 더한다
	 *  1000 0001 : -127 뒤집는다 0111 1110 + 1
	 *  
	 * -short 	(2byte, 16byte)
	 * 
	 *  2^16(65536)가지의 값을 표현할 수 있음
	 *  short타입 변수에 넣을 수 있는 정수의 범위는 -32,768 ~ 32,767
	 * -char 	(2byte, 양수만)
	 * 
	 *  2^16(65536)가지의 값을 표현할 수 있음
	 *  char타입 변수에 넣을 수 있는 정수의 범위는 0 ~ 65535
	 * 
	 * -int 	(4byte)
	 * 
	 *  2^32(약 43억)가지의 값을 표현할 수 있음...
	 *  
	 * -long 	(8byte)
	 * 
	 *  2^64...
	 *  
	 * # 실수 타입
	 * 
	 * -부동 소수점 방식을 사용한다
	 * -float  (4byte)
	 * -double (8byte)
	 * 
	 * #참/거짓 타입
	 * 
	 *  -boolean
	 *  
	 * #문자열 
	 * 
	 * -String
	 * 
	 * # 그 외 모든 클래스들 ...(아직은 이르다)
	 * 
	 */
	
	public static void main(String[] args) {
		
		//정수를 저장할 수 있는 변수 타입들
		byte byte1 = -128;
		short short1 = 123;
		
		//char타입에 저장하는 정수는 몇 번째 문자인지를 의미한다
		char char1 = 65535;
		char char2 = 50;
		char char3 = 100;
		// int의 범위는 대략 42억 (+-21억)
		int int1 = 10;
		
		// int의 범위를 넘어가는 정수 뒤에는 L을 붙여야 한다 (long타입 리터럴이라는 표시)
		long long1 = 10;
		
		//숫자 뒤에 L을 적는건 컴파일러를 위해 적는 것이다.
		//그냥 적는 정수는 기본적으로 컴파일러가 int로 인식하기 때문에 L이라고 표시로 해줘야 long이라고 인식할 수 있다
		
		char1 = 70; // char타입에 저장한 정수는 출력할 때 숫자 대신 문자가 나온다
		// 문자 타입 값은 실제로 정수값이다
		char ch1 = 'A'; //실제로 ch1에는 65가 저장된다
		char ch2 = 65;
		char ch3 = 'A'+ 5; //문자는 정수이기 때문에 정수와의 계산기 가능하다
		
		System.out.println("ch1: " + ch1);
		System.out.println("ch2: " + ch2);
		System.out.println("ch3: " + ch3);
		
		// 문자 타입은 실제로 정수값이기 때문에 다른 정수 타입에 저장해도 된다
		int i1 = 'B';
		
		System.out.println("i1 :"+ i1 );
		
		// char타입은 각 번호에 해당하는 문자를 출력하게끔 되어있다
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		
		//그냥 소수를 적는 것은 컴파일러가 double이라고 받아들이기 때문에
		// 뒤에 F라고 표시를 해줘야 float으로 인식 할 수 있다
		float float1 = 123.123F;
		double double1 = 123.123;
		
		// boolean 타입은 변수 이름이 아주 중요하다 (1는 true, 0은 false)
		boolean male = true;
		boolean female = true;
		boolean powerOn = true;
		boolean over130cm = false;
		
		// String 타입만 대문자로 시작한다
		// 대문자로 시작하는 모든 타입들을 참조형 변수 타입이라고 한다
		// 소문자로 시작하는 모든 타입들을 기본형 변수 타입이라고 한다
		String message = "문 앞에 놓고 가주세요";		
	}
}
