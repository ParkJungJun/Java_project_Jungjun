package defult_package;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	 * # 정규표현식 (Regular Expression)
	 * 
	 * - 문자열이 특정 패턴과 일치하는지 검사할 수 있는 표현식
	 * - 특정 프로그래밍 언어에만 있는 것이 아닌 공통의 규칙
	 * 
	 * # 자바에서 정규표현식을 활용하기 위한 클래스
	 * 
	 * - java.util.regex.Pattern
	 */
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input)
		// : input이 regex의 패턴에 해당하는 문자열인지 검사하는 메서드
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		//[] : 해당 위치에 허용할 문자를 정의하는 정규표현식 문법
		System.out.println("---------------------------------------------");
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("[cs][lh]eep", "cleep"));
		System.out.println("---------------------------------------------");
		System.out.println(Pattern.matches("01[01697]-", "019-"));
		
		// \는 정규표현식 내부에서도 특수문법으로 활용되기때문에
		// 정규표현식에서 \\가 되도록 자바 문자열에서는 4개가 적어줘야 한다
		System.out.println("---------------------------------------------");
		System.out.println(Pattern.matches("[cs\\\\][lh]eep", "\\leep"));
		
		/*
		 * # []내부에서 사용하는 문법들
		 * 
		 * [abc] : a 또는 b 또는 c를 허용
		 * [a-z] : a 부터 z까지 모두 허용
		 * [A-Z] : A 부터 Z까지 모두 허용
		 * [a-zA-Z]: 모든 알파벳 허용
		 * [a-f&&c-g]: 두 조건을 모두 만족하는 문자만 허용 
		 */
		System.out.println("---------------------------------------------");
		System.out.println(Pattern.matches("[a-z]at", "cat"));
		System.out.println(Pattern.matches("[a-z]at", "Cat"));
		System.out.println(Pattern.matches("[a-zA-Z]at", "Cat"));
		System.out.println(Pattern.matches("[a-e&&c-y]at", "eat"));
		System.out.println(Pattern.matches("[a-e&&c-y]at", "fat"));
		
		/*
		 * # 하나로 여러 문자를 나타내는 것들
		 * . : 모든 문자 허용, [.] 또는 \.은 .만 허용한다는 뜻
		 * \d : 모든 숫자 허용
		 * \D : 숫자를 제외한 모든 것을 허용
		 * \s : 모든 공백 허용 (\t, \n, \r, ' ')
		 * \S : 공백을 제외한 모든 것을 허용
		 * \w : 일반적인 문자들을 허용([a-zA-Z0-9_와 같음])
		 * \W : \w를 제외한 모든 것을 허용
		 */
		System.out.println("---------------------------------------------");
		System.out.println(Pattern.matches(".at","#at"));
		System.out.println(Pattern.matches("[.]at","#at"));
		System.out.println(Pattern.matches("\\.at",".at"));
		System.out.println(Pattern.matches("\\.at","#at"));
		System.out.println(Pattern.matches("\\.at",".at"));
		System.out.println("---------------------------------------------");
		System.out.println(Pattern.matches("\\dat","9at"));
		System.out.println(Pattern.matches("\\Dat","9at"));
		System.out.println("---------------------------------------------");
		System.out.println(Pattern.matches("\\d\\d\\s\\d","12\t4"));
		System.out.println(Pattern.matches("\\d\\d\\s\\d","12\n4"));
		System.out.println(Pattern.matches("\\d\\d\\s\\d","12 4"));
		System.out.println(Pattern.matches("\\d\\d\\s\\d","12\r4"));
		System.out.println("---------------------------------------------");
		/*
		 *  # 해당 패턴이 적용될 문자의 개수를 지정하기
		 *  
		 *  # 정규표현식 내에서 보기좋으라고 띄어쓰기하면 에러남
		 *  .{n} : 앞의 패턴이 n개 일치해야 한다
		 *  .{n,m} : {} 앞에 패턴이 n개 이상 m개 이하 일치해야한다
		 *  .{n,} : {} 앞의 패턴이 n개 이상 일치해야 한다
		 *  .?    : ? 앞의 패턴이 0번 또는 한 번 나와야 한다
		 *  .+	  : + 앞의 패턴이 최소 한번 이상 나와야 한다
		 *  .*    : * 앞의 패턴이 0번 이상 나와야 된다
		 *  
		 *  
		 */
		System.out.println(Pattern.matches("\\d{4}[.]jpg", "1234.jpg"));
		System.out.println(Pattern.matches("a{1,4}[.]jpg", "a.jpg"));
		System.out.println(Pattern.matches("a{1,4}[.]jpg", "aa.jpg"));
		System.out.println(Pattern.matches("a{1,4}[.]jpg", "aaa.jpg"));
		System.out.println(Pattern.matches("a{1,4}[.]jpg", "aaaa.jpg"));
		System.out.println(Pattern.matches("a{1,4}[.]jpg", "aaaaa.jpg"));
		System.out.println("---------------------------------------------");
		System.out.println(Pattern.matches("b+[.]jpg", "bbbbbb.jpg"));
		System.out.println(Pattern.matches("b?[.]jpg", ".jpg"));
		System.out.println(Pattern.matches("b*[.]jpg", ".jpg"));
		System.out.println(Pattern.matches("b*[.]jpg", "b.jpg"));
		System.out.println(Pattern.matches("b*[.]jpg", "bbbbbbbbbb.jpg"));
		System.out.println(Pattern.matches("b*[.]jpg", "a.jpg"));
		System.out.println("---------------------------------------------");
		// 문법을 소괄호로 묶어서 적용하는 것이 가능
		System.out.println(Pattern.matches("([.]\\w+)?",".a"));
		//여러개 중 하나를 선택하게 만들기
		System.out.println(Pattern.matches("255|168|123","168"));
		
		// 문제1 : 해당 문자열이 핸드폰 번호인지 검사 할 수 있는 정규표현식을 만들어보세요
		//       (옛날 번호 포함)
		// 문제2 : 해당 문자열이 이메일인지 검사할 수 있는 정규표현식을 만들어보세요
		
		// 문제3 : 해당 문제열이 IP주소(IPv4)인지 검사할 수 있는 정규표현식을 만들어보세요
		//		  (0.0.0.0 ~ 255.255.255.255)
		
		System.out.println("------------------------문제 1번------------------------");
		System.out.println(Pattern.matches("01\\d-\\d{4}-\\d{4}","010-9699-3194"));
		System.out.println(Pattern.matches("01\\d-\\d{4}-\\d{4}","011-9699-3194"));
		System.out.println("------------------------문제 2번------------------------");
		System.out.println(Pattern.matches(
				"\\w+@[a-zA-Z]+(.[a-zA-Z])+","jungjun789@naver.com"));
		System.out.println(Pattern.matches(
				"\\w+@[a-zA-Z]+(.[a-zA-Z])+","jungjun1234@gmail.com"));
		System.out.println(Pattern.matches(
				"\\w+@[a-zA-Z]+(.[a-zA-Z])+","1234AAjkn@daum.net"));
		System.out.println("------------------------문제 3번------------------------");
		System.out.println(Pattern.matches(
				"([0-2]&&[0-9])[0-9].[0-2][0-9][0-9].[0-2][0-9][0-9].[0-2][0-9][0-9]",
				"100.255.000.260"));
		String IP = "170.199.255.000";
		System.out.println(Pattern.matches("[012][0-5]||[0-9]","270"));
