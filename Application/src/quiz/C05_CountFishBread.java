package quiz;

import java.util.Arrays;

public class C05_CountFishBread {
	/*
	 * 1. 붕어빵을 100개 만들고 어떤 붕어빵이 몇 개 있는지 세어보세요
	 *    (단, 붕어빵의 맛은 만들 때 랜덤으로 결정되어야 함)
	 * 
	 * 2. 붕어빵 배열을 전달하면 모든 붕어빵의 가격이 얼마인지 계산해주는
	 *    함수를 만들어보세요
	 * ※ 붕어빵의 맛 종류 - 슈크림,팥,초코
	 * ※ 붕어빵의 가격 - 팥 800원, 슈크림 1000원, 초코 1200원
	 * ※ 각 붕어빵에는 품질이 있으며 품질에 따라 +-50원이 된다 (상,중,하)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] FishBread = new int[100];
		int len = FishBread.length;
		for(int i = 0; i < len; ++i) {
			FishBread[i] = (int)(Math.random() * 3) +1;
			if(FishBread[i] == 1) {
				FishBread[i] = 'P';
			}else if(FishBread[i] == 2) {
				FishBread[i] = 'S';
			}else {
				FishBread[i] = 'C';
			}
		}
		System.out.println((String)(Arrays.toString(FishBread)));
	}

}
