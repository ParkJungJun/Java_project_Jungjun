package defult_package;
public class B10_While {
	/*
	 * # while
	 * 
	 * - for문과 사용법이 약간 다른 반복문
	 * - 초기값과 증감값의 위치가 정해져 있지 않다
	 * - ()안위 내용이 true라면 {}안의 내용을 계속해서 반복한다
	 * - 증감값의 위치에 따라 결과가 달라질 수 있으므로 주의해야 한다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		//많이 쓴다 (3개)
		while (i < 10) {
			System.out.println(i++);			
		}
		System.out.println("====================");
		int i1 = 0;
		while (i1 < 10) {
			System.out.println(++i1);
		}
		System.out.println("====================");
		int i2 = 0;
		while (i2++ < 10) {
			System.out.println(i2);	
		}
		System.out.println("====================");
		int i3 = 0;
		//절때 쓰지 않음 (10이라고 써있지만 9번 반복하므로 가독성이 떨어짐)
		while (++i3 < 10) {
			System.out.println(i3);	
		}
		System.out.println("====================");
	}

}
