package quiz;

import myobj.PotterwheelT;

public class C11_PotterwheelT {
	/*
	 * 돌림판을 돌려서 경품을 추첨하는 프로그램을 만들어보세요
	 * 
	 * (1) 각 경품은 한정된 수량이 있으며 이는 경품마다 다를 수 있다
	 * 
	 * (2) 각 경품들이 나올 수 있는 확률이 모두 다르며 수량이 모두 소진된 상품은 당첨될 수 없다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PotterwheelT PW = new PotterwheelT();
		PotterwheelT PW2 = new PotterwheelT();
		PW.addPrize(new myobj.Prize("초코파이", 0, 1000, 0.013));
		int count = 0;
		while (true){
			// 같은 패키지에 같은 이름의 클래스가 존재하는 경우 import를 사용할 수 없다
			// 이럴 때에는 패키지명을 제대로 명시해 두 클래스를 구분해야 한다
			myobj.Prize prize= PW.wheel(); 
			
			System.out.printf("%d번째: %s\n", count++, prize);
			
			if(prize != null && prize.getQty() == 0) {
				break;
			}
		}
		
	}

}
