package quiz;

public class D09_CaesarCipherT {
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
	
	static String charset = "ABCDEFGHIJKLNMOPQRSTUVWXYZ!@#$%^&*01012346789"
			+ "abcdefghijklnmopqrstuvwxyz[]/?;'\"" + " ";
	
	public static String encryption(String message, int key) {
		
		StringBuilder sb = new StringBuilder(message);
		
		int len = sb.length();
		
		for(int i = 0; i < len; ++i) {
			char ch = sb.charAt(i);
			
			int index = charset.indexOf(ch);
			
			if(index != -1) {
				sb.setCharAt(i,
						charset.charAt((index + key) % charset.length()));
			}
		}
		
		return sb.toString();
	}
	
	public static char encryption(char ch, int key) {
		int index = charset.indexOf(ch);
		
		if(index == -1) {
			return ch;
		}
		
		return charset.charAt((index + key) % charset.length());
	}
	
	public static String decryption(String message, int key) {
		StringBuilder sb = new StringBuilder(message);
		int len = sb.length();
		int len2 = charset.length();
		key = key % len2;
		
		for (int i = 0; i <len; ++i) {
			int index = charset.indexOf(sb.charAt(i));
			
			if(index != -1) {
				sb.setCharAt(i,
						charset.charAt((
								index - key + len2) % len2));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String result = encryption("Hello World!!",13);
		System.out.println("암호화 결과: " + result);
		System.out.println("복호화 결과: " + decryption(result,13));
	}
	
}
