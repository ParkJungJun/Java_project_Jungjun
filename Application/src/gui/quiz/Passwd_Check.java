package gui.quiz;

public class Passwd_Check {
	String pw;
	public String pw_dupli_chk(String pw) {
		if(pw.length() < 6) {
			return "6글자이상의 소문자,대문자,특수문자를 최소 하나 이상 포함해야 합니다.";
		}
		
		boolean lower = false;
		boolean upper = false;
		boolean count = false;
		for(int i = 0; i < pw.length(); ++i) {
			
			char ch = pw.charAt(i);
			if(ch>='A' && ch <='Z') {	 
				lower = true;
			}else if(ch >= 'a' && ch <='z'){
				upper = true;
			}else if(!(ch >= 'a' && ch <='z' || ch>='A' && ch <='Z') && ch >= '!' && ch <= '~') {
				count = true;
			}
		}
		if(!(lower && upper && count)) {
			return "6글자이상의 소문자,대문자,특수문자를 최소 하나 이상 포함해야 합니다.";
		
		}else {
			this.pw = pw;
			return "check";
		}
		
	}
	public String pw_double_chk(String pw2) {
		if(pw.hashCode() == pw2.hashCode()) {
			return "비밀번호 일치";
		}else {
			return "비밀번호 불일치";
		}
	}	
		
}
