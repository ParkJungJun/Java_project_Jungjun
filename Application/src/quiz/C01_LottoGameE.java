package quiz;
import java.util.Arrays;
import java.util.Scanner;
public class C01_LottoGameE {
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
		int repetition = 0;
		//int winCount = 0;
		int[] userNum = new int[6];
		for(int i = 0; i < winNum.length; ++i) {
			
			int newNum =(int)(Math.random() * 45 + 1);
			for(int chk = 0; chk < i; ++chk) {			
				if(winNum[chk] == newNum) {
					newNum = (int)(Math.random() * 45 +1);
					chk = -1;					
				}
			}
			winNum[i] = newNum;
			//System.out.print(winNum[i] + ", ");
		}
		if(num == 1) {
			return "게임시작 win Number : " + Arrays.toString(winNum)
			+ " bonus Number : " + winNum[6];
		}else if(num == 2) {
			//System.out.println(Arrays.toString(winNum));
			//while(repetition < 5) {				
				for(int i = 0; i < userNum.length; ++i) {
					
					int newNum =(int)(Math.random() * 45 + 1);
					for(int chk = 0; chk < i; ++chk) {
						if(userNum[chk] == newNum) {
							newNum = (int)(Math.random() * 45 +1);
							chk = -1;
						}
					}
					userNum[i] = newNum;
					//repetition++;
					//return userNum[i] + ", ";
				}
				++buyCount; //중복되지 않는 번호 한 세트를 완성할때마다 구매 횟수 1증가
				// userNum에 winNum과 일치하는 번호가 6개면 1등 또는 2등 당첨
				//return "자동 구매 user Number : " + Arrays.toString(userNum);
			
				int winCount = 0;
				int winCount2 = 0;
				boolean hasBonus = false;
				for(int i = 0; i <userNum.length; ++i) {
					hasBonus |= userNum[i] == winNum[6];
					for(int j =0; j <winNum.length; ++j) {
						if(userNum[i] == winNum[j]){
							++winCount;
						}	
					}
				}
				for(int i = 0; i <userNum.length; ++i) {
					for(int j =0; j <winNum.length; ++j) {
						if(userNum[i] == winNum[j]){
							++winCount2;
						}	
					}
				}
				if(winCount == 6) {	
					if(hasBonus) {
						return "자동 구매 user Number : " + Arrays.toString(userNum)+
								"2등 당첨 ";
					}else {
						return "자동 구매 user Number : " + Arrays.toString(userNum)+
								"1등 당첨 ";						
					}				
				}else if(winCount2 == 5) {
					return "자동 구매 user Number : " + Arrays.toString(userNum)+
							"3등 당첨";			
				}else if(winCount2 == 4) {
					return "자동 구매 user Number : " + Arrays.toString(userNum)+
							"4등 당첨";
				}else if(winCount2 == 3) {
					return "자동 구매 user Number : " + Arrays.toString(userNum)+
							"5등 당첨";
				}else {
					return "자동 구매 user Number : " + Arrays.toString(userNum)+
							"꽝";
				}
			//}
			
			
		}else if(num == 4) {
			return "종료";
		}else {
			return "error";			
		}
		//return "버그";
		
		
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//lotto(sc.nextInt());
		while(true) {
			System.out.println(lotto(sc.nextInt()));
		}
	}

}
