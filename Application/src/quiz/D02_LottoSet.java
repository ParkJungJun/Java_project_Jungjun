package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class D02_LottoSet {
	/*
	 * HashSet을 이용해 1 ~ 45 사이의 중복없는 7개의 랜덤 숫자를 생성해보세요
	 */
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		
		
		while(true) {
			lotto.add((int)(Math.random() * 45 +1));
			if(lotto.size() == 7) {
				break;
			}
		}
		
		System.out.println(lotto);
		
		
	}
}
