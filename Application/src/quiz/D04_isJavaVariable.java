package quiz;

public class D04_isJavaVariable {
	/*
	 * 문자열을 매개변수로 전달하면 해당 문자열이 자바 변수로 사용할 수 있는 문자열인지
	 * 검사해주는 메서드를 만들어보세요
	 */
	
	public static String s1(String s) {
		boolean b1 = false;
		boolean b2 = false;
		for(int i = 0; i < s.length(); ++i) {
			if(i == 0) {
				char ch = s.charAt(i);
				b2 = Character.isJavaIdentifierStart(ch);
			}
			char ch = s.charAt(i);
			b1 = Character.isJavaIdentifierPart(ch);
			if(!b1) {
				break;
			}
		}
		if(b1 && b2) {
			return "됩니다";
		}else {
			return "안됩니다";
		}
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(s1("ip^le"));
		
		
		
	}

}
