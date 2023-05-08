package myobj;

public class NetworkStudent extends Student{
	int kor;
	int eng;
	int linux;
	int network;
	int ccna;
	
	public NetworkStudent() {
		kor = getRandomScore();
		eng = getRandomScore();
		linux = getRandomScore();
		network= getRandomScore();
		ccna = getRandomScore();
		subName = "Network";
	}
	@Override
	public void info() {
		System.out.println("###MachinelearningStudent###");
		System.out.printf("학번\t:%s\n", this.stuId);
		System.out.printf("이름\t:%s\n", name.getFullName());
		System.out.printf("국어\t:%s\n", kor);
		System.out.printf("영어\t:%s\n", eng);
		System.out.printf("리눅스\t:%s\n", linux);
		System.out.printf("네트워크\t:%s\n", network);
		System.out.printf("ccna\t:%s\n", ccna);
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
		return kor + eng + linux + network + ccna;
	}
	public double getAVG() {
		return getTotal() / 5.0;
	}
}
