package back;
import java.util.Scanner;
public class Main10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i += 4) {
			System.out.print("long ");
		}
		System.out.print("int");
	}

}
