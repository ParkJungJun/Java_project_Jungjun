package myobj;

public class Student {
	
	String stuId;
	String subName;
	Name name;
	//int classroom;
	
	private static int currId = 1;
		
	
	
	public Student() {
		stuId = String.format("EZEN-%06d", currId++);
		name = new Name();
	}
	
	protected int getRandomScore() {
		return (int)(Math.random() * 101);
	}
	public int getTotal() {
		return 0;
	}
	public void info() {
		System.out.println("Student 클래스의 성적표 입니다.");
	}
	@Override
	public String toString() {
		return String.format("%s[%s] - %s\n",
				name.getBlindName(),stuId,subName);
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 100; ++i) {
			Student s = new Student();
			System.out.printf("[%s/%s]\n",s.stuId, s.name.getFullName());
		}
		 
	}
}
