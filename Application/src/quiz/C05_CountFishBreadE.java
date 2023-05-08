package quiz;
import java.util.Random;
import java.util.Arrays;

public class C05_CountFishBreadE {
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
		
		Random ran1 = new Random();
		String[] FishBread = {"팥-상","팥-중","팥-하","슈크림-상","슈크림-중","슈크림-하",
				"초코-상","초코-중","초코-하"};
		int[] number = new int[100];
		int countP1 = 0;
		int countP2 = 0;
		int countP3 = 0;
		int countS1 = 0;
		int countS2 = 0;
		int countS3 = 0;
		int countC1 = 0;
		int countC2 = 0;
		int countC3 = 0;
		
		for(int i = 0; i <number.length; ++i) {
			number[i] = ran1.nextInt(9);
			//System.out.print(FishBread[number[i]]);
			if(i != 99) {
				//System.out.print(", ");
			}
			if(number[i] == 0) {
				++countP1;
			}else if(number[i] == 1) {
				++countP2;
			}else if(number[i] == 2){
				++countP3;
			}else if(number[i] == 3){
				++countS1;
			}else if(number[i] == 4){
				++countS2;
			}else if(number[i] == 5){
				++countS3;
			}else if(number[i] == 6){
				++countC1;
			}else if(number[i] == 7){
				++countC2;
			}else if(number[i] == 8){
				++countC3;
			}
		}
		int P = countP1 + countP2 + countP3;
		int S = countS1 + countS2 + countS3;
		int C = countC1 + countC2 + countC3;
		int total = countP1 * 850 + countP2 * 800 + countP3 * 750
				+ countS1 * 1050 + countS2 * 1000 + countS3 * 950
				+ countC1 * 1250 +countC2 * 1200 + countC3 *1150;
		//System.out.println();
		System.out.printf("팥의 개수는 %d개이고 슈크림은 %d개이며 초코는 %d개입니다"
				,P,S,C);
		System.out.println();
		System.out.printf("붕어빵의 총 가격은 %d원입니다", total);
		System.out.println();
		System.out.printf("팥-상의 개수는 %d이고 팥-중의 개수는 %d이고 팥-하의 개수는 %d이다",
				countP1,countP2,countP3);
		System.out.println();
		System.out.printf("슈크림-상의 개수는 %d이고 슈크림-중의 개수는 %d이고 슈크림-하의 개수는 %d이다",
				countS1,countS2,countS3);
		System.out.println();
		System.out.printf("초코-상의 개수는 %d이고 초코-중의 개수는 %d이고 초코-하의 개수는 %d이다",
				countC1,countC2,countC3);
	}

}
