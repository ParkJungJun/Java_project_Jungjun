package quiz;

import java.util.Scanner;

public class D08_isPhoneNumber {
	/*
	 * 사용자로부터 입력받은 문자열이
	 * 유효한 핸드폰 번호인지 검사하는 메서드를 만들어보세요
	 */
	public static void main(String[] args) {
	
		String fristNumber = "010";
		boolean isPhoneNumber = false;
		Scanner sc = new Scanner(System.in);
		String ph = sc.next();
		int len  = ph.length();
		char num;
		
		if(ph.startsWith(fristNumber) && ph.contains("-") && len == 13) {
			for(int i = 0; i < len; ++i) {
				if(!(i == 3 || i == 8)) {
					num = ph.charAt(i);
					if(!(num >= '0' && num <= '9')) {
					isPhoneNumber = false;
					break;
					}
				}else {
					isPhoneNumber =	true;
				}
			}
		}
		System.out.println("유효한 핸드폰 번호인가요? " + isPhoneNumber);
	}

}
