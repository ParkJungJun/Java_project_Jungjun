package swing.login_join_page;

public class Number_chk {
	public boolean number_chk(String num) {
		String chk = Test3.phone_number;
		boolean result = chk.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$");
		if(result) {
			return true;
		}
		return false;
	}
}
