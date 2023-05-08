package quiz;

public class B08_ContinueQuizT {
	public static void main(String[] args) {
		
		// 1. 1부터 100사이에 있는 3의 배수를 모두 출력
		for(int i =0; i <= 100; ++i) {
			// 3의 배수가 아니면 출력하지 않고 다음 반복으로 넘어간다
			if(i % 3 != 0) {
				continue;
				
			}
			System.out.print(i + " ");
		}
		System.out.println();
		// 2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들을 모두 출력
		int sum = 0;
		for(int i = 1; i <= 200; ++i) {
			if(i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.print(sum);
	}
}
