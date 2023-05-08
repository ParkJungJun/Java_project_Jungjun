package quiz;

public class B06_ForQuiz {
	
	/*
	 *   1. 1000 ~ 2000 사이의 8의 배수를 모두 출력해보세요
	 *   
	 *   2. 100부터 300까지의 총합을 구해보세요
	 *   
	 *   3. 1000부터 1500까지 10의 배수를 한 줄에 7개씩 출력해보세요
	 */
	public static void main(String[] args) { 
		
		for(int a = 1000; a <= 2000; a += 8) { // a % 8 == 0
			System.out.println(a);
		}
		int b = 0;
		for (int a = 100; a < 301; ++a) {
			b += a;
		}
		System.out.println(b);
		int z = 0;
		for (int a = 1000; a <= 1500; a+=10) {
			z += 1;
			if(z % 7 == 0) {
				System.out.print(a);
			}
			
		}
	}
}
