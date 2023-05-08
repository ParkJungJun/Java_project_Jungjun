package quiz;

public class B09_Gugudan {
	/*
	 * 1. 구구단을 다음과 같이 가로로 출력해보세요
	 * 
	 * 2단: 2x1=2 2x2=4 2x3=6 ....
	 * 3단: 3x1=3 3x2=6 ...
	 * 4단: ...
	 * 
	 * 2. 구구단을 다음과 같이 세로로 출력해보세요
	 * 
	 * 2단		3단	  	4단      ...
	 * 2x1=2	3x1=3	4x1=4	...
	 * 2x2=4	3x2=6	4x2=8	...
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int gu = 2; gu <= 9; ++gu) {
			System.out.printf("%d단:\t", gu);
			for(int dan = 1; dan <= 9; ++dan) {
				System.out.printf("%dx%d=%d\t", gu, dan, gu * dan);
			}
		System.out.println();
		}
		System.out.println("==============================================================");
		for(int gu =2; gu <= 9; ++gu) {
			System.out.printf("%d단\t", gu);	
		}
		System.out.println();
		for(int dan = 1; dan <= 9; ++dan) {

			for(int gu = 2; gu <= 9; ++gu) {
				
				System.out.printf("%dx%d=%d\t", gu, dan, gu * dan);
			}
			System.out.println();
		}
		
	}

}
