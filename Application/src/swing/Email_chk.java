package swing;

public class Email_chk {
	public String email_chk(String email) {
		String chk_email = Test3.email;
		boolean result = chk_email.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?");
		if(result) {
			return "이메일을 정확히 입력하셨습니다";
		}
		return "이메일을 정확히 입력하세요";
	}
}
