package quiz;

import java.util.Arrays;

public class B13_Sort {
	/*
	 * 1~100 사이의 랜덤 정수 값이 30개 들어있는 배열을 생성한 후
	 * 
	 * (1) 해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 만들어 출력
	 * 		(오름차순, Ascending)
	 * 
	 * (2) 해당 배열의 내용을 큰 값 부터 차례대로 저장한 새로운 배열을 만들어 출력
	 * 		(내림차순, Descending)
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ran = new int[30];
		int[] ran2 = new int[30];
		int temp = 0;
		int temp2 = 0;
		for(int i = 0; i <ran.length; ++i) {
			int a = (int)(Math.random() * 100 + 1);
			ran[i] = a;
			ran2[i] = a;
			for(int j = 0; j < i; ++j) {							
				if(ran[j] >= ran[i]) {
					temp = ran[j];
					ran[j] = ran[i];
					ran[i] = temp;					
				}
			}
			for(int j = 0; j < i; ++j) {								
				if(ran2[j] <= ran2[i]) {
					temp2 = ran2[j];
					ran2[j] = ran2[i];
					ran2[i] = temp2;					
				}
			}
		}
		//System.out.println();
		System.out.println(Arrays.toString(ran));
		System.out.println();
		System.out.println(Arrays.toString(ran2));
		
		
		
		
		
		
		
				
				
				
			
		
	}

}
