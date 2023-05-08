package quiz;

import java.util.Calendar;

public class D12_EventDay {
	/*
	 * 실행하면 오늘로부터 앞으로 1년간의 이벤트 날짜를 모두 출력해주는 프로그램을 만들어보세요
	 * 
	 * 1+1 이벤트 날짜 : 매월 18일
	 * 20% 할인 이벤트 : 홀수 번째 금요일
	 * 
	 * ※ 이벤트 날짜가 겹치는 날에는 둘 모두 적용됨을 알려줘야 한다
	 */
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar day = Calendar.getInstance();
		//System.out.println(today.getTime());
		
//		while(event1.get(Calendar.DATE) != day.get(Calendar.DATE) ||
//				(day.get(Calendar.YEAR) != today.get(Calendar.YEAR +2)
//				&& day.get(Calendar.MONTH) != Calendar.APRIL)) {
//			day.set(Calendar.DATE, 18);
//			
//			if(day.get(Calendar.DATE) == 18) {
//				System.out.println("1+1이벤트 하는날~! " + day.getTime());
//			}
//			day.add(Calendar.MONTH,1);
//			
//		}

		for(int i = 0; i <365; ++i) {
			day.add(Calendar.DATE, 1);
			
			if(day.get(Calendar.DAY_OF_MONTH) == 18 
					&& day.get(Calendar.YEAR) <= today.get(Calendar.YEAR +1)) {
				System.out.println("1+1이벤트 하는날~! " + day.getTime());
			}
//			if(day.get(Calendar.DATE) == Calendar.MONDAY
//					&& day.get(Calendar.DAY_OF_WEEK) % 2 == 1
//					&& day.get(Calendar.YEAR) <= today.get(Calendar.YEAR +1)) {
//				System.out.println("20%할인 하는 날~! " + day.getTime());
//			}		
		}
//		for(int i = 0; i < 365; ++i) {
//			today.add(Calendar.DATE, 1);
//			System.out.println(today.getTime());
//		}
		
	}

}
