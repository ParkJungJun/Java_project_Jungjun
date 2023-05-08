package quiz;
import java.util.Arrays;
import myobj.Potterwheel;
public class C11_Potterwheel {
	/*
	 * 돌림판을 돌려서 경품을 추첨하는 프로그램을 만들어보세요
	 * 
	 * (1) 각 경품은 한정된 수량이 있으며 이는 경품마다 다를 수 있다
	 * 
	 * (2) 각 경품들이 나올 수 있는 확률이 모두 다르며 수량이 모두 소진된 상품은 당첨될 수 없다
	 */
	public static void main(String[] args) {
		int[] ran = new int[100];
		
		//ran = (int)(Math.random() * 100) +1;
		
		Potterwheel p1 = new Potterwheel("냉장고", 2, 9);
		Potterwheel p2 = new Potterwheel("꽝", 100, 50);
		Potterwheel p3 = new Potterwheel("청소기", 4, 11);
		Potterwheel p4 = new Potterwheel("컴퓨터", 5, 12);
		Potterwheel p5 = new Potterwheel("자동차", 1, 8);
		Potterwheel p6 = new Potterwheel("세탁기", 3, 10);
		for(int i = 0; i < ran.length; ++i) {
			int ran1 = (int)(Math.random() * 100) ;
			for(int chk = 0; chk < i; ++chk) {
				if(ran[chk] == ran1) {
					ran1 = (int)(Math.random() * 100);
					chk = -1;
				}
				ran[i] = ran1;
			}
			//System.out.println(ran[i]);
			if(ran[i] <= 100 && ran[i] > 92) {
				p5.MinusProbability();
				System.out.println(p5);
				p5.zeroProbability();
			}else if(ran[i] <= 92 && ran[i] > 83) {
				p1.MinusProbability();
				System.out.println(p1);
				p1.zeroProbability();
			}else if(ran[i] <= 84 && ran[i] > 73) {
				p6.MinusProbability();
				System.out.println(p6);
				p6.zeroProbability();
			}else if(ran[i] <= 73 && ran[i] > 62) {
				p3.MinusProbability();
				System.out.println(p3);
				p3.zeroProbability();
			}else if(ran[i] <= 62 && ran[i] > 50) {
				p4.MinusProbability();
				System.out.println(p4);
				p4.zeroProbability();
			}else {
				p2.MinusProbability();
				System.out.println(p2);
			}
		}
			//System.out.println(Arrays.toString(ran));
			//System.out.println(ran1 + "번");
//			if(ran1 >= 1 && ran1 <= 9) {
//				p1.MinusProbability();
//				System.out.println(p1);
//				
//			}else if(ran >= 20 && ran <= 31) {
//				p3.MinusProbability();
//				System.out.println(p3);
//				
//			}else if(ran >= 40 && ran <= 52) {
//				p4.MinusProbability();
//				System.out.println(p4);
//				
//			}else if(ran >= 60 && ran <= 8) {
//				p5.MinusProbability();
//				System.out.println(p5);
//				
//			}else if(ran >= 90 && ran <= 100) {
//				p6.MinusProbability();
//				System.out.println(p6);
//				
//			}else {
//				p2.MinusProbability();
//				System.out.println(p2);
//			}
//		}	
	}

}
