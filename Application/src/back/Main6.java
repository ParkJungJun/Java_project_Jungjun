package back;
import java.util.Scanner;
public class Main6{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int b1 = b % 10;
    	int b2 = (b % 100)- b1 ;
    	int b3 = b - b1 -b2;
    	if(a >= 100 && a <= 999 && b >= 100 && b <= 999) {
    		System.out.println(b1 * a);
    		System.out.println(b2 * a / 10);
    		System.out.println(b3 * a / 100);
    		System.out.println(a * b);
    	}
    	
    }
}
