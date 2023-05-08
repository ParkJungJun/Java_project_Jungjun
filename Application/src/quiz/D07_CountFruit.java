package quiz;

import java.util.HashMap;

public class D07_CountFruit {
	
	// 다음 과일들로 이루어진 1000개 크기의 String 타입 랜덤 배열을 생성하고
	// 각 과일이 몇 번 등장했는지 세어보세요
	public static String[] fruits =
		{"Apple", "Banana", "Mango", "Grape","Peach",
				"Watermelon","Pineapple","Pitaya"
		};
	public static void main(String[] args) {
		HashMap<Integer, String> r1 = new HashMap<>();
		HashMap<String, Integer> r2 = new HashMap<>();
		String[] ran = new String[1000];
		int countA = 0;
		int countB = 0;
		int countM = 0;
		int countG = 0;
		int countP = 0;
		int countW = 0;
		int countP2 = 0;
		int countP3 = 0;
		for(int i = 0; i < ran.length; ++i) {
			ran[i] = fruits[(int)(Math.random() * fruits.length)];
			//System.out.println(ran[i]);
			r1.put(i,ran[i]);
			if(ran[i].equals("Apple") ) {
				++countA;
			}else if(ran[i].equals("Banana") ) {
				++countB;
			}else if(ran[i].equals("Mango") ) {
				++countM;
			}else if(ran[i].equals("Grape") ) {
				++countG;
			}else if(ran[i].equals("Peach") ) {
				++countP;
			}else if(ran[i].equals("Watermelon") ) {
				++countW;
			}else if(ran[i].equals("Pineapple") ) {
				++countP2;
			}else {
				++countP3;
			}
		}
		r2.put("Apple", countA);
		r2.put("Banana", countB);
		r2.put("Mango", countM);
		r2.put("Grape", countG);
		r2.put("Peach", countP);
		r2.put("Watermelon", countW);
		r2.put("Pineapple", countP2);
		r2.put("Pitaya", countP3);		
		
		System.out.println(r1);
		System.out.print(countA + "\t");
		System.out.print(countB + "\t");
		System.out.print(countM + "\t");
		System.out.print(countG + "\t");
		System.out.print(countP + "\t");
		System.out.print(countW + "\t");
		System.out.print(countP2 + "\t");
		System.out.println(countP3);
		System.out.println(r2);
		
	}

}
