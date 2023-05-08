package quiz;

public class D09_CaesarCipher {
	/*
	 *  # 시저 암호
	 *  
	 *  - 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 암호화하는 암호 알고리즘
	 *  - 키 값만큼 평문의 모든 알파벳을 오른쪽으로 밀어주면 암호화가 되고
	 *  - 암호문을 다시 정해진 키 값만큼 왼쪽으로 밀어주면 복호화가 된다
	 *  
	 *  	ABCDEFGHIJKLNMOPQRSTUVWXYZ!@#$%^&*01012346789
	 *  	abcdefghijklnmopqrstuvwxyz[]/?;'"
	 *  					key : 7
	 *  			HELLO ---------->   OLSSV
	 */
	
	// 1. 평문과 키값이 전달되면 해당 평문을 암호문으로 만들어서 리턴해주는 메서드
	
	// 2. 암호문과 키값이 전달되면 해당 암호문을 평문으로 만들어주는 메서드
	public static void main(String[] args) {
		String result = encryption("My Message : Hello!", 13);
		//String result = encryption("A", 13);
		System.out.println(result);
		//System.out.println(keytext.length());
		System.out.println(decryption(result,13));
	}
	
	private static String decryption(String result, int i) {
		
		for(int j =0; j < result.length(); ++j) {
			ch3 = result.charAt(j);
			temp2 = ""+result.charAt(j);
			if(keytext.contains(temp2)) {
				find2 = keytext.indexOf(ch3,0);
				if(find2 - i < 0) {
					ch4 = keytext.charAt(find2 - i + result.length());
					}else {
					ch4 = keytext.charAt(find2 - i);
					}
				decryptionText += ch4;
			}else {
				decryptionText += temp2;
			}
		}
		return decryptionText;
	}

	private static String encryption(String string, int i) {
		for(int j = 0; j < string.length(); ++j) {
			ch = string.charAt(j);
			String temp = ""+string.charAt(j);
			if(keytext.contains(temp)) {	
				find = keytext.indexOf(ch,0);
				if(find + i > string.length()) {
				ch2 = keytext.charAt(find + i - string.length());
				}else {
				ch2 = keytext.charAt(find + i);
				}
				encryptionText += ch2;
			}else {
				encryptionText += temp;
			}	
		}
		return encryptionText;
	}

	static int key;
	static String keytext = "ABCDEFGHIJKLNMOPQRSTUVWXYZ!@#$%^&*01012346789"
			+ "abcdefghijklnmopqrstuvwxyz[]/?;'\"";
	static String text;
	static char ch;
	static char ch2;
	static char ch3;
	static char ch4;
	static String temp2;
	static String decryptionText = "";
	static String encryptionText = "";
	static int find;
	static int find2;
}
