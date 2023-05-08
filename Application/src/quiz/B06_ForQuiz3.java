package quiz;

public class B06_ForQuiz3 {
	/*
	 * #for문을 사용해 숫자를 다음과 같이 출력해보세요
	 * 
	 * 1. 0 3 6 9 12 ... 93 96 99
	 * 
	 * 2. -35 -28 -21 ... 0 7 14 ... 35
	 * 
	 * 3. 100 200 300 ... 800 900 1000
	 * 
	 * 4. 100 99 98 ... 5 4 3 2 1 0
	 * 
	 * 5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ... (30번)
	 * 
	 * 6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ... (30번)
	 * 
	 * 7. 7 77 777 7777 77777 ... 7777777777
	 * 							  1000000000
	 */
	public static void main(String[] args) {
		for(int num = 0; num <= 99; num += 3) {
			System.out.printf("%d ",num);
		}
		System.out.print('\n');
		for(int num = -35; num <= 35; num += 7) {
			System.out.printf("%d ",num);
		}
		System.out.print('\n');
		for(int num = 100; num <= 1000; num += 100) {
			System.out.printf("%d ",num);
		}
		System.out.print('\n');
		for(int num = -100; num <= 0; ++num ) {
			System.out.printf("%d ",Math.abs(num));
		}
		System.out.print('\n');
		for (int count = 1; count <= 30; ++count) {
			for (int num = 1; num <= 9; ++num) {
				System.out.printf("%d,(%d) ",num,count);
			}
		}
		System.out.print('\n');
		for (int count = 1; count <= 30; ++count) {
			for (int num = -10; num <= -1; ++num)
				System.out.printf("%d,(%d) ",Math.abs(num),count);
		}
		System.out.print('\n');
//		long tmp = 0;
//		for(long num = 1; num <= 1000000000; num *= 10 ) {	
//		
//				tmp += num * 7;
//				
//				System.out.printf("%d ",tmp);
//				
//		}
		
		
	}
}
