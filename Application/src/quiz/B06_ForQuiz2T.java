package quiz;

import java.util.Scanner;

public class B06_ForQuiz2T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean minus = num < 0;
		num = Math.abs(num);
		//숫자의 자릿수 구하기
		int size = 0;
		for (int i = num; i > 0; i /=10) {
			++size;
		}
		
		for (int i = 0, count = 1; i <= num; ++i) {
			
			if (i % 5 == 0) {
				
				if(!minus) {
					String format = "%" + size + "d ";
					System.out.printf(format, i);
				} else {
				System.out.printf("-%" + size + "d ", i);
//				System.out.printf("%d ",-i);
				}
				
				if (count++ == 10) {
					System.out.println();
					count = 1;
				}
			}
		}
	}
}
