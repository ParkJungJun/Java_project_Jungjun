package quiz;

import java.util.Random;
import java.util.Scanner;

public class B11_Updown {
	/*
	 *  # Updown 게임을 만들어 보세요
	 *  
	 *  1. 게임이 시작되면 1 ~ 100사이의 랜덤 숫자를 정답으로 선택한다
	 *  
	 *  2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다
	 *  
	 *  3. 만약 사용자가 범위를 벗어나는 숫자를 입력헀다면
	 *     기회를 소진하지 않고 다시 입력할 수 있어야 한다
	 *     
	 *  4. 5번 안에 못맞추면 정답이 뭐였는지 출력해주고 프로그램을 종료한다
	 *  
	 *  5. 또는 사용자가 정답을 맞추면 몇 번만에 맞췄는지 출력해주고 프로그램을 종료한다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran1 = new Random();
		int a = ran1.nextInt(100) + 1;
		System.out.println(a);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();			
		int count = 1;
		for(int i = 0; i < 4; ++i) {
			if(num > 100 || num < 0) {
				System.out.println("다시입력하세요");
				--i;
				num = sc.nextInt();
			}else if(num < a) {			
				System.out.printf("%d번 남음 up\n",4 -i);
				++count;
				num = sc.nextInt();
			} else if(num > a) {
				System.out.printf("%d번 남음 down\n",4 - i);
				++count;
				num = sc.nextInt();
			} else if (num == a){
				System.out.printf("%d번만에 맞췄습니다", count);
				break;
			}
			if(count == 5) {
				System.out.printf("정답은 %d입니다",a);
			}
		}
	}

	

}
