package back;
import java.util.Scanner;
public class MainOven{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time= sc.nextInt();
		
		if(!(hour > 23 || hour < 0 || min > 59 || min < 0 || time < 0 || time > 1000)) {
			if (min + time < 60) {
				System.out.printf("%d %d",hour, min + time);
			} else if (min + time >= 60 && hour + (min + time)/60 < 24) {
				System.out.printf("%d %d",hour + (min + time)/60, (min + time) % 60);
			} else if (hour + (min + time)/60 > 24 && min + time >= 60) {
				System.out.printf("%d %d", hour + (min + time)/60 - 24, (min + time) % 60);
			}
		}
		
	}
}