package inferface;

public interface Swimmer {
	// 자식클래스로 구현을 미룬다
	abstract public void swim();
	
	// abstract public 을 생략해도 자동으로 abstract public 메서드가 된다
	// 아무것도 안붙여도 자식클래스로 구현을 미룬다
	void dive(int meter);
}
