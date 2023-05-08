package quiz;

import java.util.Random;

public class B13_RandomScore {
	/*
	 * 1. 100개의 점수(0점 ~ 100점)를 랜덤으로 생성하여 배열에 저장
	 * 
	 * 2. 배열에 저장된 값을 한 줄에 10개씩 출력
	 * 	(60점 미만인 점수는 X로 표시)
	 * 
	 * 3. 모든 점수의 평균을 출력 (소수 둘째 자리까지 출력)
	 * 
	 * 4. 가장 높은 점수와 가장 낮은 점수를 출력
	 */
	public static void main(String[] args) {
		Random ran1 = new Random();
		int[] score = new int [101];
		
		int total = 0;
		double count = 0;
		
		int big = score[1];
		// TODO Auto-generated method stub
		for(int i = 0; i <= 100; ++i) {
			//System.out.print(ran1.nextInt(101));
			score[i]= ran1.nextInt(101);
			if(score[i] < 60) {
				System.out.print('X');
			}else {
				System.out.print(score[i]);
			}
			total += score[i];
			System.out.print('\t');
			++count;
			if(count == 10) {
				System.out.println();
				count = 0;
			}
			
			if(big < score[i]) {
				big = score[i];
			}
		}
//		int small = score[1];
//		
//			if(small > score[i]) {
//				small = score[i];
//			}
		//System.out.print(total);
		System.out.print("평균은 " + ((float)total/100));
		//System.out.printf("제일 큰 값은 %d이고 제일 작은 값은 %d이다", big, small);
		
	}

}
