package defult_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D06_Comparator {
	/*	
	 * 	# Comparable
	 * 
	 * - 이 인터페이스를 구현한 클래스는 크기 비교가 가능해 진다
	 * - 크기 비교가 필요한 상황이 발생하면 comparable() 매서드를 활용한다
	 *   ex> 정렬 등
	 *  # Comparator
	 *  
	 *  - 이 인터페이스를 구현한 클래스는 크기 비교의 기준이 된다
	 *  - 해당 클래스의 인스턴스를 정렬 기준으로 함께 전달할 수 있다
	 */
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		List<Grape> grapes = new ArrayList<>();
		List<Peach> peaches = new ArrayList<>();
		
//		Collections.addAll(nums, 88,10,25,30,3200,400,500);
//		Collections.addAll(grapes,
//				new Grape(4000,40,10,"김씨네 농장"),
//				new Grape(3000,38,9,"박네 농장"),
//				new Grape(3300,35,9,"이씨네 농장"),
//				new Grape(3600,41,7,"송씨네 농장"),
//				new Grape(3700,36,8,"최씨네 농장"));
//		System.out.println("정렬 전 " + nums);
//		System.out.println("정렬 전 " + grapes);
//		Collections.sort(nums);
//		// 기본 정렬은 Comparable이 구현된 객체만 허용한다
//		// - Integer, String 등 기본 클래스들은 Comparable이 구현된 상태
//		//Collections.sort(grapes);
//		//정렬의 기준을 우리가 직접 만들어 전달할 수도 있다
//		Collections.sort(grapes, new 포도알개수검사기());
//		System.out.println("정렬 후 " + nums);
//		System.out.println("정렬 후 " + grapes);
//		Collections.reverse(nums);
//		Collections.reverse(grapes);
//		System.out.println("뒤집은 후" + nums);
//		System.out.println("뒤집은 후" + grapes);
		Collections.addAll(peaches,
				new Peach(4000,40,100,10,"김씨네 농장"),
				new Peach(3000,38,120,9,"박네 농장"),
				new Peach(3300,35,90,9,"이씨네 농장"),
				new Peach(3600,41,110,7,"송씨네 농장"),
				new Peach(3700,36,130,8,"최씨네 농장"),
				new Peach(3700,39,140,9,"임씨네 농장"));
		System.out.println("정렬 전 " + peaches);
		Collections.sort(peaches);
		System.out.println("정렬 후 " + peaches);
		Collections.sort(peaches, new PeachRating());
		System.out.println("등급 정렬 후 " + peaches);
	}

}
// Comparable 인터페이스를 구현하여 크기 비교가 가능한 객체로 만들어주면

class Grape implements Comparable<Grape>{
	String farm;
	int taste;
	int qty;
	int price;
	
	public Grape(int price, int qty, int taste, String farm) {
		this.farm = farm;
		this.price = price;
		this.qty = qty;
		this.taste = taste;
	}
	@Override
	public String toString() {
		
		return String.format("%d/%d/%d/%s\n",price,qty,taste,farm);
	}
	@Override
	public int compareTo(Grape o) {
		// 현재 인스턴스와 매개변수로 전달되는 인스턴스를 비교해야 한다
		// 두 객체의 크가가 같다 : 0을 리턴
		// 두 객체 중 오른쪽의 크기가 더 크다 : -1을 리턴
		if(this.price == o.price) {
			return 0;
		}else if(this.price > o.price) {
			return 1;
		}else {
			return -1;
		}
		
	}
}
// 비교 기준이 될 수 있는 클래스
class 포도알개수검사기 implements Comparator<Grape>{
	
	@Override
	public int compare(Grape o1, Grape o2) {
		if(o1.qty == o2.qty) {
			return 0;
		}else if(o1.qty > o2.qty) {
			return 1;
		}else {
			return -1;
		}
	}
}

// 연습문제1 : 복숭아 클래스를 만들어보세요
//			 복숭아는 가격,맛,무게,등급,농장 등의 필드값을 가지고 있습니다

// 연습문제2 : 복숭아를 정렬할 수 있는 객체로 만들어보세요 (기준 미설정시 무게 기준으로 정렬)

// 연습문제3 : 복숭아를 등급기준으로 오름차순 정렬하고, 등급이 같은경우
//			 가격기준으로 내림차순으로 정렬
// 연습문제4 : 복숭아를 농장이름순으로 오름차순 정렬하고 농장이 같은 경우
//  	     맛 기준 내림차수 정렬을 해주세요

class Peach implements Comparable<Peach>{
	int price;
	int taste;
	int weight;
	int rating;
	String farm;
	
	public Peach(int price, int taste, int weight, int rating, String farm) {
	this.price = price;
	this.taste = taste;
	this.weight = weight;
	this.rating= rating;
	this.farm = farm;
	}
	
	@Override
	public String toString() {
		return String.format("%d,%d,%d,%d,%s\n",price, taste, weight, rating, farm);
	}
	@Override
	public int compareTo(Peach o) {
		if(this.weight == o.weight) {
			return 0;
		}else if(this.weight > o.weight) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
}
class PeachRating implements Comparator<Peach>{
	
	@Override
	public int compare(Peach o1, Peach o2) {
		if(o1.rating == o2.rating) {
			if(o1.price == o2.price) {
				return 0;
			}else if(o1.price < o2.price) {
				return 1;
			}else {
				return -1;
			}
		}else if(o1.rating > o2.rating) {
			return 1;
		}else {
			return -1;
		}
	}
}

class PeachName implements Comparator<Peach>{
	//오름차순
	@Override
	public int compare(Peach o1, Peach o2) {
		String farm1 = o1.farm;
		String farm2 = o2.farm;
		
		int len1 = farm1.length();
		int len2 = farm2.length();
		// 둘중 더 짧은 단어까지 반복한다
		for(int i =0; i < farm1.length() && i <farm2.length(); ++i) {
			char ch1 = farm1.charAt(i);
			char ch2 = farm2.charAt(i);
			if(ch1 == ch2) {
				continue;
			}else {
				return ch1 - ch2;
			}
		}
		// 두 단어 중 더 짧은 단어까지는 모두 일치했다
		if(len1 == len2) {
			return o2.taste - o1.taste;
		}else {
			return len1 - len2;
		}
		
	}
	
}

class PeachName2 implements Comparator<Peach>{
//내림차순
	@Override
	public int compare(Peach o1, Peach o2) {
		if(o1.farm.equals(o2.farm)) {
			return o1.taste - o2.taste;
		}
		
		return o1.farm.compareTo(o2.farm);
	}
	
}
