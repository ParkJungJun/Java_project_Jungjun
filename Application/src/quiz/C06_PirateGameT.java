package quiz;

import java.util.Scanner;

import myobj.Tong;

public class C06_PirateGameT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Tong t = new Tong();
		int count = 0;
		while (true) {
			//통의 현황을 보여주는 기능
			t.screen();
			System.out.printf("어디를 찌르실건가요 (%d회 생존) >>",t.count);
			int num = sc.nextInt();
			
			//통을 찌르는 기능
			t.stab(num);
			
			if(t.die) {
				System.out.println("아저씨는" + t.count+ "회 생존했습니다.");
				break;
			}
		}
	}

}
