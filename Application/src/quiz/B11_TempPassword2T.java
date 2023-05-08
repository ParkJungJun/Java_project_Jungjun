package quiz;

public class B11_TempPassword2T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PASSWORD_CHARSET ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "abcdefghijkmnopqrstuvwxyz"
				+ "0123456789!@#$%^&*()-_+:;";
		String password= "";
		// 0 ~ lenght - 1 사이의 랜덤 숫자를 만들어야 한다
		for(int i = 0; i < 6; ++i) {
			int randomIndex = 
					(int)(Math.random() * PASSWORD_CHARSET.length());
		
			password += PASSWORD_CHARSET.charAt(randomIndex);
		}
		System.out.println(password);
		
	}

}
