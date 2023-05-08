package back;
import java.util.Scanner;

public class Main13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
 
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}