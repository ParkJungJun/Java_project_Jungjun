package swing;

public class Number_chk {
	public String number_chk(String num) {
		String chk = Test3.phone_number;
		boolean result = chk.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$");
		if(result) {
			return "올바른 전화번호입니다";
		}
		return "-를 포함하여 입력하세요";
	}
}
