package quiz;

import java.util.ArrayList;
import java.util.Scanner;

import myobj.Blackjack;

public class D05_Blackjack {
	/*
	 * www.247blackjack.com
	 * 
	 * 1. 컴퓨터(딜러)와 사람(플레이어)가 카드를 뽑는다.
	 * 
	 * 2. 처음에는 둘 모두 2장씩 받는다. 이 때 딜러의 카드는 한장 가려놓는다.
	 * 
	 * 3. 플레이어는 카드를 받은 후 상황을 보고
	 *    더 뽑을지(hit) 그만 뽑고 여기서 멈출지(stand)를 결정한다.
	 *    hit를 선택하면 플레이어만 카드를 한 장 더 받는다.
	 *    
	 * 4. 플레이어가 stand를 선택하면 정해진 규칙에 따라 딜러가
	 *    뒤집어 놨던 카드를 오픈하고 카드를 마저 뽑는다.
	 *    딜러는 의사 결정을 할 수 없고 정해진 규칙에만 따라야 한다.
	 *    
	 *    ※ 딜러의 규칙 - 가진 카드 합이 16이하라면 뽑는다. 17이상이면 멈춘다.
	 *    
	 * 5. A는 1로 쓸 수도 있고 11로 쓸 수도 있다.
	 * 
	 * 6. J, Q, K는 모두 10의 가치를 지닌다
	 * 
	 * 7. 가진 카드의 합이 21을 넘으면 버스트
	 *    플레이어가 버스트를 당하면 딜러는 카드를 뽑지도 않고 승리한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Start 2. Close");
		int input = sc.nextInt();
		Blackjack b = new Blackjack();
		ArrayList bList = new ArrayList();
		while(true) {
			if(input == 1) {
				b.startPlayer();
				b.startDealer();
				System.out.println(b.player);
				System.out.println(b.dealer);
				System.out.println("3.Hit 4.Stand");
				input = sc.nextInt();
			}else if(input == 2){
			System.out.println("게임을 종료합니다");
			break;
			}
			if(input == 3) {
				System.out.println("Hit을 선택하셨습니다");
				b.hit();
				b.dealerHit();
				System.out.println(b.player);
				System.out.println(b.dealer);
				input = sc.nextInt();
			}else if(input == 4){
				b.dealerHit();
				System.out.println("Stand를 선택하셨습니다");
				System.out.println(b.dealer);
				input = sc.nextInt();
			}
		}
		
		
		
		
	}

}
