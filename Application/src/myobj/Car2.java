package myobj;



public class Car2 {

	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 c1 = new Car3("k3",1000,100);
		Car3 c2 = new Car3("k3",1000,100);
		Car3 c3 = new Car3("k5",2000,150);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
	
		
	}

}

class Car3{
	String name;
	int price;
	int speed;
	
	public Car3(String name, int price, int speed) {
		this.name = name;
		this.price = price;
		this.speed = speed;
	}
	
	public String toString() {
		return "차의 이름은 " + name + "이고 가격은 " + price + "만원이며 최대속도는 " + speed + "km/h이다";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car3)) {
			return false;
		}
		// 현재 인스턴스와 전달받은 인스턴스가 같은 객체인지 여부를 리턴해야 한다
		Car3 p1 = this;
		Car3 p2 = (Car3) obj;
		
		return p1.speed == p2.speed && p1.name.equals(p2.name);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1234 + price;
	}
}
