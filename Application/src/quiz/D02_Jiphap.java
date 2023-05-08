package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_Jiphap {
	/*
	 * 1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
	 *    [1,2,3] + [2,3,4,5] => [1,2,3,4,5]
	 *    
	 * 2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
	 *    [1,2,3] 교 [2,3,4,5] => [2,3]
	 *    
	 * 3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
	 *    [1,2,3] - [2,3,3,4] => [1]
	 *    [2,3,4,5] - [1,2,3] => [4,5]
	 */
	// List, Set은 Collection타입으로 업캐스팅이 가능하다
	public static Set union(Collection A, Collection B) {
		//원본을 훼손시키지 않도록 내 컬렉션에 담아서 합집합을 구한다
		Set hap = new HashSet();
		hap.addAll(A);
		hap.addAll(B);
		
		return hap;
	}
	
	public static Set intersection(Collection A, Collection B) {
		//A.retainAll(B);
		Set inter = new HashSet<>();
		inter.addAll(A);
		// retainAll(collection) : 일치하는 값만 남긴다
		inter.retainAll(B);
//		for(Object a : A) {
//			for(Object b : B) {
//				if(a.equals(b)) {
//					inter.add(a);
//				}
//			}
//		}
		return inter;
	}
	
	public static Set difference(Collection A, Collection B) {
		Set s = new HashSet<>();
		
		s.addAll(A);
		s.removeAll(B);
		
		return s;
	}
	
	public static void main(String[] args) {
		List<String> animals1 = new ArrayList<>();
		Set<String> animals2 = new HashSet<>();
		
		animals1.add("사자");
		animals1.add("호랑이");
		animals1.add("돼지");
		animals1.add("소");
		
		animals2.add("돼지");
		animals2.add("소");
		animals2.add("칠면조");
		animals2.add("오리");
		// 합집합
		Set hap = union(animals1, animals2);
		System.out.println(hap);
		// 교집합
		Set gyo = intersection(animals1, animals2);
		System.out.println(gyo);
		// 차집합
		Set cha = difference(animals1, animals2);
		System.out.println(cha);
		// 차집합 (집합2에서 집합1빼기)
		Set cha2 = difference(animals2, animals1);
		System.out.println(cha2);
	}

}
