package quiz;

public class C01_FunctionQuiz {
	/*
	 * # 다음 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 * 
	 * 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 * 
	 * 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 * 
	 * 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 * 
	 * 4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	 * 
	 * 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 * 
	 * 6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하는 함수
	 */
	public static boolean alphabet(char a) {
		
		boolean bet = false;
		
		if(a >= 'A' && a <='Z' || a >= 'a' && a <= 'z') {
			bet = true;
			return bet;
		}else {
			bet = false;
			return bet;
		}
		
	}
	public static boolean num(int a) {
		boolean three = false;
		if(a % 3 == 0) {
			three = true;
			return three;
		}else {
			three = false;
			return three;
		}
	}
	
	public static String num2(int a) {
		String aa = "짝수입니다";
		String bb = "홀수입니다";
		if(Math.abs(a) % 2 == 0 || a == 0) {
			return aa;
		}else {
			return bb;
		}
		
	}
	
	public static int a(int a1) {
		int a = 0;
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===문제 1번===");
		boolean result = alphabet('f');
		System.out.println(result);
		boolean result1 = alphabet('0');
		System.out.println(result1);
		boolean result2 = alphabet('B');
		System.out.println(result2);
		System.out.println("===문제 2번===");
		boolean result3 = num(12);
		System.out.println(result3);
		boolean result4 = num(1);
		System.out.println(result4);
		System.out.println("===문제 3번===");
		String result5 = num2(0);
		System.out.println(result5);
		String result6 = num2(-2);
		System.out.println(result6);
		String result7 = num2(3);
		System.out.println(result7);
		System.out.println("===문제 4번===");
		
	}

}
