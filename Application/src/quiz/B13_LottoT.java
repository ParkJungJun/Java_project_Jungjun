package quiz;

import java.util.Arrays;

public class B13_LottoT {
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
		int[] winNum = new int[7];
		
		//새로 숫자를 추가하기 전에 예전 숫자를 중에 그 숫자가 존재하는지 검사
		
		for(int i = 0; i < winNum.length; ++i) {
			
			int newNum =(int)(Math.random() * 45 + 1);
			for(int chk = 0; chk < i; ++chk) {
				// 새로 뽑은 숫자와 같은 숫자가 발견되면 새 번호를 뽑고
				// chk를 다시 -1로 처음부터 검사한다
				// -1인 이유는 위에서 ++chk가 되기때문에 0이 되서 이다
				if(winNum[chk] == newNum) {
					newNum = (int)(Math.random() * 45 +1);
					chk = -1;
					//System.out.print("중복");
				}
			}
			winNum[i] = newNum;
			//System.out.print(winNum[i] + ", ");
		}
		
		// 배열을 간편하게 출력하는 방법
		// Arrays.toString(arr) :전달한 배열을 보기 좋은 형태의 문자열로 반환
		System.out.println("win Number : " + Arrays.toString(winNum));
		
		System.out.println("bonus Number : " + winNum[6]);
		
		int buyCount = 0;
		while (true) {
			int[] userNum = new int[6];
			
			for(int i = 0; i < userNum.length; ++i) {
				
				int newNum =(int)(Math.random() * 45 + 1);
				for(int chk = 0; chk < i; ++chk) {
					// 새로 뽑은 숫자와 같은 숫자가 발견되면 새 번호를 뽑고
					// chk를 다시 -1로 처음부터 검사한다
					// -1인 이유는 위에서 ++chk가 되기때문에 0이 되서 이다
					if(userNum[chk] == newNum) {
						newNum = (int)(Math.random() * 45 +1);
						chk = -1;
						//System.out.print("중복");
					}
				}
				userNum[i] = newNum;
				//System.out.print(winNum[i] + ", ");
			}
			++buyCount; //중복되지 않는 번호 한 세트를 완성할때마다 구매 횟수 1증가
			// userNum에 winNum과 일치하는 번호가 6개면 1등 또는 2등 당첨
			//System.out.println("user Number : " + Arrays.toString(userNum));
			int winCount = 0;
			boolean hasBonus = false;
			for(int i = 0; i <userNum.length; ++i) {
				hasBonus |= userNum[i] == winNum[6];
				for(int j =0; j <winNum.length; ++j) {
					if(userNum[i] == winNum[j]){
						++winCount;
					}
						
				}
			}
			if(winCount == 6) {
				
				if(hasBonus) {
					System.out.println("2등 당첨? " +Arrays.toString(userNum));
				}else {
					System.out.println("1등 당첨? " +Arrays.toString(userNum));
					System.out.println(buyCount + "만에 1등 당첨");
					break;
				}
				
			}
		}
	}

}
