package quiz;

import java.util.Scanner;

public class B10_DownloadTime {
	/*
	 * 다운로드에 필요한 시간이 초 단위로 입력된다면
	 * 몇일 몇시간 몇분 몇초 남았는지 환산하여 출력해보세요
	 * (단, 필요 없는 단위는 출력하지 않아야 한다)
	 * 
	 * >> 600
	 * -> 10분 0초
	 * 
	 * >> 86450
	 * -> 1일 0시간 0분 50초
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		int min = 0;
		int hour = 0;
		int day = 0;
//		for(int i = 0; i <= sec; ++i) {
//			if(sec >= 60) {
//				sec -= 60;
//				++min;
//			}
//			if(min >= 60) {
//				min -= 60;
//				++hour;
//			}
//			if(hour >= 24) {
//				hour -= 24;
//				++day;	
//			}
//		}
//		System.out.printf("%d일 %d시 %d분 %d초", day, hour, min , sec);
		if (sec < 60) {
			System.out.printf("%d초",sec);
		} else if(sec >= 60) {
			sec -= 60;
			++ min;
			System.out.printf("%d분 %d초",min,sec);
		}
	}

}
