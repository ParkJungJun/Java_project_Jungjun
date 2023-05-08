package defult_package;
public class B09_InnerLoop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 내부에 반복문 사용하기
		
		for(int  i = 0; i < 10; ++i) {
			System.out.println("======================================바깥쪽 반복문" + i);
			for(int j = 0; j < 5; ++j) {
				System.out.println("------------안쪽 반복문" + j);
				
				for(int k = 0; k < 3; ++k) {
					System.out.println("++++제일 안쪽 반복문" + k);
				}
			}
		}
		/*
		 * # 다중 반복문으로 구구단 출력하기
		 * 
		 * - 각 단마다 x1 ~ x9까지 있다
		 */
		for(int dan = 2; dan <= 9; ++dan) {
			System.out.printf("====%d단====\n", dan);
			for(int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%d x %d = %d\n", dan, gop, dan * gop);
			}
			System.out.println();
		}
	}
	
}
