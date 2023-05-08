package quiz;
/*
 * 복습은 문제의 답을 지우고 다시 풀어보는게 좋다 (며칠있다가)
 * 복기는 문제를 왜 못풀었는가를 중점으로 하는게 좋다
 * 
 * 나중에 일을 하게 될때 새로운 문제를 풀 일은 생각보다 많지 않다
 * 200문제까지는 힘들겠지만 그 이후는 기출문제 풀이 수준이다 문제은행이다
 * 문제은행이 되고 나서 응용이 된다
 */
public class A03_Personalinfo_T {
	public static void main(String[] args) {
		
		//요즘은 메모리 용량이 넉넉하기 때문에 메모리 절약을 위한 선택은 거의 하지 않는다.(byte, short,float)
		String title = "출력결과";
		String name = "홍길동";
		int age =20; 
		//정수는 int다 너무 크면 long
		//정수 앞에 0b를 붙이는 것은 2진수로 인식한다
		//정수 앞에 0을 붙이는 것은 8진수로 인식한다
		//정수 앞에 0x를 붙이는 것은 16진수로 인식한다
		String tel = "010-1234-1234";
		double height = 178.5;
		double weight = 75;
		String bloodtype = "O"; //AB가 나올수도 있으니 char를 쓰지 않는다 char는 AB를 표현하지 못한다
		
		System.out.println("========"+ title + "=======\n");
		System.out.println("이름\t:" + name);
		System.out.println("나이\t:" + age);
		System.out.println("Tel\t:" + tel);
		System.out.println("키\t:" + height);
		System.out.println("몸무게\t:" + weight);
		System.out.println("혈액형\t:" + bloodtype);
	}
}