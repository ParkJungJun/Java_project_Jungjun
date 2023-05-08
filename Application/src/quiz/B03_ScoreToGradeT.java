package quiz;
import java.util.Scanner;
public class B03_ScoreToGradeT {
	public static void main(String[] args) {
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
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 수학의 점수를 각각 입력하세요 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		char korGrade = 'F';
		char engGrade = 'F';
		char mathGrade = 'F';
		
		boolean cheating = kor < 0 || kor > 100
				|| eng < 0 || eng > 100 || math < 0 || math > 100;
		
		if (kor >= 90) {
			korGrade = 'A';
		} else if (kor >= 80) {
			korGrade = 'B';
		} else if (kor >= 70) {
			korGrade = 'c';
		} else if (kor >= 60) {
			korGrade = 'd';
		}
		
		if (eng >= 90) {
					engGrade = 'A';
		} else if (eng >= 80) {
					engGrade = 'B';
		} else if (eng >= 70) {
					engGrade = 'c';
		} else if (eng >= 60) {
					engGrade = 'd';
		}
		if (math >= 90) {
			mathGrade = 'A';
		} else if (math >= 80) {
			mathGrade = 'B';
		} else if (math >= 70) {
			mathGrade = 'c';
		} else if (math >= 60) {
			mathGrade = 'd';
		}
		
		if (cheating) {
			kor = 0;
			eng = 0;
			math = 0;
			korGrade = 'F';
			engGrade = 'F';
			mathGrade = 'F';
		}
		int total = kor + eng + math;
		double avg = Math.round(total/ 3.0 *100) / 100.0;
		
		System.out.printf("국어 %d점 [%c등급]\n", kor , korGrade);
		System.out.printf("영어 %d점 [%c등급]\n", eng , engGrade);
		System.out.printf("수학 %d점 [%c등급]\n", math , mathGrade);
		System.out.printf("총점 : %d, 평균 %.2f\n", total,avg);
	
	
	
	}
}
