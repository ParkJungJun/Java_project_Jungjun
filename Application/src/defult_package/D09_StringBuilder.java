package defult_package;

public class D09_StringBuilder {
	/*
	 * # StringBuilder
	 * 
	 * - 문자열을 조립할 때 쓰는 기능들이 모여있는 클래스
	 * - 문자열에 += 연산을 통해 문자열을 조립하는 것보다 속도가 훨씬 빠르다
	 */
	public static void main(String[] args) {
		String str = "";
		
		str += 'a';
		str += 'b';
		
		StringBuilder sb = new StringBuilder();
		
		sb.append('a');
		sb.append('b');
		sb.append('c');
		sb.append('d');
		sb.append('d');
		sb.append('d');
		sb.append('d');
		// 다 만들고 나면 toString();
		String s = sb.toString(); 
		System.out.println(sb);
		// reverse() : 조립하면 문자열을 뒤집는다
		sb.reverse();
		System.out.println("-----------------------------------------");
		System.out.println(sb);
		
		//delete(start, end) : 원하는 만큼 문자를 지운다 (start 이상 , end 미만)
		sb.delete(3, 5);
		System.out.println("-----------------------------------------");
		System.out.println(sb);
		// substring(start, end) : 조립하면 문자열을 잘라서 반환한다 (원본은 그대로 남아있음)
		System.out.println("-----------------------------------------");
		String sub = sb.substring(3,5);
		System.out.println(sb);
		System.out.println(sub);
		
		// 다른 타입 값도 추가 가능 (해당 타입의 toString() 결과를 추가)
		sb.insert(3,true);
		sb.append(false);
		System.out.println("-----------------------------------------");
		System.out.println(sb);
		
		
	}

}
