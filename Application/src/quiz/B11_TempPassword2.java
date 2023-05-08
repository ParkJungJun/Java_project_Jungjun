package quiz;

import java.util.Random;

public class B11_TempPassword2 {
	/*
	 * 대문자, 소문자,특수문자,숫자로 구성된
	 * 랜덤 비밀번호 6자리를 생성하여 출력하는 프로그램을 만들어보세요
	 * 
	 * ※ 사용 가능한 특수문자 -!@#$%^&*()-_+=:;
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		String tempPassword = "";
		int a1 = 'A';
		int z1 = 'Z';
		int a2 = 'a';
		int z2 = 'z';
		int minus1 = z1 - a1;
		int minus2 = z2 - a2;
		char aa1 = 'A';
		char aa2 = 'a';
		int one = '1';
		int nine = '9';
		int minus3 = nine - one;
		String $ = "!@#$%^&*()-_+=:;";
		int length = $.length();
		for(int i = 0; i < 2; ++i) {
			System.out.print((char)(ran.nextInt(minus1) + aa1));			
			System.out.print((char)(ran.nextInt(minus2) + aa2));
			System.out.print((char)(ran.nextInt(minus3) + one));
			System.out.print((char)(ran.nextInt(length) + '!'));
		}
	}

}
