package quiz;

import java.util.Scanner;

import myobj.Game_31T;

public class C06_31GameT {
   /*
      # 31 game
   
      1. 처음에 게임에 참여하는 인원을 설정한다.
         (최소 2명 이상이어야 한다.)
   
      2. 이전 사람이 골랐던 숫자로 부터 +1 ~ +3의 숫자까지
         입력할 수 있어야 한다.
         (숫자를 처음 부르는 사람도 1 ~ 3중에 골라야 한다.)
   
      3. 31을 말하게 되는 사람이 패배한다.
    */
   public static void main(String[] args) {
      
	   Game_31T game = new Game_31T();
      Scanner sc = new Scanner(System.in);
      
      System.out.print("몇인용 >> ");
      game.setAllPlayer(sc.nextInt());
      
      while (true) {
         game.screen();
         int select;
         
         while (true) {
            System.out.printf("[플레이어%d의 차례]\n", game.getPlayer());
            // 내가 입력할 수 있는 숫자의 범위를 벗어나면 다시 입력
            System.out.printf("숫자를 고르세요 (%d ~ %d) >> ", 
                  game.getSelectableMinNum(),
                  game.getSelectableMaxNum());
            select = sc.nextInt();
            
            if (game.checkSelectAbleNum(select)) {
               break;
            }
            System.out.println("다시 골라주세요!");
         }
         
         // 100% 올바른 숫자가 도착함
         boolean end = game.next(select);
         
         if (end) {
            System.out.printf("플레이어 %d의 패배!!\n", game.getPlayer());
            break;
         }
      }
   }
}
