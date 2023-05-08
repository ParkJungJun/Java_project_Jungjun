package quiz;

import java.util.Random;

public class B11_TempPassword {
	
	/*
	 * 알파벳 대문자로 구성된 랜덤 4자리 비밀번호를 생성하여 출력하는
	 * 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		for(int i = 0; i < 4; ++i) {
			System.out.print((char)(ran.nextInt(26) + 65));
		}
		
	}

}
