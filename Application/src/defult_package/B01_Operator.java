package defult_package;
public class B01_Operator{
	
	/*
	 *  # 연산자 (Operator)
	 *  
	 *  - 계산할 때 값과 함께 사용하는 것
	 *  - +, - , *, /, >, < , >=, <=, ...
	 *  
	 *  # 산술 연산자
	 *  
	 *   + : 더하기
	 *   - : 빼기
	 *   * : 곱하기
	 *   / : 나누기
	 *   % : 나머지
	 *  
	 *  ※ 나누기는 정수끼리 나누면 몫만 구하고, 실수가 포함되어 있으면 정확한 값을 구한다 
	 *  
	 */
	
	public static void main(String[] args) {
		int a = 13, b = 10;
		double c = 13.0, d = 10.0;
		System.out.println("a + b:" + (a + b));
		System.out.println("a - b:" + (a - b)); // 괄호가 없을시 생기는 오류는
		System.out.println("a * b:" + a * b); // 왜 String - int 를 빼냐고 물어보는 오류문
		System.out.println("a / b:" + a / b + "\t(정수/정수)"); //정수/정수
		System.out.println("a / c:" + a / d + "\t(정수/실수)"); //정수/실수
		System.out.println("a / b:" + c / d + "\t(실수/실수)"); //실수/실수
		System.out.println("a % b:" + a % b);
		System.out.println(55 % 55); //나머지 값
		
		//n으로 나눈 나머지는 0부터 n-1까지밖에 나올 수 없다 ex) n이 5일경우는 0~4까지 나머지는 나온다 
		System.out.println(0 % 3);
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		
		// Math.pow(a, b) : a 제곱 b를 구해서 반환하는 함수 (결과가 나온다)
		
		double result = Math.pow(5, 3);
//		double result2 = System.out.println("hello"); 대입되는 함수가 있고 안되는 함수가 있다
		System.out.println((int)result);
		System.out.println((int)Math.pow(3, 3));
		
		//Math.sqrt(a) : a의 제곱근을 구해서 반환하는 함수
		System.out.println("25의 제곱근: " +Math.sqrt(25));
		System.out.println("26의 제곱근: " +Math.sqrt(26));
		System.out.println("27의 제곱근: " +Math.sqrt(27));
		System.out.println("36의 제곱근: " +Math.sqrt(36));
		System.out.println("49의 제곱근: " +Math.sqrt(49));
		
		
		// Math.abs(a) : a의 절대값을 구해서 반환하는 함수
		int abs;
		
		// 대입을 먼저 한 후 println()에 전달
		System.out.println(Math.abs(99));
		System.out.println(abs = Math.abs(-99));
		System.out.println(abs);
		
		// Math.round(a) : a를 소수 첫째 자리에서 반올림한 결과를 반환한다
		System.out.println("반올림: " + Math.round(99.555555));
		
		// Math.ceil(a) : a를 소수 첫째 자리에서 올린 결과를 반환한다 (천장)
		System.out.println("올림: " + Math.ceil(99.1));
		
		// Math.floor(a) : a를 내린 결과를 반환한다 (바닥)
		System.out.println("내림: " + Math.floor(99.999999999));
		
		// # 원하는 자리에서 반올림(올림,내림)하는 방법
		//  - 반올림 하고 싶은 자리를 소수 첫 번째 자리로 만든 후 다시 나눈다
		// - 나눌 때는 정수로 나누면 몫을 구하므로 실수로 나눠야 한다
		double value = 123.1234567;
		
		System.out.println(Math.round(value * 10) / 10.0);
		System.out.println(Math.round(value * 100) / 100.0);
		System.out.println(Math.round(value * 1000) / 1000.0);
		System.out.println(Math.round(value * 10000) / 10000.0);
		
		// #123.55555를 2번째 자리까지만 남기기
		
		// (1) 123.55555에 100을 곱한다 => 12355.555
		System.out.println(value * 100);
		
		// (2) Math.round()는 소수 첫 번째 자리에서만 반올림 할 수 있다
		System.out.println(Math.round(value * 100));
		
		// (3) 아까 100을 곱했었으니까 다시 100으로 나눈다
		//     근데 정수로 나누면 정수가 되니까 100.0으로 나눈다
		System.out.println(Math.round(value * 100)/ 100.0);
		
	}
	
	
}
