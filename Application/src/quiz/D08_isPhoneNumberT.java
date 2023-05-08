package quiz;

public class D08_isPhoneNumberT {
	public static boolean isPhoneNumber(String str) {
		// - 올때 : 13자리
		// - 안올때 : 11자리
		int len = str.length();
		
		if(len != 11 && len != 13) {
			System.out.println("전화번호 길이가 아닙니다");
			return false;
		}
		
		if(len == 13) {
			if(str.charAt(3) != '-' || str.charAt(8) != '-') {
				System.out.println("-위치에 이상한 문자가 있습니다");
				return false;
			}
			
			str.replace("-", "");
			
			if(str.length() != 11) {
				System.out.println("-를 제거 후 길이가 11이 아닙니다");
				return false;
			}
		}
		if(!str.startsWith("010")) {
			System.out.println("010으로 시작하지 않는 번호입니다");
			return false;
		}
		
		for(int i = 0; i < len; ++i) {
			if(Character.isDigit(str.charAt(i))) {
				System.out.println("번호 부분에 숫자가 아닌 문자가 있습니다");
			}
		}
		System.out.println("유효한 번호입니다");
		return true;
	}
	/*
	 * 사용자로부터 입력받은 문자열이
	 * 유효한 핸드폰 번호인지 검사하는 메서드를 만들어보세요
	 */
	public static void main(String[] args) {
		isPhoneNumber("123-123+-1234");
		isPhoneNumber("010-9699-3194");

	}

}
