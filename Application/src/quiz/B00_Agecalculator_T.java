package quiz;

import java.util.Scanner;

public class B00_Agecalculator_T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 해를 입력하시오 : ");
		
		int birthYear = sc.nextInt();
		int thisYear = 2023;
		
		System.out.printf("%d년에 태어난 사람의 %d년의 나이는 %d살입니다. \n"
				, birthYear, thisYear, thisYear - birthYear +1);
	}
	
}
