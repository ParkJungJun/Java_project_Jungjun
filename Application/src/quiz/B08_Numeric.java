package quiz;
import java.util.Scanner;
public class B08_Numeric {
	/*
	 * 사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
	 * 판별하는 프로그램을 만들어 보세요
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		int len = word.length();
		int count = 0;
		for(int i = 0; i < len; i++) {
			char ch = word.charAt(i);
			
			if(ch < '0' || ch > '9') {
				count = 0;
				break;
			} else if(ch >= '0' && ch <= '9') {
				++count;
			}
				
		}
		if(count >= 1) {
			System.out.print("맞습니다");
		}else {
			System.out.print("틀렸습니다");
		}
		
		
		
	}

}
