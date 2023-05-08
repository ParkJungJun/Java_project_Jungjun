package quiz;

import java.util.Random;

public class B11_Count369 {
	/*
	 * 10 ~ 30000 사이의 랜덤 양의 정수를 하나 생성하고
	 * 해당 숫자까지 369게임이 진행된다면 박수를 총 몇 번 쳐야 하는지 출력해보세요
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran1 = new Random();
		
		int i = ran1.nextInt(30000) +10;
		int count = 0;
		System.out.println(i);
		
		for(int j = 0; j <= i; ++j) {
			
			if( j % 10 == 3) {
				System.out.printf("%d입니다. 짝", j);
				++count;
				if(j % 100 - j % 10 == 30) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 1000 - j % 100 == 300) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 10000 - j % 1000 == 3000) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 100 - j % 10 == 60) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 1000 - j % 100 == 600) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 10000 - j % 1000 == 6000) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 100 - j % 10 == 90) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 1000 - j % 100 == 900) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 10000 - j % 1000 == 9000) {
					System.out.print(" 짝");
					++count;
				}
				System.out.println();
			} 
			if (j % 10 == 6) {
					System.out.printf("%d입니다. 짝", j);
					++count;
				if(j % 100 - j % 10 == 60) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 1000 - j % 100  == 600) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 10000 - j % 1000 == 6000) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 100 - j % 10 == 90) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 1000 - j % 100 == 900) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 10000 - j % 1000 == 9000) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 100 - j % 10 == 30) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 1000 - j % 100 == 300) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 10000 - j % 1000 == 3000) {
					System.out.print(" 짝");
					++count;
				}
				System.out.println();
			}
			if (j % 10 == 9) {
				System.out.printf("%d입니다. 짝", j);
				if(j % 100 - j % 10 == 90) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 1000 - j % 100 == 900) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 10000 - j % 1000 == 9000) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 100 - j % 10 == 60) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 1000 - j % 100 == 600) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 10000 - j % 1000 == 6000) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 100 - j % 10 == 30) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 1000 - j % 100 == 300) {
					System.out.print(" 짝");
					++count;
				}
				if(j % 10000 - j % 1000 == 3000) {
					System.out.print(" 짝");
					++count;
				}
				System.out.println();
			}
			if( j == 30000) {
				System.out.print("짝");
				++count;
			}
			
		}
		System.out.printf("총 박수의 횟수는: %d",count);
//		for(int j = 0; j <= i; ++j) {
//			if(j == 30000) {
//				System.out.print("짝");
//			}
//			if(3000 == j % 10000 - j % 1000) {
//				System.out.printf("%d 짝", j);
//				if(300 == j % 1000 - j % 100) {
//					System.out.print(" 짝");
//				}
//				if(30 == j % 100 - j % 10) {
//					System.out.print(" 짝");
//				}
//				if(3 == j % 10) {
//					System.out.print(" 짝");
//				}
//				System.out.println();
//			}
//		}
		
		
	}

}
