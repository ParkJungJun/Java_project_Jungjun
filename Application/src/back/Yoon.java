package back;
import java.util.Scanner;
public class Yoon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year >= 1 && year <= 4000) {
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.print(1);
			} else {
			System.out.print(0);
			}
		}	
	}
}
