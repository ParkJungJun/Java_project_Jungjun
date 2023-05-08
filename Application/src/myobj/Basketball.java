package myobj;

public class Basketball extends Ball{
	@Override
	public void kick() {
		System.out.println("농구공을 차면 많이 아프다");
		
	}
	public void throwing(){
		System.out.println("3점슛~");
	}
	
	public void pass() {
		System.out.println("다른 선수에게 패스");
	}
}
