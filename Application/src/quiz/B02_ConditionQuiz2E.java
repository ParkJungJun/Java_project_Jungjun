package quiz;
import java.util.Scanner;
public class B02_ConditionQuiz2E{
	/*
	 * # 알맞은 조건식을 만들어보세요
	 * 
	 * 1. char형 변수 a가 'q' 또는 'Q'일 때 true
	 * 2. char형 변수 b가 공백이나 탭이 아닐 떄 true
	 * 3. char형 변수 c가 '0' ~ '9'일 때 true
	 * 4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	 * 5. char형 변수 e가 한글일 때 true (한글의 범위는 유니코드 검색)
	 * 6. 사용자가 입력한 문자열이 quit일 때 true
	 */
	public static void main(String[] args) {
		
		char a = 'q';
		System.out.print("문제1:\t");
		System.out.println(a == 'q' || a == 'Q');
		
		char b = 'a';
		char space = ' ';
		char tab = '\t';	
		System.out.print("문제2:\t");
		System.out.println(b != space || b != tab );
		
		char c = '5';
		
		System.out.print("문제3:\t");
		System.out.println(c >= '0' && c <= '9');
		
		char d = 'b';
		char capital_letter_a = 'A';
		char capital_letter_b = 'Z';
		char small_letter_a = 'a';
		char small_letter_b = 'z';
		System.out.print("문제4:\t");
		System.out.println(d >= capital_letter_a && d<= capital_letter_b 
						   || d >= small_letter_a && d <= small_letter_b);
		
		char e = '뉴';
		char Hangul1 = '가';
		char Hangul2 = '힣';
		System.out.print("문제5:\t");
		System.out.println(e >= Hangul1 && e <= Hangul2);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문제6:\t");
		System.out.print("문자열을 입력하세요 :");
		
		String f = sc.nextLine();
		
		System.out.printf("%s",f.equals("quit"));
		
		
		
		
	}



}

