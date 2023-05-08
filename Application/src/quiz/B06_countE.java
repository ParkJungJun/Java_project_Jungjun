package quiz;

public class B06_countE {
	public static void main(String[] args) {
		
		/*
		 * 사용자가 문장을 입력하면 해당 문장에 알파벳 e가 몇번이나 등장하는지
		 * 알려주는 프로그램을 만들어보세요
		 * (대/소문자 모두 세여야 함)
		 */
//		String data = "ABCDEFG";
//		
//		// "".charAt() : 문자열의 한 글자를 꺼내오기, 맨 앞 글자가 0번
//		System.out.println(data.charAt(0));
//		System.out.println(data.charAt(1));
//		System.out.println(data.charAt(2));
//		
//		// "", length() : 문자열의 전체 길이를 알아내기
//		System.out.println(data.length());
		String a = "eeeEEE";
		char e1 = 'e';
		char e2 = 'E';
		int b = a.length();
		int count = 0;
		for (int i = 0; i < b; ++i) {
			if(a.charAt(i)== e1) {
				count += 1;
			} else if(a.charAt(i)== e2) {
				count += 1;
			}
		}
		System.out.print(count);
	}
	
}
