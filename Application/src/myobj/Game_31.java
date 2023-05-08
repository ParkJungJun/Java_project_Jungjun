package myobj;

public class Game_31 {
	int people;
	int count1 = 0;
	
	
//	public Game_31() {
//		//this(null,null);
//	}
//	
//	public int Game_31(int people,int count){
//		this.people = people;
//		this.count = count;
//	}
	public int count(int count2) {
		count1 = count2;
		return count2;
		
	}
	
	public int count2() {
		if(count1 == 1) {
			return count1 += 1;
		}else if(count1 == 2) {
			return count1 += 2;
		}else if(count1 == 3) {
			return count1 += 3;
		}else {
			return 0;
		}
	}
	
	public void info() {
		System.out.println("2명이상의 인원을 입력하시면 게임이 시작됩니다");
	}
	
	public String howMany(int people) {
		if(people < 2) {
			return "2명이상의 인원을 입력해주세요";
		}else {
			return "게임 시작!";
		}
		
	}
}
