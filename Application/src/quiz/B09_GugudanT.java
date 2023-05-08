package quiz;

public class B09_GugudanT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int gu = 2; gu <= 9; ++gu) {
			System.out.printf("%d단: ", gu);
			for(int dan = 1; dan <= 9; ++dan) {
				System.out.printf("%dx%d=%-2d ", gu, dan, gu * dan);	
			}
			System.out.println();
		}
		System.out.println();
		
		for(int gu =0; gu < 10; ++gu) {
			//한 줄의 시작
			for(int dan = 2; dan <= 9; ++dan) {
				if(gu == 0) {
					System.out.printf("%d단:\t\t", dan);
				} else {
					System.out.printf("%d x %d = %d\t", dan, gu, gu * dan);
				}
			}
			//한 줄의 끝
			System.out.println();
		}
	}

}
