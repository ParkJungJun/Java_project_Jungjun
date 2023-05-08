package quiz;
import java.util.Arrays;
import java.util.Scanner;

import myobj.PirateGame;
public class C06_PirateGame {
	/*
	 * 톰아저씨 게임을 만들어보세요
	 * 
	 * (1) 게임이 시작되면 꽝 자리가 정해진다
	 * 
	 * (2) 플레이어는 아저씨가 발사될때까지 계속 자리를 선택해야 한다
	 * 
	 * (3) 칼을 찌를 수 있는 흠은 20개가 있고 그 중 4개가 꽝이 된다
	 * 		(꽝의 위치는 매 판마다 랜덤으로 재설정되어야 한다)
	 * (4) 아저씨가 발사되면 몇 번만에 발사되었는지 알려주는 메세지가 나온다
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] boom = new int[4];
		int count = 0;
		for(int i = 0; i < boom.length; ++i) {
			boom[i] = (int)(Math.random() * 20);		
		}
		System.out.print(Arrays.toString(boom));
		System.out.println();
		for(int j = 0; j < 20; ++j) {
			System.out.print("자리를 입력하세요 : ");
			int num = sc.nextInt();
			++count;
			if(num == boom[0] || num == boom[1] || num == boom[2] ||num == boom[3]) {
				System.out.println("꽝입니다 탈락!");
				break;
			}
		}
		System.out.printf("%d번만에 발사되었습니다!",count);
	}
}
