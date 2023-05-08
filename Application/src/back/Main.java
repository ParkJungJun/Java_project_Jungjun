package back;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		for(int i = 1; i <= n; i++) {
			for(int k = n; k > i; k--) {
				System.out.print(" ");
			}
			for(int i2 = 0; i2 < i; ++i2 ) {
				
				System.out.print('*');	
			}
			System.out.println();
		}
		
	}
}
