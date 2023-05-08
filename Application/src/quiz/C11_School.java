package quiz;
import myobj.School;
public class C11_School {
	/*
	 * 1. 프로그래밍 반 학생들은 각자의
	 *    국어,영어,수학,프로그래밍 언어, 운영체제, 자료구조 점수가 있다
	 *   
	 * 2. 네트워크 반 학생들은 각자의
	 *    국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다
	 *   
	 * 3. 머신러닝 반 학생들은 각자의
	 *    국어, 영어, 수학, 통계학, 프로그래밍 언어, NO-SQL 점수가 있다
	 *   
	 * 4. 100명의 학생을 랜덤으로 생성한다
	 *    모든 학생의 소속 반, 과목별 점수, 이름이 랜덤으로 생성되어야 하고,
	 *    학생들의 학번은 중복없이 순차적으로 생성되어야 한다
	 *    
	 * 5. 성적표 출력 메서드를 통해 각 학생의
	 *    [학번/이름/과목별 점수/총점/평균/등급]을 볼 수 있다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s1= new School();
		//s1.programmingClassInfo();
		s1.wetworkClassInfo();
		s1.machineLearningClassInfo();
		s1.studentNumberInfo();
		s1.nameInfo();
		s1.totalinfo();
		//s1.studentClassInfo();
		//System.out.println(s1.programmingClassInfo());
		System.out.println(s1.wetworkClassInfo());
		System.out.println(s1.machineLearningClassInfo());
		System.out.println(s1.studentNumberInfo());
		System.out.println(s1.nameInfo());
		System.out.println(s1.totalinfo());
		//System.out.println(s1.studentClassInfo());
		s1.info();
	}

}
