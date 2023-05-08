package quiz;
import java.util.Scanner;

public class B03_ScoreToGrade {
	/*
	 * 국어, 영어, 수학 점수를 차례대로 입력받아 평균 점수를 구한 후에
	 * 각 과목의 점수와 등급, 평균 점수를 출력해주는 프로그램을 만들어보세요
	 * 
	 * 90점 이상 A
	 * 80점 이상 B
	 * 70점 이상 C
	 * 60점 이상 D
	 * 그 외 F
	 *
	 *2. 각 과목의 유효한 점수는 0 ~ 100점이다
	 *   유효하지 않은 점수가 하나라도 있다면 모든 과목이 F이고 평균 점수는 0점
	 *   
	 * 3. 평균 점수는 소수 둘째 자리에서 반올림하여 저장후 출력
	 */
	public static void main(String[] args) {
		double koreanLanguage;
		double english;
		double math;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 수학의 점수를 각각 입력하세요 : ");
		koreanLanguage = sc.nextDouble();
		english = sc.nextDouble();
		math = sc.nextDouble();
		
		int a = 90;
		int b = 80;
		int c = 70;
		int d = 60;
		int f;
		String a1 = "A";
		String b1 = "B";
		String c1 = "C";
		String d1 = "D";
		String f1 = "F";
		double averageScore = (koreanLanguage + english + math)/3 ;
		if ((koreanLanguage < 0 || koreanLanguage > 100) || (english < 0 || english > 100)
				|| (math < 0 || math > 100)) {
		System.out.println("국어, 영어, 수학의 점수는 0, 0, 0이며 등급은 각각 F, F, F이고 평균점수는 0이다");
		} else if (koreanLanguage >= a && english >= a && math >= a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} else if (koreanLanguage >= a && english >= a && math >= b && math <a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} else if (koreanLanguage >= a && english >= a && math >= c && math <b) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} else if (koreanLanguage >= a && english >= a && math >= b && math <c) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);}
		else if (koreanLanguage >= a && english >= b && english < a
				&& math >= b && math < b) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} else if (koreanLanguage >= b && koreanLanguage < a
				&& english >= b && english < a && math >= b && math < a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
	      }
	
	
    }
}
