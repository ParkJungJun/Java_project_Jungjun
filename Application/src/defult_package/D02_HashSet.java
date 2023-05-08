package defult_package;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {
	/*
	 * 
	 * 
	 * # Set
	 * 
	 * - 집합을 클래스로 구현해 놓은 것
	 * - 중복을 허용하지 않는다
	 * 
	 * # Hash
	 * 
	 * - 같은 값을 넣으면 항상 일정한 값이 나와야 하는 단방향성 알고리즘
	 * - 중복 체크에 많이 사용된다
	 * - 해쉬의 결과는 규칙적이지 않기 때문에 순서를 알 수 없다
	 * 
	 *   "apple" -> "F1589460A"
	 *   "cat" -> "135S181C"
	 * 
	 * # java.util.HashSet
	 * 
	 * - 해쉬 알고리즘을 사용하는 Set
	 * - 중복된 데이터를 허용하지 않으며 순서가 없다 (index가 없다)
	 * 
	 */
	public static void main(String[] args) {
		
		HashSet<Integer> num = new HashSet<>();
		Set<Integer> num2 = new HashSet<>();
		//add(item)
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		
		System.out.println(num);
		
		//forEach : 값을 하나씩 꺼내서 대입하여 반복한다
		for (Integer num3 : num) {
			System.out.println(num3);
		}
		// remove(item) : 인데스가 없기 때문에 값으로만 지울 수 있다
		num.remove(40);
		System.out.println(num);
		
		// addAll(Collecttion) : 리스트를 더해 중복을 제거하는것도 가능하다
		List<Integer> numList = new ArrayList<>();
		numList.add(100);
		numList.add(100);
		numList.add(100);
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(300);
		
		num.addAll(numList);
		System.out.println(num);
		
		// removeAll(Collection)
		// 전달한 컬랙션에 들어있는 값과 일치하는 값을 Set에서 지운다
		num.removeAll(numList);
		System.out.println(num);
		
		// 컬랙션은 다른 컬랙션으로의 변환이 자유롭다
		List<Integer> list1 = new ArrayList<>(num);
		System.out.println(list1);
	}
}
