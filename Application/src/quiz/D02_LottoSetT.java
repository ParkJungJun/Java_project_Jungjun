package quiz;

import java.util.HashSet;

public class D02_LottoSetT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size() < 7) {
			lotto.add((int)(Math.random() * 45 +1));
		}
		System.out.println(lotto);
	}

}
