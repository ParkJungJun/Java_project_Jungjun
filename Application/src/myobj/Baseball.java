package myobj;

public class Baseball {
	public int correctAnswer;
	public int a;
	public int b;
	public int c;
	public int d;
//	int strike;
//	int ball;
	
	
	
	public Baseball(){
		correctAnswer = (int)(Math.random() *8999) +1000;
		int d = correctAnswer % 10;
		int c = correctAnswer % 100 - d;
		int b = correctAnswer % 1000 - d - c;
		int a = correctAnswer / 1000;
	}
	
	public void info() {
		System.out.println(correctAnswer);
	}
	
	public int answer() {
		return correctAnswer;
	}
	
	public int a() {
		int a = correctAnswer / 1000;
		return a;
	}
	
	public int b() {
		int d = correctAnswer % 10;
		int c = correctAnswer % 100 - d;
		int b = correctAnswer % 1000 - d - c;
		return b;
	}
	
	public int c() {
		int d = correctAnswer % 10;
		int c = correctAnswer % 100 - d;
		return c;
	}
	
	public int d() {
		int d = correctAnswer % 10;
		return d;
	}
	
	public int re() {
		return (int)(Math.random() *8999) +1000;
	}
}	

