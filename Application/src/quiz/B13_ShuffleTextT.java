package quiz;

public class B13_ShuffleTextT {
	/*
	 * 사용자로부터 단어를 입력받으면
	 * 해당 단어를 랜덤으로 뒤섞어 출력해주는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "pineapplepie";
		// used 배열은 false로 초기화가 되어있다
		boolean[] used = new boolean[word.length()];
		// String은 char[]으로 변환할 수 있다
		char[] wordArr = new char[word.length()];
		
		for (int i = 0; i < word.length(); ++i) {
			wordArr[i] = word.charAt(i);
		}
		
		//char[] wordArr = word.toCharArray();
		
		//랜덤 위치의 값을 랜덤의 값과 교체한다
		for (int i =0; i < 100; ++i) {
			//"문자열".length():문자열의 길이를 구한다
			//배열.length: 배열의 길이를 구한다. 뒤에 ()를 안붙여도 된다 
			int randomIndex = (int)(Math.random() * wordArr.length);
			char temp =wordArr[0];
			wordArr[0] = wordArr[randomIndex];
			wordArr[randomIndex] = temp;
		}
		System.out.println(wordArr);
		
//		String result = "";
//		
//		while (result.length() != word.length()) {
//			// 랜덤 인덱스를 하나 고르고
//			int randomIndex = (int)(Math.random() * word.length());
//			
//			//해당 인덱스의 문자를 사용한적이 없다면
//			if(!used[randomIndex]) {
//				//해당 문자를 result에 더하고 '사용했음'으로 표시를 해놓는다
//				result += word.charAt(randomIndex);
//				used[randomIndex]= true;
//			}
//			
//		}
		//System.out.print(result);
	}

}
