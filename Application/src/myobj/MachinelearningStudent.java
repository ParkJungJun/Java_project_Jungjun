package myobj;

public class MachinelearningStudent extends Student{
	int kor;
	int eng;
	int math;
	int staticstics;
	int pl;
	int naSql;
	
	public MachinelearningStudent() {
		kor = getRandomScore();
		eng = getRandomScore();
		math = getRandomScore();
		staticstics = getRandomScore();
		pl = getRandomScore();
		naSql = getRandomScore();
		subName =  "Machinelearning";
	}
	
	@Override
	public void info() {
		System.out.println("###MachinelearningStudent###");
		System.out.printf("학번\t:%s\n", this.stuId);
		System.out.printf("이름\t:%s\n", name.getFullName());
		System.out.printf("국어\t:%s\n", kor);
		System.out.printf("영어\t:%s\n", eng);
		System.out.printf("수학\t:%s\n", math);
		System.out.printf("통계학\t:%s\n", staticstics);
		System.out.printf("PL\t:%s\n", pl);
		System.out.printf("noSql\t:%s\n", naSql);
		System.out.printf("총합\t:%s\n", getTotal());
		System.out.printf("평균\t:%s\n", getAVG());
		System.out.printf("등급\t:%s\n", getGrade());
		
	}
	public char getGrade() {
		double avg = getAVG();
		
		if(avg >= 90) {
			return 'A';
		}else if(avg >= 80) {
			return 'B';
		}else if(avg >= 70) {
			return 'C';
		}else if(avg >= 60) {
			return 'E';
		}else {
			return 'F';
		}
	}
	public int getTotal() {
		return kor + eng + math + staticstics + pl + naSql;
	}
	public double getAVG() {
		return getTotal() / 6.0;
	}
}
