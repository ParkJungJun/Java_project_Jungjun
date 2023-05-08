package quiz;
import java.util.Scanner;

public class B03_ScoreToGradeE {
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
		int f = 0;
		String a1 = "A";
		String b1 = "B";
		String c1 = "C";
		String d1 = "D";
		String f1 = "F";
		double averageScore = (koreanLanguage + english + math)/3 ;
		if ((koreanLanguage < 0 || koreanLanguage > 100) || (english < 0 || english > 100)
				|| (math < 0 || math > 100)) {
		System.out.printf("국어, 영어, 수학의 점수는 %d, %d, %d이며 등급은 각각 %s, %s, %s이고"
				+ "평균점수는 %d이다", f, f, f, f1, f1, f1, f);
		} // AAA
		else if (koreanLanguage >= a && english >= a && math >= a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // AAB
		else if (koreanLanguage >= a && english >= a && math >= b && math <a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // AAC
		else if (koreanLanguage >= a && english >= a && math >= c && math <b) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // AAD
		else if (koreanLanguage >= a && english >= a && math >= d && math < c) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // AAF
		else if (koreanLanguage >= a && english >= a && math >= f && math < d) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ABA
		else if (koreanLanguage >= a && english >= b && english < a
				&& math >= a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ABB
		else if (koreanLanguage >= a && english >= b && english < a
				&& math >= b && math < a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ABC
		else if (koreanLanguage >= a && english >= b && english < a
				&& math >= c && math < b) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ABD
		else if (koreanLanguage >= a && english >= b && english < a
				&& math >= d && math < c) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ABF
		else if (koreanLanguage >= a && english >= b && english < a
				&& math >= f && math < d) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ACA
		else if (koreanLanguage >= a && english >= c && english < b
				&& math >= a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ACB
		else if (koreanLanguage >= a && english >= c && english < b
				&& math >= b && math < a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ACC
		else if (koreanLanguage >= a && english >= c && english < b
				&& math >= c && math < b) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ACD
		else if (koreanLanguage >= a && english >= c && english < b
				&& math >= d && math < c) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ACF
		else if (koreanLanguage >= a && english >= c && english < b
				&& math >= f && math < d) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ADA
		else if (koreanLanguage >= a && english >= d && english < c
				&& math >= a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ADB
		else if (koreanLanguage >= a && english >= d && english < c
				&& math >= b && math < a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ADC
		else if (koreanLanguage >= a && english >= d && english < c
				&& math >= c && math < b) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ADD
		else if (koreanLanguage >= a && english >= d && english < c
				&& math >= d && math < c) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // ADF
		else if (koreanLanguage >= a && english >= d && english < c
				&& math >= f && math < d) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // AFA
		else if (koreanLanguage >= a && english >= f && english < d
				&& math >= a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // AFB
		else if (koreanLanguage >= a && english >= f && english < d
				&& math >= b && math < a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // AFC
		else if (koreanLanguage >= a && english >= f && english < d
				&& math >= c && math < b) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // AFD
		else if (koreanLanguage >= a && english >= f && english < d
				&& math >= d && math < c) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // AFF
		else if (koreanLanguage >= a && english >= f && english < d
				&& math >= f && math < d) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, a1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BAA
		else if (koreanLanguage >= b && koreanLanguage < a && english >= a
				&& math >= a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BAB
		else if (koreanLanguage >= b && koreanLanguage < a && english >= a
				&& math >= b && math < a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BAC
		else if (koreanLanguage >= b && koreanLanguage < a && english >= a
				&& math >= c && math < b) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BAD
		else if (koreanLanguage >= b && koreanLanguage < a && english >= a
				&& math >= d && math < c) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BAF
		else if (koreanLanguage >= b && koreanLanguage < a && english >= a
				&& math >= f && math < d) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BBA
		else if (koreanLanguage >= b && koreanLanguage < a && english >= b
			&& english < a && math >= a) {
			System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
			System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
			System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
			System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BBB
		else if (koreanLanguage >= b && koreanLanguage < a && english >= b
				&& english < a && math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BBC
		else if (koreanLanguage >= b && koreanLanguage < a && english >= b
				&& english < a && math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BBD
		else if (koreanLanguage >= b && koreanLanguage < a && english >= b
				&& english < a && math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BBF
		else if (koreanLanguage >= b && koreanLanguage < a && english >= b
				&& english < a && math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BCA
		else if (koreanLanguage >= b && koreanLanguage < a && english >= c
				&& english < b && math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BCB
		else if (koreanLanguage >= b && koreanLanguage < a && english >= c
				&& english < b && math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BCC
		else if (koreanLanguage >= b && koreanLanguage < a && english >= c
				&& english < b && math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BCD
		else if (koreanLanguage >= b && koreanLanguage < a && english >= c
				&& english < b && math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BCF
		else if (koreanLanguage >= b && koreanLanguage < a && english >= c
				&& english < b && math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BDA
		else if (koreanLanguage >= b && koreanLanguage < a && english >= d
				&& english < c && math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BDB
		else if (koreanLanguage >= b && koreanLanguage < a && english >= d
				&& english < c && math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BDC
		else if (koreanLanguage >= b && koreanLanguage < a && english >= d
				&& english < c && math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BDD
		else if (koreanLanguage >= b && koreanLanguage < a && english >= d
				&& english < c && math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BDF
		else if (koreanLanguage >= b && koreanLanguage < a && english >= d
				&& english < c && math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BFA
		else if (koreanLanguage >= b && koreanLanguage < a && english >= f
				&& english < d && math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BFB
		else if (koreanLanguage >= b && koreanLanguage < a && english >= f
				&& english < d && math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BFC
		else if (koreanLanguage >= b && koreanLanguage < a && english >= f
				&& english < d && math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // BFD
		else if (koreanLanguage >= b && koreanLanguage < a && english >= f
				&& english < d && math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} //BFF
		else if (koreanLanguage >= b && koreanLanguage < a && english >= f
				&& english < d && math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, b1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CAA
		else if (koreanLanguage >= c && koreanLanguage < b && english >= a
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CAB
		else if (koreanLanguage >= c && koreanLanguage < b && english >= a
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CAC
		else if (koreanLanguage >= c && koreanLanguage < b && english >= a
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CAD
		else if (koreanLanguage >= c && koreanLanguage < b && english >= a
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CAF
		else if (koreanLanguage >= c && koreanLanguage < b && english >= a
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CBA
		else if (koreanLanguage >= c && koreanLanguage < b && english >= b && english < a
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CBB
		else if (koreanLanguage >= c && koreanLanguage < b && english >= b && english < a
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CBC
		else if (koreanLanguage >= c && koreanLanguage < b && english >= b && english < a
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CBD
		else if (koreanLanguage >= c && koreanLanguage < b && english >= b && english < a
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CBF
		else if (koreanLanguage >= c && koreanLanguage < b && english >= b && english < a
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CCA
		else if (koreanLanguage >= c && koreanLanguage < b && english >= c && english < b
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CCB
		else if (koreanLanguage >= c && koreanLanguage < b && english >= c && english < b
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CCC
		else if (koreanLanguage >= c && koreanLanguage < b && english >= c && english < b
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CCD
		else if (koreanLanguage >= c && koreanLanguage < b && english >= c && english < b
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CCF
		else if (koreanLanguage >= c && koreanLanguage < b && english >= c && english < b
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CDA
		else if (koreanLanguage >= c && koreanLanguage < b && english >= d && english < c
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CDB
		else if (koreanLanguage >= c && koreanLanguage < b && english >= d && english < c
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CDC
		else if (koreanLanguage >= c && koreanLanguage < b && english >= d && english < c
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CDD
		else if (koreanLanguage >= c && koreanLanguage < b && english >= d && english < c
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CDF
		else if (koreanLanguage >= c && koreanLanguage < b && english >= d && english < c
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CFA
		else if (koreanLanguage >= c && koreanLanguage < b && english >= f && english < d
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CFB
		else if (koreanLanguage >= c && koreanLanguage < b && english >= f && english < d
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CFC
		else if (koreanLanguage >= c && koreanLanguage < b && english >= f && english < d
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CFD
		else if (koreanLanguage >= c && koreanLanguage < b && english >= f && english < d
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // CFF
		else if (koreanLanguage >= c && koreanLanguage < b && english >= f && english < d
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, c1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DAA
		else if (koreanLanguage >= d && koreanLanguage < c && english >= a
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DAB
		else if (koreanLanguage >= d && koreanLanguage < c && english >= a
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DAC
		else if (koreanLanguage >= d && koreanLanguage < c && english >= a
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DAD
		else if (koreanLanguage >= d && koreanLanguage < c && english >= a
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DAF
		else if (koreanLanguage >= d && koreanLanguage < c && english >= a
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DBA
		else if (koreanLanguage >= d && koreanLanguage < c && english >= b && english < a
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DBB
		else if (koreanLanguage >= d && koreanLanguage < c && english >= b && english < a
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DBC
		else if (koreanLanguage >= d && koreanLanguage < c && english >= b && english < a
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DBD
		else if (koreanLanguage >= d && koreanLanguage < c && english >= b && english < a
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DBF
		else if (koreanLanguage >= d && koreanLanguage < c && english >= b && english < a
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DCA
		else if (koreanLanguage >= d && koreanLanguage < c && english >= c && english < b
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DCB
		else if (koreanLanguage >= d && koreanLanguage < c && english >= c && english < b
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DCC
		else if (koreanLanguage >= d && koreanLanguage < c && english >= c && english < b
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DCD
		else if (koreanLanguage >= d && koreanLanguage < c && english >= c && english < b
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DCF
		else if (koreanLanguage >= d && koreanLanguage < c && english >= c && english < b
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DDA
		else if (koreanLanguage >= d && koreanLanguage < c && english >= d && english < c
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DDB
		else if (koreanLanguage >= d && koreanLanguage < c && english >= d && english < c
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DDC
		else if (koreanLanguage >= d && koreanLanguage < c && english >= d && english < c
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DDD
		else if (koreanLanguage >= d && koreanLanguage < c && english >= d && english < c
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DDF
		else if (koreanLanguage >= d && koreanLanguage < c && english >= d && english < c
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DFA
		else if (koreanLanguage >= d && koreanLanguage < c && english >= f && english < d
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DFB
		else if (koreanLanguage >= d && koreanLanguage < c && english >= f && english < d
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DFC
		else if (koreanLanguage >= d && koreanLanguage < c && english >= f && english < d
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DFD
		else if (koreanLanguage >= d && koreanLanguage < c && english >= f && english < d
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // DFF
		else if (koreanLanguage >= d && koreanLanguage < c && english >= f && english < d
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, d1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FAA
		else if (koreanLanguage >= f && koreanLanguage < d && english >= a
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FAB
		else if (koreanLanguage >= f && koreanLanguage < d && english >= a
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FAC
		else if (koreanLanguage >= f && koreanLanguage < d && english >= a
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FAD
		else if (koreanLanguage >= f && koreanLanguage < d && english >= a
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FAF
		else if (koreanLanguage >= f && koreanLanguage < d && english >= a
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, a1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FBA
		else if (koreanLanguage >= f && koreanLanguage < d && english >= b && english < a
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FBB
		else if (koreanLanguage >= f && koreanLanguage < d && english >= b && english < a
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FBC
		else if (koreanLanguage >= f && koreanLanguage < d && english >= b && english < a
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FBD
		else if (koreanLanguage >= f && koreanLanguage < d && english >= b && english < a
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FBF
		else if (koreanLanguage >= f && koreanLanguage < d && english >= b && english < a
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, b1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FCA
		else if (koreanLanguage >= f && koreanLanguage < d && english >= c && english < b
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FCB
		else if (koreanLanguage >= f && koreanLanguage < d && english >= c && english < b
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FCC
		else if (koreanLanguage >= f && koreanLanguage < d && english >= c && english < b
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FCD
		else if (koreanLanguage >= f && koreanLanguage < d && english >= c && english < b
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FCF
		else if (koreanLanguage >= f && koreanLanguage < d && english >= c && english < b
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, c1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FDA
		else if (koreanLanguage >= f && koreanLanguage < d && english >= d && english < c
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FDB
		else if (koreanLanguage >= f && koreanLanguage < d && english >= d && english < c
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FDC
		else if (koreanLanguage >= f && koreanLanguage < d && english >= d && english < c
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FDD
		else if (koreanLanguage >= f && koreanLanguage < d && english >= d && english < c
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FDF
		else if (koreanLanguage >= f && koreanLanguage < d && english >= d && english < c
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, d1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FFA
		else if (koreanLanguage >= f && koreanLanguage < d && english >= f && english < d
				&& math >= a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, a1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FFB
		else if (koreanLanguage >= f && koreanLanguage < d && english >= f && english < d
				&& math >= b && math < a) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, b1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FFC
		else if (koreanLanguage >= f && koreanLanguage < d && english >= f && english < d
				&& math >= c && math < b) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, c1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FFD
		else if (koreanLanguage >= f && koreanLanguage < d && english >= f && english < d
				&& math >= d && math < c) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, d1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		} // FFF
		else if (koreanLanguage >= f && koreanLanguage < d && english >= f && english < d
				&& math >= f && math < d) {
				System.out.printf("국어점수는 %.1f, 등급은 %s " ,koreanLanguage, f1);
				System.out.printf("영어점수는 %.1f, 등급은 %s " ,english, f1);
				System.out.printf("수학점수는 %.1f, 등급은 %s " ,math, f1);
				System.out.printf("평균 점수는 %.1f" ,averageScore);
		}
	
	
    }
}
