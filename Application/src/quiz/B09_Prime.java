package quiz;

import java.util.Scanner;

public class B09_Prime {
	/*
	 * ※ 소수(prime) : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
	 * 
	 *  사용자가 정수를 입력하면
	 *  1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력해보세요
	 *  
	 *  >> 10
	 *  2,3,5,7
	 *  
	 *  >> 20
	 *  2,3,5,7,11,13,17
	 *  
	 *  ※사용자가 1이하의 정수를 입력하는 경우 다시 입력하게 만들 것
	 *  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i <= 1) {
			System.out.println("다시 입력하세요");
			int i2 = sc.nextInt();
		}
		int count = 0;
		for(int a = 1; a <= i; ++a) {
			for(int b = 1; b <= a; ++b) {
				if(a % b == 0) {
					++ count;					
				}
				if(count != 2) {
					continue;
				}else if (count == 2){
					count = 0;
					System.out.printf("%d ", a);
					
				}
				
			}
		}
		
		
		
	}

}
