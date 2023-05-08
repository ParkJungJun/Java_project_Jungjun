package back;

import java.util.Scanner;

public class MainOvenT {
		
	/*
	 * 오븐 시계에 시간을 추가하면 시간이 올바르게 계산되도록 만들어보세요
	 * 시간 (0 ~ 23), 분(0 ~59)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time= sc.nextInt();
		
		// 800분 => 13시간(전체시간 / 60), 20분(전체시간 % 60)
		hour = hour + time / 60;
		min = min + time % 60;
		
		if (min > 59) {
			hour = hour + 1;
			min = min - 60;
		}
		System.out.printf("%d %d",hour % 24, min);
	}
	
}
