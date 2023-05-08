package quiz;

import java.util.Arrays;

import myobj.MachinelearningStudent;
import myobj.NetworkStudent;
import myobj.ProgrammingStudent;
import myobj.Student;

public class C11_SchoolT {
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
	
	//main : 각 클래스의 스타트 지점
	public static void main(String[] args) {
		// 부모 클래스에 자식 인스턴스를 넣는다(업캐스팅)
//		Student s1 = new Student();
//		Student s2 = new ProgrammingStudent();
//		Student s3 = new MachinelearningStudent();
//		Student s4 = new NetworkStudent();
		
		// 인스턴스 (new를 통해서 실제로 생성된 것 또는 주소값)
//		ProgrammingStudent p = new ProgrammingStudent();
		
		// Student 배열이 있다면 Student의 자식들은 모두 들어갈 수 있다
		Student[] Students = new Student[100];
		
		//Students[0] = new ProgrammingStudent();
		
		 for (int i = 0; i < Students.length; ++i) {
	         Student s;
	         
	         switch ((int) (Math.random() * 3)) {
	         case 0 : 
	            s = new ProgrammingStudent();
	            break;
	         case 1 : 
	            s = new NetworkStudent();
	            break;
	         default : 
	            s = new MachinelearningStudent();
	            break;
	         }
	         Students[i] = s;
	         
	         // 업캐스팅과 오버라이드를 이용하면 각 클래스마다 구현이 다른 메서드를
	         // 똑같은 이름으로 사용할 수 있다
	         s.info();
	      }
	      
	      //System.out.println(Arrays.toString(Students));      
	      
	   }

	}