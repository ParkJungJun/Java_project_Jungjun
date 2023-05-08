package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_LottoGame {
	/*
	 * # 로또 게임 만들기
	 * 
	 * 1. 당첨 번호는 7개 매 판 무작위로 선정
	 * 
	 * 2. 플레이어는 번호 6개를 입력해 숫자를 맞춰야 한다
	 * 
	 * 3. 1등, 앞에 6개 숫자를 모두 맞춤 (+20억)
	 * 	  2등, 보너스 번호를 포함한 6개의 숫자를 모두 맞춤 (+7000만원) 
	 *    3등, 5개의 숫자를 모두 맞춤 (보너스 번호 미포함) (+150만원)
	 * 	  4등, 4개의 숫자를 모두 맞춤 (보너스 번호 미포함) (+5만원)
	 * 	  5등, 3개의 숫자를 모두 맞춤 (보너스 번호 미포함) (+5천원)
	 * 
	 * 4. 플레이어가 게임을 종료할때까지 게임이 계속 반복되어야 한다
	 * 
	 * ex>
	 * 
	 * 		1.새 게임 시작 
	 * 		2.자동 구매
	 *  	3. 현재까지의 이력 확인 (현재 사용금액 현황,당첨 횟수) 
	 *		4.게임 종료
	 */
	
	public static String lotto(int num) {
		int[] winNum = new int[7];
		int buyCount = 0;
		if(num == 1) {									
			return "게임 시작";			
		}else if(num == 2){
			for(int i = 0; i < winNum.length; ++i) {				
				int newNum =(int)(Math.random() * 45 + 1);
				for(int chk = 0; chk < i; ++chk) {
					if(winNum[chk] == newNum) {
						newNum = (int)(Math.random() * 45 +1);
						chk = -1;
					}
				}
				winNum[i] = newNum;	
				
			}					
			while(true) {
				int[] userNum = new int[6];				
				for(int i = 0; i < userNum.length; ++i) {					
					int newNum =(int)(Math.random() * 45 + 1);
					for(int chk = 0; chk < i; ++chk) {
						if(userNum[chk] == newNum) {
							newNum = (int)(Math.random() * 45 +1);
							chk = -1;
						}
					}
					userNum[i] = newNum;
				}
				++buyCount;
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
						return "win Number : " + Arrays.toString(winNum)
						+ "bonus Number : " + winNum[6] +"\n2등 당첨? " +Arrays.toString(userNum);
					}else {
						return "win Number : " + Arrays.toString(winNum)
						+ "bonus Number : " + winNum[6] +"\n1등 당첨? " +Arrays.toString(userNum) +
						buyCount + "만에 1등 당첨";					
					}
					
				}
			}
		}else if(num == 3){
			return "";
		}else if(num == 4) {
			return "";
		}else {
			return "error";
		}
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; ++i) {
			System.out.println(lotto(sc.nextInt()));
		}
			
		
		
	}

}
