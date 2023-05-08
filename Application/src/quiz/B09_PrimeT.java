package quiz;

import java.util.Scanner;

public class B09_PrimeT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		for (; (num = sc.nextInt()) < 2;) {
			
			System.out.printf("%d은 안됩니다. 다시 입력하세요!\n", num);
		}
		//System.out.println("소수 계산 하는 곳...");
		
		for (int target = 2; target < num; ++target) {
			//System.out.printf("이번에 소수인지 검사해야 하는 숫자: %d\n", target);
			
			boolean sosu = true;
			
			double targetRoot =Math.sqrt(target);
			// 2부터 target의 제곱근까지 나누면서 약수가 하나라도 존재하면 소수가 아니다
			for (int divider = 2; sosu && divider <= targetRoot; ++divider) {
				sosu &= target % divider != 0;
//				if (target % divider == 0) {
//					sosu =false;
//					break;
//				}
			}
			
			if(sosu) {
				System.out.printf("%d(sosu)\n", target);
			}else {
				//System.out.printf("%d(not sosu)\n", target);
			}
//			int yaksucount = 0;
//			
//			//divider을 1부터 자기 자신까지의 숫자로 나눠본다
//			for (int divider = 1; divider <= target; ++divider) {
////				System.out.printf("%d %% %d = %d\n",
////						target, divider, target % divider);
//				
//				if(target % divider == 0) {
//					++yaksucount;
//				}
//			
//			}
//			// 검사가 끝났을 때 약수의 개수가 2개인 숫자가 소수다
//			if(yaksucount == 2) {
//				System.out.printf("%d는 소수 입니다\n" ,target);
//			
//			}
		}
	}

}
