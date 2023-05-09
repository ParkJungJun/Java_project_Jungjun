package swing;

public class Email_chk {
	public boolean email_chk(String email) {
		String chk_email = Test3.email;
		boolean result = chk_email.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?");
		if(result) {
			return true;
		}
		return false;
	}
}
