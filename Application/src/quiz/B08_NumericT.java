package quiz;

import java.util.Scanner;

public class B08_NumericT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean value = true;
		
		value = value && false; // value &= false;
		value = value && true; // 이미 false이기때문에 true가 안된다
		value = value || true; // 다시 true로 전환
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		boolean onlyNumber = true;
		
		for(int i = 0; i < text.length(); ++i) {
			char ch = text.charAt(i);
			
			onlyNumber &= ch >= '0' && ch <= '9';
			
			if(!onlyNumber) {
				break;
			}
			
//			System.out.printf("%c는 숫자입니까? %s\n",ch, ch >= '0' && ch <= '9');
		}
		
		System.out.println(onlyNumber);//숫자만인가?
	}

}
