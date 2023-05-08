package quiz;

public class B11_Count369T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0 ~ 29990 + 10
		int ranNum = (int)(Math.random() * 29991) + 10;
		
		System.out.println("이번의 목표 숫자는" + ranNum + "입니다.");
		int count = 0;
		for(int num = 1; num <=ranNum; ++num) {
			System.out.print(num + ": ");
			
			String check ="" +num;
			
			for(int index = 0; index < check.length(); ++index) {
				char ch = check.charAt(index);
				
				if(ch == '3' || ch =='6' || ch =='9') {
					System.out.print("짝");
					++count;
				}
			}
			System.out.println();
//			// num은 박수를 몇 번 치는지 검사
//			int check = num;
//			
//			//1/ 2 / 3 / 4 / 5 / 6
//			
//			while (check > 0) {
//				int dight = check % 10;
//				
//				if(dight == 3 || dight == 6 || dight == 9) {
//					System.out.print("짝");
//					++count;
//				}
//				
//				check /= 10; // 10으로 나누면서 일의 자리 삭제
//			}
			System.out.println();
			
		}
		System.out.print(count);
	}

}
