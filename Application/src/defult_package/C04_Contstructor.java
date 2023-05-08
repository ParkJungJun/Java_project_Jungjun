package defult_package;
public class C04_Contstructor {
	/*
	 * 클래스의 생성자 (Contstructor)
	 * 
	 * - 해당 클래스의 새 인스턴스를 생성할 때 new와 함께 사용하는 것
	 * - 생성자를 정의하지 않은 클래스에는  기본 생성자가 자동으로 생성된다
	 *   (인스턴스를 생성할 때 아무 동작도 하지 않음)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a1 = new Apple();
		//import를 안하고 클래스를 사용하는 방법
		myobj.Orange o1 = new myobj.Orange();
		myobj.Orange o2 = new myobj.Orange("호주");
		myobj.Orange o3 = new myobj.Orange("터키",3000,'A');
		
		o1.info();
		o2.info();
		o3.info();
		
		myobj.Car c1 = new myobj.Car();
		myobj.Car c2 = new myobj.Car("green",20 ,80);
		myobj.Car c3 = new myobj.Car("white");
		
		c1.info();
		c2.info();
		c3.info();
		
		c3.blue();
		c3.faster();
		c3.bigger();
		
		c3.info();
		//어제 연습으로 만든 클래스들을 myobj 패키지로 옮긴 후 생성자를 추가해 보세요
	}

}
