package quiz;

import java.util.Scanner;

public class B10_DownloadTimeT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		
		//System.out.printf("%d초",sec);
		
		int oneDay = 60 * 60 * 24;
		int oneHour = 60 * 60;
		int oneMin = 60;
		
		if(sec >= oneDay) {
			//초가 1일 이상
			System.out.printf("%d일 %d시간 %d분 %d초",
					sec / oneDay, sec % oneDay / oneHour,
					sec % oneHour /oneMin,
					sec % oneMin);
		} else if(sec >= 60 * 60) {
			//초가 1시간 이상
			System.out.printf("%d시간 %d분 %d초",
					sec / oneHour,
					sec % oneHour /oneMin,
					sec % oneMin);
		} else if (sec >= 60) {
			//초가 1분 이상
			System.out.printf("%d분 %d초",
					sec /oneMin,
					sec % oneMin);
		} else {
			System.out.printf("%d초",sec);
		}
			
	}

}
