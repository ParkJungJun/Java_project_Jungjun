package defult_package;
public class A04_Variablenaming {
	
	/*
	 *  # 우리가 변수를 사용하는 이유
	 *  
	 *  1. 코드의 가독성을 높일 수 있다
	 *  2. 여러곳에서 사용되는 값을 한번에 변경할 수 있다(재사용성)
	 *  
	 *  # 변수의 작명 규칙 (권장)
	 *  
	 *   1. 두 단어 이상을 이어붙인 변수를 사용할 때 _를 사용한다 (c언어 스타일, snake_case)
	 *   ex) apple_price
	 *   2. 두 단어 이상을 이어붙인 변수명을 사용할 떄 대문자를 활용한다 (자바 스타일, camelcase)
	 *   ex) applePrice
	 *   
	 *   3. 변수명의 첫 글자는 소문자를 사용해야 한다
	 *   ex) Apple(x), apple(O)
	 *   
	 *   4. 프로그램 내에서 프로그램이 꺼질때까지 변하지 않을 값은 모두 대문자를 사용한다
	 *      (상수를 저장할 변수는 모두 대문자로 표기한다)
	 *      ex) PI, APPLE_PRICE, MAX_QTY
	 *      
	 *   5. 클래스명의 첫 글자는 대문자를 사용해야 한다
	 *   ex) Apple(O), apple(X)
	 *   
	 *   6. 패키지명은 모두 소문자를 사용한다
	 *   ex)Quiz(x), quiz(O)
	 *   
	 *   7.해당 변수의 목적이나 들어있는 값을 쉽게 파악할 수 있는 단어를 사용하는 것이 좋다
	 *   ex) a1,a2,a3 (X)
	 *   
	 *  # 변수의 작명 규칙 (필수, 지키지 않으면 에러 발생)
	 *  
	 *   1. 변수의 첫 번째 글자는 숫자를 사용할 수 없다
	 *   ex) 1st, 2nd, 3rd (x)
	 *   
	 *   2. 변수명 사이에는 공백을 사용할 수 없다
	 *   
	 *   3. 특수문자는 _와 $만 사용할 수 있다 ( _ ,$는 맨 앞에 사용할 수 있다)
	 *   ex) $uper, _apple (O)
	 *   
	 *   4. 이미 자바에서 사용하고 있는 키워드들은 변수명으로 사용할 수 없다
	 *      (예악어들은 변수명으로 사용할 수 없다, Eclipse에서는 보라색으로 표시됨)
	 *      ex) public, static, void, int, double, ...
	 *      (한글은 되지만 하지 말아야 할 행동이다 영어가 생각안나면 영한사전을 키자)      
	 *  
	 */
	
	public static void main(String[] args) {
		
		int apple_qty = 23;
		int apple_price = 400;
		double apple_weight = 120.120;
		
		System.out.println("사과의 개수:" + apple_qty);
		System.out.println("사과의 개당 가격:" + apple_price);
		System.out.println("사과의 총 가격:" + apple_qty * apple_price + "원");
		System.out.println("사과의 총 무게(g):" + apple_qty * apple_weight + "g");
		
	}

}
