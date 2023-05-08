package defult_package;
public class B05_Operator03 {
	/*
	 * # 대입 연산자
	 * 
	 * 	=: 왼쪽에 변수의 오른쪽의 값을 넣는다
	 * 
	 * #복합 대입 연산자
	 * 
	 * += : 왼쪽의 변수에 오른쪽의 값을 더해 누적시킨다
	 * -= : 왼쪽의 변수에 오른쪽의 값을 빼서 누적시킨다
	 * *= : 왼쪽의 변수에 오른쪽의 값을 곱해서 누적시킨다
	 * /= : 왼쪽의 변수에 오른쪽의 값을 나눠서 누적시킨다
	 * %= : 왼쪽의 변수에 오른쪽의 값을 나는 나머지를 저장한다
	 * 
	 * #단항 연산자
	 * 
	 * ++ : 해당 변수에 1을 더해 누적시킨다
	 * -- : 해당 변수에서 1을 뺀 후 누적시킨다
	 * 
	 * # 단항 연사자의 위치에 따른 차이
	 * - 단항 연산자가 변수의 뒤에 붙어있는 경우
	 *   해당 줄의 모든 명령이 끝난 후 값을 변화시킨다
	 * ex) a++ a--
	 * - 단항 연산자가 변수의 앞에 붙어있는 경우
	 *   해당 줄의 명령어를 실행하기 전에 값을 먼저 변화시킨 후 명령을 실행한다 
	 * ex) ++a --a
	 */
	public static void main(String[] args) {
		
		int min = 30;
		min = min + 10; //(40)
		min+= 10;//위의 것과 같음 (50)
		System.out.println(min); //50
		
		int a = 20;
		a+= 5;
		System.out.println(a); //25
		
		a*= 3;
		System.out.println(a); //75
		
		a-= 25;
		System.out.println(a); //50
		
		a %= 8;
		System.out.println(a); // 2
		
		a /= 0.5;
		System.out.println(a); // 4
		//boolean 타입의 복합 대입 연산도 존재한다
		boolean valid = true;
		
		valid &= false;
		System.out.println(valid);
		valid |= true;
		System.out.println(valid);
		valid ^= true; // XOR : 두개가 다르면 true 같으면 false
		System.out.println(valid);
		
		int b = 30;
		
		b++;
		System.out.println(b); // 31
		b++;
		System.out.println(b); // 32
		b++;
		System.out.println(b); // 33
		b++;
		System.out.println(b); // 34
		b++;
		System.out.println(b); // 35
		b--;
		System.out.println(b); // 34
		
		int c = 10;
		System.out.println(c--);
		System.out.println(c);
	}
}
