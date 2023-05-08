package quiz;

import myobj2.Dices;

public class D07_DicePokerT {
	/*
	 * # 주사위 포커를 만들어 주세요
	 * 
	 * 1. 주사위를 다섯개 던진다
	 * 
	 * 2. 각 주사위의 눈을 가지고 어떤 패가 만들어졌는지 알려줘야 한다
	 * 
	 * 3. 다섯 개의 주사위 눈을 통해 다음을 구분한다
	 * 
	 *  (1) 풀 하우스 (같은 눈이 2개/3개)
	 *  ex) 11222,21122,55566,53535, ...
	 *  
	 *  (2) 스몰 스트레이트 (1234/2345/3456)
	 *  
	 *  ex) 31246, 24352, ...
	 *  
	 *  (3) 라지 스트레이트 (12345/23456)
	 *  
	 *  (4) Three of kind (같은 눈 3개)
	 *  ex) 33312, 61626
	 *  
	 *  (5) Four of kind (같은 눈 4개)
	 *  ex) 33331, 65666, ....
	 *  
	 *  (6) Yacht (같은 눈 5개)
	 *  ex) 66666, 11111, ...
	 */
	public static void main(String[] args) {
		//int 와 Integer의 차이1 : .을 찍을 수 있는지의 여부
		int a =10;
		Integer b = 10;
		
		// 차이2 : null을 넣을 수 있는지의 여부
		//a = null; 못넣음
		b = null;
		// 차이3 : 제네릭으로 쓸 수 있고 없고의 차이
		
		Dices d = new Dices();
		
//		d.check();
		System.out.println(d.check());
		
		
	}

}
