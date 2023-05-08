package quiz;

public class B06_ForQuizT {
	public static void main(String[] args) {
		// for문안에 if문도 함께 사용할 수 있다
		//1. 1000 ~ 2000 사이의 8의 배수를 모두 출력해보세요
		for(int a = 1000; a <= 2000; ++a) {
			if (a % 8 == 0) {
				System.out.println(a);
			}
		}
		//2. 100부터 300까지의 총합을 구해보세요
		int total = 0;
		
		for (int num =100; num <=300; ++num) {
			total += num;
		}
		System.out.println(total);
		
		
		//3. 1000부터 1500까지 10의 배수를 한 줄에 7개씩 출력해보세요
		// 초기값 선언하는 장소에 한번에 여러 변수를 초기화 할 수 있다
		for (int num =1000, count = 1; num <= 1500; ++ num) {
			if (num % 10 == 0) {
				System.out.printf("%d[%d번째] ",num,count);
			
				// count가 10의 배수일떄만 증가해야 한다
				// 후위 표기법을 사용해 비교를 먼저 한 뒤 count가 증가한다
				if(count++ ==7) {
					System.out.print('\n');
					count = 1; //줄을 한번 바꾸고 나면 count를 다시 0으로 초기화
				}
			}
			
			
		}
	}
}
