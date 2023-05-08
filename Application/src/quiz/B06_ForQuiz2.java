package quiz;

import java.util.Scanner;

public class B06_ForQuiz2 {
	/*
	 *  사용자로부터 숫자를 입력받으면
	 *  0부터 해당 숫자 사이에 존재하는 모든 5의 배수를 한줄에 10개씩 출력해보세요
	 *  (단, 음수를 입력 받는 경우에도 올바르게 동작해야 합니다)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int a = 1,count = 1; a <= num; ++a) {
			if(a % 5 == 0) {
				System.out.printf("%d,[%d번째]", a , count);
				if(count++ == 10) {
					System.out.print('\n');
					count = 1;
				}
			}
			
		}
		for(int count = 1; num < 0; ++num) {
			if(num % 5 == 0) {
				System.out.printf("%d,[%d번째]", num , count);
				if(count++ == 10) {
					System.out.print('\n');
					count = 1;
				}
			}
			
		}
	}
}
