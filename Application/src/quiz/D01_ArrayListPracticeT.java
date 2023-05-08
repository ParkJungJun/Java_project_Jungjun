package quiz;

import java.util.ArrayList;
import java.util.List;

public class D01_ArrayListPracticeT {
	/*
	 * 1. 리스트에 1000 ~ 2000 사이의 랜덤 정수를 100개 추가하기
	 * 
	 * 2. 원본에서 짝수를 모두 제거한 후 총합 구하기
	 * 
	 * 3. 원본에서 홀수를 모두 제거한 후 총합 구하기
	 */
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < 100; ++i) {
			numbers.add((int)(Math.random() * 1001 + 1000));
		}
		System.out.println(numbers);
		System.out.println(numbers.size());
		List<Integer> evens = new ArrayList<>();
		// remove()를 할때마다 size()가 줄어든다
		for(int i = 0; i <numbers.size(); ++i) {
			if(numbers.get(i) % 2 == 0) {
				evens.add(numbers.remove(i--));
				
			}
		}
		System.out.println("남아있는 리스트" + numbers);
		System.out.println("짝수 리스트" + evens);
		int sum = 0;
		for(int i = 0; i <numbers.size(); ++i) {
			sum += numbers.get(i);
		}
		System.out.println("2번 답 " + sum);
		//System.out.println(numbers.size() + evens.size());
		List<Integer> odds = new ArrayList<>();
		for(int i = 0; i <numbers.size(); ++i) {
			if(numbers.get(i) % 2 == 1) {
				odds.add(numbers.remove(i--));
				
			}
		}
		System.out.println("남은 리스트" + numbers);
		System.out.println("홀수 리스트" + odds);
	}
}
