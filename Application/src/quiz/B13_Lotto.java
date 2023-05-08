package quiz;

public class B13_Lotto {
	/*
	 * 1. 1 ~ 45 사이의 중복 없는 랜덤 숫자 7개를 생성하여 당첨 번호를 만들어보세요
	 * 
	 * 2. 당첨될때까지 랜덤 로또 번호를 계속 생성하여 몇 번 만에 당첨되었는지 출력해보세요
	 * 
	 *	(1) 로또 구매자는 번호를 6개씩 고를 수 있다
	 *	(2) 7개의 번호 중 6개의 번호가 모두 일치하더라도 마지막 번호가 포함되어있으면 2등
	 *	(3) 마지막 번호가 포함되지 않은채로 6개의 번호가 일치하면 1등
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto = new int[7];
//		int count = 0;
//		String temp = "";
//		String temp2 = "";
		int[] lotto2 = new int[7];
		for(int i = 0; i < lotto.length; ++i) {
			lotto[i] = (int)(Math.random() * 45) +1;
			System.out.printf("%d ",lotto[i]);
		}
		System.out.println();
//		
		for(int i = 0; i < lotto2.length; ++i) {
			lotto2[i] = (int)(Math.random() * 45) +1;
			System.out.printf("%d ",lotto2[i]);
//			temp2 += lotto2[i];
		}
//		System.out.println();
//		System.out.print(temp);
//		System.out.println();
//		System.out.print(temp2);
//		System.out.println();
//		
//		for(int i = 0; i < 1000000000; ++i) {
//			if(!(temp.equals(temp2))) {
//				temp2 = "";
//				for(int i2 = 0; i2 < 7; ++i2) {
//					lotto2[i2] = (int)(Math.random() * 45) +1;
//					temp2 += lotto2[i2];
//					++count;
//				}
//			}
//			else if(temp.equals(temp2)) {
//				System.out.print(count);
//			}
//		}
//		System.out.print(temp2);
//		System.out.print(count);
	}

}
