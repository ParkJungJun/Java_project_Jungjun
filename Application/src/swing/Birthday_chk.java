package swing;

public class Birthday_chk {
	public boolean birthday_chk(String birthday) {
		String chk = Test3.birthday;
		boolean result = chk.matches
				("^(19[0-9][0-9]|20\\d{2})-(0[0-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$");
		if(result) {
			return true;
		}
		return false;
	}
}
