package quiz;

import javax.lang.model.SourceVersion;

public class D04_isJavaVariableT {
	/*
	 * 문자열을 매개변수로 전달하면 해당 문자열이 자바 변수로 사용할 수 있는 문자열인지
	 * 검사해주는 메서드를 만들어보세요
	 */
	public static boolean valid(String text) {
		if(SourceVersion.isKeyword(text)) {
			System.out.println("예약어라서 안됩니다.");
			return false;
		}
		if(!Character.isJavaIdentifierStart(text.charAt(0))) {
			System.out.println("첫번째 문자가 문제입니다");
			return false;
		}
		for(int i = 1; i < text.length(); ++i) {
			if(!Character.isJavaIdentifierPart(text.charAt(i))) {
				System.out.println((i + 1) + "번째 문자가 문제입니다");
				return false;
			}
		}
		System.out.println("문제가 없습니다");
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		valid("abc#");
		valid("7evlen");
		valid("advcwd");
		valid("int");
		// SourceVersion.isKeyword(str) : 전달한 문자열이 예약어인지 검사해준다
		System.out.println(SourceVersion.isKeyword("int"));
	}

}