//		if(Pattern.matches("[0-2]",IP.charAt(0))){
//				
//		}
		System.out.println("------------------------문제 1번------------------------");
		// 문제1 : 해당 문자열이 핸드폰 번호인지 검사 할 수 있는 정규표현식을 만들어보세요
		//       (옛날 번호 포함)
		String regex1 = "01[01679]-\\d{3,4}-\\d{4}";
		System.out.println(Pattern.matches(regex1, "010-1234-1234"));
		System.out.println("------------------------문제 2번------------------------");
		// 문제2 : 해당 문자열이 이메일인지 검사할 수 있는 정규표현식을 만들어보세요
		String regex2 = "[\\w\\d]+@[\\w\\d]+\\.[\\w]+(\\.[\\w]+)?";
		System.out.println(Pattern.matches(regex2,"abc213@abc.co.kr"));
		// 문제3 : 해당 문제열이 IP주소(IPv4)인지 검사할 수 있는 정규표현식을 만들어보세요
		//		  (0.0.0.0 ~ 255.255.255.255)
		System.out.println("------------------------문제 3번------------------------");
		String regex3 = "((25[0-5]|2[0-4][0-9]|1?\\d?\\d)\\.){3}"
				+ "(25[0-5]|2[0-4][0-9]|1?\\d?\\d)";
		System.out.println(Pattern.matches(regex3,"11.11.1.35"));
		
		// # Pattern - 전체 문자열이 정규 표현식과 일치하는지 검사한다
		// # Matcher - 전체 문자열을 탐색하면서 정규 표현식과 매치하는 부분을 찾는다
		String fruits = "apple/banana/kiwi/pineapple/mango/kiwi/orange"
			+ "apple/banana/redkiwi/goldkiwi/purplekiwi/watermelon";
		// 1. 전달한 정규 표현식을 컴파일하여 Pattern 인스턴스 생성
		Pattern kiwiRegex = Pattern.compile("(\\w*)(kiwi)(\\+?)");
		
		// 2. 생성한 Pattern 인스턴스를 Matcher를 생성
		//    (해당 패턴으로 검사할 문자열을 전달)
		Matcher m1 = kiwiRegex.matcher(fruits);
		
		// 3. 반복문을 통해 패턴과 매치되는 위치를 모두 찾을 수 있다
		while (m1.find()) {
			System.out.println("이번에 find()로 찾은 것"  + m1.group(1));
			System.out.println("시작 위치"  + m1.start());
			System.out.println("끝 위치"  + m1.end());
		}
	}
}
