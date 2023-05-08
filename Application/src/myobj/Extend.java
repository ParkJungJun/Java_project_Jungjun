package myobj;

public class Extend {
	public static void main(String[] args) {
		Alcohol a1 = new Alcohol();
		Drug d1= new Drug();
		Drinks d2 = new Drinks();
		a1.drink(3);
		d1.drink(100);
		a1.throw_up(3);
		d2.drink(10);
		a1.superDrink();
	}
}

class Drinks {
	int thirst;
	
	void drink(int thirst) {
		System.out.printf("목마름이 %d만큼 해소되었습니다\n", thirst);
	}
}

class Alcohol extends Drinks {
	int intoxication;
	
	void drink(int intoxication) {
		System.out.printf("취기가 %d만큼 올라옵니다\n", intoxication);
	}
	
	void throw_up(int intoxication) {
		System.out.printf("취기가 %d만큼 내려갑니다\n", intoxication);
	}
	
	void superDrink() {
		super.drink(5);
	}
}

class Drug extends Drinks {
	int hp;
	
	void drink(int hp) {
		System.out.printf("체력이 %d만큼 회복되었습니다\n",hp);
	}
}