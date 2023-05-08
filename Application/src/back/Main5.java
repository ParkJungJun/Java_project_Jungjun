package back;
import java.util.Scanner;
public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	if (a >= 1 && a <= 6 && b >= 1 && b <= 6 && c >= 1 && c <= 6) {
		if (a == b && b == c && a == c) {
		System.out.print(10000 + a * 1000);
		} else if (a == b && b != c) {
		System.out.print(1000 + a * 100);
		} else if (a == c && b != c) {
		System.out.print(1000 + a * 100);
		} else if (b == c && a != c) {
		System.out.print(1000 + b * 100);
		} else if (a != b && a != c && a > b && a > c) {
		System.out.print(a * 100);
		} else if (a != b && a != c && b > a && b > c) {
		System.out.print(b * 100);
		} else if (a != b && a != c && c > a && c > b) {
		System.out.print(c * 100);
		}
	}
	
	
	}
}
