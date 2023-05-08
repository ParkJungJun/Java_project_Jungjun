package myobj2;

import inferface.Runner;
import inferface.Swimmer;

public class Bear implements Swimmer, Runner{
	int runSpeed;
	int swimSpeed;
	@Override
	public void run() {
		System.out.println(runSpeed + "의 속도로 달립니다");
		
	}

	@Override
	public void swim() {
		System.out.println(swimSpeed + "의 속도로 헤엄칩니다");
		
	}

	@Override
	public void dive(int meter) {
		System.out.println("곰은 잠수를 잘 못합니다");
		System.out.println(meter * 0.3 +"만큼 잠수합니다");
	}

}
