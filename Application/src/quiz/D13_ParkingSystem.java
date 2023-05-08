package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class D13_ParkingSystem {

	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate firstDay = LocalDate.of(2018,9,1);
		DayOfWeek dow = today.getDayOfWeek();
//		System.out.println(today.getDayOfWeek());
//		System.out.println("요일값: " + dow.getValue());
		Car c = new Car(1557, "T1");
		
		if(dow.getValue() == 2) {
			if((c.carKind.equals("장애인") || c.carKind.equals("유아동승") || c.carKind.equals("경차"))
					&& (c.carNum % 10 != 2 ||c.carNum % 10 != 7)) {
				System.out.println(c +"은(는) 화요일에 통과가능차량입니다");
			}else {
				System.out.println(c +"은(는) 화요일에 출입제한차량입니다");
			}
		}else if(dow.getValue() == 1) {
			if((c.carKind.equals("장애인") || c.carKind.equals("유아동승") || c.carKind.equals("경차"))
					&& (c.carNum % 10 != 1 ||c.carNum % 10 != 6)) {
				System.out.println(c +"은(는) 월요일에 통과가능차량입니다");
			}else {
				System.out.println(c +"은(는) 월요일에 출입제한차량입니다");
			}
		}else if(dow.getValue() == 3) {
			if((c.carKind.equals("장애인") || c.carKind.equals("유아동승") || c.carKind.equals("경차"))
					&& (c.carNum % 10 != 3 ||c.carNum % 10 != 8)) {
				System.out.println(c +"은(는) 수요일에 통과가능차량입니다");
			}else {
				System.out.println(c +"은(는) 수요일에 출입제한차량입니다");
			}
		}else if(dow.getValue() == 4) {
			if((c.carKind.equals("장애인") || c.carKind.equals("유아동승") || c.carKind.equals("경차"))
					&& (c.carNum % 10 != 4 ||c.carNum % 10 != 9)) {
				System.out.println(c +"은(는) 목요일에 통과가능차량입니다");
			}else {
				System.out.println(c +"은(는) 목요일에 출입제한차량입니다");
			}
		}else if(dow.getValue() == 2) {
			if((c.carKind.equals("장애인") || c.carKind.equals("유아동승") || c.carKind.equals("경차"))
					&& (c.carNum % 10 != 5 ||c.carNum % 10 != 0)) {
				System.out.println(c +"은(는) 금요일에 통과가능차량입니다");
			}else {
				System.out.println(c +"은(는) 금요일에 출입제한차량입니다");
			}
		}else {
			System.out.println(c +"은(는) 주말또는 공휴일에 통과가능차량입니다");
		}
			
	}
}
class Car {
	int carNum;
	static String[] carKindArr = {"기본", "장애인차량", "유아동승", "경차"};
	int carKindNum;
	String carKind;

	public Car(int carNum, String carKind) {
		this.carNum = carNum;
		//carKindNum = (int)(Math.random() * 4);
		this.carKind = carKind;
	}
	String kind() {
		carKindNum = (int)(Math.random() * 4);
		carKind = carKindArr[carKindNum];
		return carKind;
	}
	
	int num() {
		carNum = (int)(Math.random() * 9000 + 1000);
		return carNum;
	}
	@Override
	public String toString() {
		
		return String.format("%d %s",carNum,carKind);
	}
}
