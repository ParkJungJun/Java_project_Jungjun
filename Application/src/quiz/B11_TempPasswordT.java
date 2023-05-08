package quiz;

public class B11_TempPasswordT {
	/*
	 * 65 ~ 95의 랜덤 숫자를 4개 만들어 보세요
	 * 
	 * (1) Math.random()에 숫자의 개수를 곱한다(26개, 90 -65 +1)
	 * 
	 * (2) 해당 범위에서 가장 적은 숫자를 더한다 (+ 65)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tempPassword = "";
		
		for(int i = 0; i < 4; ++i) {
			tempPassword += (char)(Math.random() * 20 + 65);
		}
		
		System.out.println("생성된 임시 비밀번호: " + tempPassword);
	}

}
