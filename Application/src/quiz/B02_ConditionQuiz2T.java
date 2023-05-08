package quiz;
import java.util.Scanner;
public class B02_ConditionQuiz2T {
	public static void main(String[] args) {
		char a = 'q';
		
		System.out.println(a == 'q' || a == 'Q');
		
		char b = 'a';
//		System.out.println(b != ' ' || b != '\t' );
		System.out.println(!(b == ' ' || b == '\t' ));
		
		char c = '5';
		
		System.out.println(c >= '0' && c <= '9');
		
		char d = 'b';
		System.out.println(d >= 'a' && d<= 'z' 
				   || d >= 'A' && d <= 'Z');
		// 대문자와 소문자 사이에 특수문자들이 있기때문에 유니코드 '65부터 122까지'를 쓰면 안된다
		
		char e = '뉴';
		
		System.out.println(e >= '가' && e <= '힣');
		
		Scanner sc = new Scanner(System.in);// Ctrl + Shift + O 누르면
		System.out.print("문자열을 입력하세요 :");// 맨위에 import java.util.Scanner; 생긴다
		
		String myDate = "quit";
		String f = sc.nextLine();
		
		// 참조형 변수타입의 ==은 같은 주소를 가리키고 있는지를 비교하는 것
		//equals()는 가지고 있는 실제 값이 같은지를 비교하는 것
		System.out.println(myDate == "quit");
		System.out.println(f.equals("quit"));
//		System.out.println(f == "quit"); 오답
	}
}
