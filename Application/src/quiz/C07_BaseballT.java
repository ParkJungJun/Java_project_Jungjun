package quiz;

import java.util.Scanner;

import myobj.BaseballT;

public class C07_BaseballT {
	/*
	 *  # 숫자 야구 게임
	 *  
	 *  - 게임이 시작되면 정답이 랜덤으로 생성된다
	 *  - 정답은 랜덤 4자리의 중복없는 숫자
	 *  - 플레이어에게는 9번의 기회가 주어지며 4자리의 숫자를 마음대로 입력할 수 있다
	 *  - 플레이어가 중복되는 숫자를 입력하는 경우 다시 입력하게 한다
	 *  - 플레이어가 입력한 숫자의 번호와 위치가 모두 맞으면 스트라이크라고 한다
	 *  - 플레이어가 입력한 숫자의 번호는 맞되 위치가 틀리면 볼이라고 한다
	 *  - 9번의 기회안에 모든 숫자와 위치를 맞추면 사용자의 승리다
	 *  - 모든 기회 소진시 플레이어의 패배
	 *  ex> 정답이 3791인 경우
	 *  
	 *  	사용자 - 9081이라고 입력하면 1strike 1ball
	 */
	public static void main(String[] args) {
		BaseballT b1 = new BaseballT();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 야구 시작!!");
		while (!b1.isEnd()) {
			System.out.printf("숫자 4개(기회 %d) >> ",b1.chance);
			String number =sc.nextLine();
			
			// 스트라이크와 볼 체크
			if(BaseballT.isBeseballGameString(number)) {
				int[] count = b1.check(number);
				
				System.out.printf("%d strike %d ball", count[0], count[1]);
			}else {
				System.out.println("올바른 숫자를 입력해주세요...");
			}
			
			
			
//			System.out.println(number + "유효한 숫자인가요?" +
//					BaseballT.isBeseballGameString(number));
		}
		System.out.printf("게임이 끝났습니다. 플레이어의 %s입니다",b1.result);
	}

}
