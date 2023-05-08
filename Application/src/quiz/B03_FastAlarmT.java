package quiz;

import java.util.Scanner;

public class B03_FastAlarmT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간을 입력하세요 : ");
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		min = min -45;
		
		if (min <0) {
			hour = hour -1;
			min =min + 60;
		}
		if (hour <0) {
			hour = hour +24;
		}
		
		System.out.printf("%d %d", hour ,min);
		
	}	
}
