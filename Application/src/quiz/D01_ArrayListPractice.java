package quiz;

import java.util.ArrayList;

public class D01_ArrayListPractice {
	/*
	 * 1. 리스트에 1000 ~ 2000 사이의 랜덤 정수를 100개 추가하기
	 * 
	 * 2. 원본에서 짝수를 모두 제거한 후 총합 구하기
	 * 
	 * 3. 원본에서 홀수를 모두 제거한 후 총합 구하기
	 */
	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		boolean delete = false;
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		for(int i = 0; i < 100; ++i) {
			l1.add((int)(Math.random()* 1000 + 1000));
			l2.add((int)(Math.random()* 1000 + 1000));
		}
		System.out.println(l1.size());
		System.out.println(l2.size());
		System.out.println(l1);
		System.out.println(l2);
		while(true) {
			for(int i = 0; i < l1.size(); ++i) {
				if(l1.get(i) % 2 == 0) {
				l1.remove(i);
				//delete = l1.remove(l1.get(i));
				}
			
			}
		
			for(int i = 0; i < l2.size(); ++i) {
				if(l2.get(i) % 2 != 0) {
				l2.remove(i);
				}
			
			}
		
		}
//		sum += l1.get(i);
//		sum2 += l2.get(i);
//		System.out.println(delete);
//		System.out.println(sum);
//		System.out.println(l1);
//		System.out.println(l1.size());
//		System.out.println(sum2);
//		System.out.println(l2);
//		System.out.println(l2.size());
	}
		

}
