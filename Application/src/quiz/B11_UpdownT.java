package quiz;

import java.util.Scanner;

public class B11_UpdownT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer = (int)(Math.random() * 100) + 1;
		int chance = 5;
		
		Scanner sc = new Scanner(System.in);
		
		while (chance != 0) {
			
			
			
			System.out.print("Guess the number >>");
			int num;
			while ((num = sc.nextInt()) < 1 || num > 100) {
				System.out.printf("%d is a wrong number.\n", num);
				System.out.print("Input correct number >> ");
			}
			
			--chance;
			
			if(num == answer) {
				System.out.printf("%d는 정답이였습니다.(남은횟수:%d)\n", num,chance);
				break;
			} else if(num > answer) {
				System.out.printf("Down!! (남은횟수:%d)\n",chance);
			}else {
				System.out.printf("Up!! (남은횟수:%d)\n",chance);
			}
		}
		System.out.printf("Game Over! 정답은 %d였습니다. \n", answer);
	}

}
