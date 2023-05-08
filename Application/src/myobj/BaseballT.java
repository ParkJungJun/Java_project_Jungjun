package myobj;

import java.util.Arrays;

public class BaseballT {
	int[] answer;
	boolean end = false;
	public int chance;
	public String result;
	public BaseballT() {
		answer = new int[4];
		
		genAnswer();
		
		System.out.println(Arrays.toString(answer));
	}
	
	// answer라는 인스턴스 변수가 필요한 기능이므로 인스턴스 메서드로 만들어야 한다
	public int[] check(String number) {
		int[] count = new int[2];
		char[] nums = number.toCharArray();
		
		for(int i= 0; i < nums.length; ++i) {
			for(int j = 0; j < answer.length; ++j) {
				// nums는 char answer는 int
				if(nums[i] == answer[j] + '0') {
					if(i == j) {
						count[0]++; // 스트라이크
					}else {
						count[1]++;// 볼
					}
				}
			}
		}
		
		--chance;
		if(count[0] ==4) {
			end = true;
			result = "승리";
		}else if(chance == 0) {
			end = true;
			result = "패배";
		}
		return count;
	}
	
	// 숫자 야구 게임과 관계는 있지만, 인스턴스 변수는 쓰지 않는 기능은 스태틱으로...
	public static boolean isBeseballGameString(String number) {
		// null이 아닐것
		if(number == null) {
			return false;
		}
		
		// 길이 4
		number.length();
		
		//모두 숫자로만 이루어져 있을 것
		char[] nums =number.toCharArray();
		
		for(int i = 0; i < nums.length; ++i) {
			char ch = nums[i];
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		
		// 중복되는 숫자가 없을 것
		for (int i = 0; i < nums.length; ++i) {
			for(int j = i +1; j < nums.length; ++j) {
				if(nums[i] == nums[j]) {
					return false;
				}
			}
		}
		
		
		
		return true;
	}
	
	public boolean isEnd() {
		return end;
	}
	/** 정답을 새로 만든다 (중복 없는 숫자 4자리)*/
	void genAnswer() {
		for(int i = 0; i < answer.length; ++i) {
			answer[i] = (int)(Math.random() * 10);
			
			for(int j = 0; j < i; ++j) {
				if(answer[i] == answer[j]) {
					--i;
				}	
			}
		}
		end = false;
		chance = 9;
	}
}
