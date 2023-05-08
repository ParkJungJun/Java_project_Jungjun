package quiz;

import java.util.Arrays;
import java.util.HashMap;

public class D07_DicePoker {
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
		// TODO Auto-generated method stub
		int[] diceNum = new int[6];
		int[] dice = new int[5];
		HashMap<Integer,Integer> dices = new HashMap<>();
		boolean nothing = false;
		int countL = 0;
		for(int i = 0; i < dice.length; ++i) {
			dice[i] = (int)(Math.random() * diceNum.length +1);
			//int count = dices.get(dice[i]);
			//dices.put(i, count);
		}
		System.out.println(Arrays.toString(dice));
		
//		for(int i = 0; i < dice.length; ++i) {
//			dices.put(dice[i], 0);
//		}
		
		for(int i =1 ; i <= diceNum.length; ++i) {
			dices.put(i, 0);
		}
		System.out.println(dices);
		
		for(int i = 0; i <dice.length; ++i) {
			int name = dice[i];
			int count = dices.get(name);
			dices.put(dice[i], count +1);
		}
		
		System.out.println(dices);
		
		for(int i = 1; i <= diceNum.length; ++i) {
			nothing = false;
			if(i < diceNum.length -3) {
				if(dices.get(i) != 0 && dices.get(i+1) != 0 && dices.get(i+2) != 0 &&
					dices.get(i+3) != 0 && dices.get(i+4) != 0) {
				System.out.println("라지 스트레이트입니다");
				break;
			}
			}
			if(i < diceNum.length -2) {
				if(dices.get(i) != 0 && dices.get(i+1) != 0 &&
					dices.get(i+2) != 0 && dices.get(i+3) != 0) {
				System.out.println("스몰 스트레이트입니다");
				break;
			}
			}			
			if(dices.containsValue(5)) {
				System.out.println("Yacht입니다");
				break;
			}else if(dices.containsValue(4)) {
				System.out.println("Four of kind입니다");
				break;
			}else if(dices.containsValue(3) && dices.containsValue(2)){
				System.out.println("풀 하우스입니다");
				break;
			}else if(dices.containsValue(3)) {
				System.out.println("Three of kind입니다");
				break;
			}else {
				nothing = true;
			}
		}
		System.out.println("아무것도 아닌가요? " + nothing);
	}
}