package quiz;

import java.util.Scanner;

import myobj.Baseball;

public class C07_Baseball {
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
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Baseball b1 = new Baseball();
		int strike = 0;
		int ball = 0;
		b1.info();
		b1.re();
		System.out.println(b1.re());
		if(b1.a() == b1.b()) {
			
		}
		int count = 0;
		for(int i = 0; i < 9; ++i) {
			int answer = sc.nextInt();
			//System.out.println(answer);
			
			for(int j = answer; j > 0; j /= 10) {
				++count;
				//System.out.println(count);
			}
			
			if(answer == b1.answer()) {
				System.out.printf("%d번만에 맞추셔서 승리하셨습니다",i + 1);
			}else if(count != 4) {
				System.out.println("4자리숫자를 입력하세요");
				--i;
				count = 0;
			}else if(count == 4) {
				count = 0;
			}
			
			
			
		}
		
	}

}
