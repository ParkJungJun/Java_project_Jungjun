package quiz;

import java.util.Scanner;

import myobj.Game_31;

public class C06_31Game {
	/*
	 *  # 31 Game
	 *  
	 *  1.게임에 참여하는 인원을 설정한다
	 *  최소 2명 이상이여야 한다
	 *    
	 *  2. 번갈아가면서 숫자로 부터 +1 ~ +3의 숫자까지
	 *     입력할 수 있어야 한다
	 *     (숫자를 처음 부르는 사람도 1 ~ 3중에 골라야 한다)
	 *  
	 *  3. 31을 말하게 되는 사람이 패배한다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Game_31 g1 = new Game_31();
		g1.info();
		int num = sc.nextInt();
		int count = 0;
		int countB = 0;
		int user = 1;
		while(true) {
			g1.howMany(num);
			System.out.println(g1.howMany(num));
			if(num < 2) {
			num = sc.nextInt();
			}else {
				break;
			}
		}
//		countC = num;
		System.out.printf("참여 인원은 %d명입니다\n",num);
		System.out.println("숫자를 입력해주세요");
		count = sc.nextInt();
		countB += count;
		for(int i = 0; i <num; ++i) {
			while(true) {
			
			g1.count(countB);
			System.out.printf("%d번째님의 입력받은 숫자는 %d입니다\n",user ,g1.count(count));
			++user;
			if(user > num) {
				user = 1;
			}
				if(g1.count(count) > 3 || g1.count(count) < 1) {
					System.out.println("1부터 3사이의 숫자를 입력해주세요");
					count = sc.nextInt();
//					user = 1;
//					countB = 0;
				}else if(countB >= 1){
					
					System.out.printf("현재 숫자는 %d입니다\n",countB);
					count = sc.nextInt();
					countB += count;
					if(countB >= 31) {
						System.out.printf("%d번째님은 패배하셨습니다!", user);
						break;
					}
				}else if(countB < 1) {
					count = sc.nextInt();
				
//					countB += count;
					
				}
			}
			
		}
		
		
	}

}
