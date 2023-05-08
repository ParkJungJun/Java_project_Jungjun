package defult_package;
public class B12_Operator04 {
	/*
	 * # 삼항 연산자
	 * 
	 * - 간단한 if문을 한 줄로 사용할 수 있는 연산자
	 * - 비교 ? 예 : 아니오;
	 * - 비교의 결과가 true이면 : 왼쪽의 값을 사용한다
	 * - 비교의 결과가 false이면 : 오른쪽의 값을 사용한다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = true ? 1: 10;
		
		System.out.println(result);
		
		// 사과의 개수가 나누어 떨어질때에는 1를 더하지 않은 값을 사용
		// 사과의 개수가 나누어 떨어지지 않을때는 1을 더한값을 사용 
		int apple = 13;
		int basket = apple % 10 == 0 ? apple / 10 : apple / 10 + 1;
		
		System.out.println("필요한 바구니의 개수는" + basket);
		
		if(apple % 10 == 0) {
			basket =apple / 10;
		} else {
			basket = apple / 10 + 1;
		}
		
		String message = apple % 10 ==0 ?
				"사과가 10으로 나누어 떨어짐" : "나누어 떨어지지 않아 1을 더합니다";
		System.out.println(message);
	}

}
