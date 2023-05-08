package defult_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D08_String {
	
	/*
	 * 
	 */
	
	public static void main(String[] args) {
		
		String fruits = "apple/banana/orange/kiwi/strawbarry/pineapple/blueberry";
		
		// "".split(delin) : 문자열을 원하는 기준으로 잘라서 문자열 배열로 반환
		
		String[] arr = fruits.split("/");
		for(String fruit : arr) {
			System.out.println(fruit);
		}
		System.out.println(Arrays.toString(arr));
		
		// String.join(delin,iterable)
		// : 모든 요소를 delimiter로 이어붙여서 하나의 문자열로 만든다
		// ※ iterable = 배열,리스트 등 하니씩 순서대로 꺼낼 수 있는 것
		List<String> snacks = new ArrayList<>();
		
		snacks.add("칸쵸");
		snacks.add("시리얼");
		snacks.add("초코파이");
		snacks.add("몽쉘");
		
		Set<String> snackSet = new HashSet<>(snacks);
		
		String result = String.join(", ",arr);
		System.out.println(result);
		
		result = String.join("++", snacks);
		System.out.println(result);
		
		result = String.join("--", snackSet);
		System.out.println(result);
		
		// "".Contains(str) : 해당 문자열에 전달한 문자열이 포함되었는지 확인
		System.out.println("apple? " + fruits.contains("apple"));
		System.out.println("apple? " + fruits.contains("waffle"));
		
		// "".startsWith(str) : 해당 문자열이 전달한 문자열로 시작하는지 확인
		// "".endsWith(str) : 해당 문자열이 전달한 문자열로 끝나는지 확인
		String url = "https://www.naver.com";
		
		System.out.println(url.startsWith("https://")
				|| url.startsWith("http://"));
		String fileName = "lion.jpg";
		
		System.out.println(fileName.endsWith(".jpg")
				|| fileName.endsWith(".gif")
				|| fileName.endsWith(".jpeg"));
		// "".replace(old, new) : 문자열 내에서 해당 문자열을 교체한다
		String schoolName = "구지초등학교";
		String email = "jungjun789@naver.com";
		result = schoolName.replace("초등", "고등");
		System.out.println(result);
		
		result = email.replace("@naver.com", "@hanmail.com");
		System.out.println(result);
		
		// "".substring(index) : 문자열을 해당 위치부터 마지막까지 자른 인스턴스를 반환
		String city = "Amsterdam";
		System.out.println(city.substring(1));
		System.out.println(city.substring(2));
		System.out.println(city.substring(3));
				
		// "",substring(start. end)
		// : 문자열을 start부터 end미만까지 잘라서 반환
		System.out.println(city.substring(2,4)); // 2 ~ 3
		System.out.println(city.substring(2,8)); // 2 ~ 7
				
		// "".trim() : 외곽의 공백을 제거한다 (내부의 공백은 제거하지 않는다)
		String text = "          I have a sandwich        ";
		System.out.println(text);
		System.out.println(text.trim());
				
		// "".toUpperCase() : 해당 문자열내의 영문자를 모두 대문자로 변환
		// "".toLowerCase() : 해당 문자열내의 영문자를 모두 소문자로 변환	
		System.out.println(text.trim().toUpperCase().substring(3,10));
		System.out.println(text.trim().toLowerCase());
				
		// "",indexOf(str) : 문자열에서 찾고자하는 문자열의 위치를 찾아 반환한다
		//                   문자열을 찾으면 해당 인덱스를 반환, 없으면 -1을 반환
		System.out.println(fruits.indexOf("pine"));
		System.out.println(fruits.indexOf("mango"));
		
		// "".indexOf(start, str)
		// : 문자열을 해당 인덱스부터 시작하여 찾을 수 있다
		System.out.println(fruits.indexOf("a" , 8));
		
		// 연습 : fruits의 모든 a의 위치를 콘솔에 출력하는 반복문을 만들어보세요
		System.out.println("------------------------------------------------------");
		for(int i = 0, cnt =0; i < fruits.length(); ++i) {
//			if(fruits.indexOf("a" , i) == fruits.indexOf("a" , i +1)) {
//			
//			}else {
//				System.out.println(fruits.indexOf("a" , i));
//			}
			i = fruits.indexOf("a",i);			
			if(i < 0) {
				break;
			}
			System.out.printf("%d번째 a의 위치: %d\n", cnt++, i);
		}
		int index = -1;
		while((index = fruits.indexOf("a", index +1)) != -1) {
			System.out.println("찾은 위치: " + index);
		}
		// String.format(format,args)
		// : 서식을 사용해 원하는 문자열을 만들어내는 메서드
		result = String.format("%-5s:%5d\n", "ABC", 123);
		System.out.println(result);
		
		// "".lastIndexOf : 원하는 문자열을 뒤에서부터 찾아준다
		System.out.println(fruits.lastIndexOf("apple"));
	}
}
