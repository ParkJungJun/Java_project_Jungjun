package quiz;

public class B10_WhileGugudan {
	// 구구단 2개를 while문으로 출력해보세요
	public static void main(String[] args) {
		int gu = 2;
		
		while(gu <= 9) {
			
			System.out.printf("%d단: ", gu);
			
			int dan = 1;
			
			while(dan <= 9) {
			
				System.out.printf("%dx%d=%-2d ", gu, dan, gu * dan);	
				dan++;
			}
			gu++;
			System.out.println();
		}
		System.out.println("==================================================");
		gu = 0;
		while(gu < 10) {
			//한 줄의 시작
			int dan = 2;
			while(dan <= 9) {
				
				if(gu == 0) {
					System.out.printf("%d단:\t\t", dan);
				} else {
					System.out.printf("%d x %d = %d\t", dan, gu, gu * dan);
				}
				dan++;
			}
			
			//한 줄의 끝
			gu++;
			System.out.println();
		}
	}
}
