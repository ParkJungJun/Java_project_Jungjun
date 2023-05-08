package defult_package;
import java.util.Scanner;

import myobj.Cart;

import java.util.Random;
public class C03_OOP {
	/*
	 * # 객체 지향 프로그래밍(Object Oriented Programming)
	 * 
	 * - 변수와 함수들을 실제로 세상에 존재하는 개념(객체)을 묶어서 사용하는
	 *   프로그래밍 방법론
	 * - 변수와 함수들을 무분별하게 사용하다보면 여러 문제들이 발생하기 때문에
	 *   현실에 존재하는 객체 단위로 묶어서 표현하기 시작했다
	 * - 변수는 객체의 현재 상태를 나타낸다
	 * - 객체 내부의 함수는 해당 객체의 상태를 변화시킨다
	 *   이를 메서드라고 부른다
	 * 
	 * ex: 책
	 * 
	 *     - 책의 상태(변수) :
	 *         현재 펼쳐저있는 페이지, 전체 페이지. 발행일, 각 페이지 낙서 여부,
	 *         각 페이지에 필기가 되어있는 위치의 좌표, 가격, 할인률
	 *      
	 *     - 책의 기능 (메서드) : 다음 페이지로 넘기기, 여러 페이지 넘기기, 한장 넘기기,
	 *     					 필기 지우기, ...
	 *      
	 *      
	 * # 클래스 (Class)
	 * 
	 * - 객체지향 프로그래밍 객체를 프로그래밍 언어로 표현하는 문법
	 * - 클래스는 해당 객체의 설계도 역할을 한다
	 * - 클래스를 정의한 시점에서는 실체(인스턴스)가 없다
	 * - 클래스를 통해 만들어내는 실제 객체를 인스턴스(instance)라고 부른다
	 * - 클래스를 통해 인스턴스를 생성할 때 new를 사용한다
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Apple이라는 설계도를 실제(인스턴스)를 만들었다
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 인스턴스에 .을 찍고 해당 클래스의 변수와 메서드를 사용할 수 있다
		Apple[] apples = new Apple[100];
		String[] animals= new String[10];
		
		a1.price = 800;
		a2.price = 1000;
		
		//메서드는 모두 똑같은 동작을 하지만 각 인스턴스의 상태값에 따라 결과가 달라질 수 있다
		System.out.println(a1.toDollar());
		System.out.println(a2.toDollar());
		
		Book b1 = new Book();
		
		b1.next();
		
		System.out.println("현재 보고 있는 페이지는" + b1.currPage + "page 입니다.");
		
		b1.next();
		b1.next();
		System.out.println("현재 보고 있는 페이지는" + b1.currPage + "page 입니다.");
		b1.prev();
		System.out.println("현재 보고 있는 페이지는" + b1.currPage + "page 입니다.");
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.size = 3; 
		System.out.println("자동차의 크기는 : " + c1.size);
		c1.bigger();
		System.out.println("자동차의 크기는 : " + c1.size);
		c1.speed = 10;
		System.out.println("자동차의 속도는 : " + c1.speed);
		c1.faster();
		System.out.println("자동차의 속도는 : " + c1.speed);
		c1.color = "black";
		System.out.println("자동차의 색깔는 : " + c1.color);
		c1.blue();
		System.out.println("자동차의 색깔는 : " + c1.color);
		c1.green();
		System.out.println("자동차의 색깔는 : " + c1.color);
		c2.size = 10;
		System.out.println("자동차의 크기는 : " + c2.size);
		c2.smaller();
		System.out.println("자동차의 크기는 : " + c2.size);
		c2.speed = 100;
		System.out.println("자동차의 속도는 : " + c2.speed);
		c2.slower();
		System.out.println("자동차의 속도는 : " + c2.speed);
		c2.color = "white";
		System.out.println("자동차의 색깔는 : " + c2.color);
		c2.orange();
		System.out.println("자동차의 색깔는 : " + c2.color);
		
		//여기는 default 패키지이기 때문에 myobj 패키지의
		//무언가를 가져다 쓰려면 public이 필요하다
		Cart cart1 = new Cart();
		
		cart1.name = "연습카드";
		cart1.break_power = 5;
		cart1.acc = 10;
		cart1.speed = 0;
		
		cart1.plusSpeed();
		cart1.plusSpeed();
		cart1.plusSpeed();
		cart1.plusSpeed();
		
		System.out.println("현재 속도: " + cart1.speed);
	}

}

// Apple 객체의 설계도 (class)
class Apple {
	
	//클래스의 인스턴스 변수 (인스턴스마다 값이 다름)
	// = 맴버 변수, 속성, 필드, ... 등등
	int price;
	int taste;
	
	//클래스의 인스턴스 매서드 (가지고 있는 인스턴스 변수에 따라 결과가 다름)
	
	// 현재 사과 가격을 달러로 변환하여 반환해주는 메서드
	double toDollar() {
		return price * 0.00083;
	}
}

class Book{
	int currPage;
	
	void next() {
		++currPage;
	}
	
	void prev() {
		--currPage;
	}
}

class Car{
	String color;
	int size;
	int speed;
	
	void blue(){
		color = "blue";
	}
	void green() {
		color = "green";
	}
	void bigger() {
		++size;
	}
	void faster() {
		speed += 10;
	}
	void smaller() {
		--size;
	}
	void slower() {
		speed -= 10;
	}
	void orange() {
		color = "orange";
	}
}
/*
 * 실제로 존재하는 객체를 하나 참고하여 클래스를 생성한 후
 * 해당 클래스의 인스턴스를 생성하고 인스턴스의 상태를 출력해보세요
 * (단, 인스턴스 변수 3개이상,메서드 2개이상 ,책 ,과일 금지)
 */

