package defult_package;
public class B08_BreakCountinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # break
		 * 
		 * - switch-case문 내에서 사용하면 해당 case를 탈출한다
		 * - 반복문 내부에서 사용하면 해당 반복문을 탈출한다
		 * 
		 * # continue
		 * 
		 * - 반복문 내부에서 continue를 만나면 다음 번 반복으로 넘어간다
		 */
		
		for(int i = 0; i < 10; ++i) {
			System.out.println(i);
			
			//i값이 5일때 break를 만나 반복문을 탈출한다
			if(i == 5) {
				break;
			}
		}
		System.out.println("------------------------");
		for (int i =0; i < 10; ++i) {
			//i값이 5일때 continue를 만나고 밑의 println()을 실행하지 않은 채로
			//다음 반복으로 넘어간다
			
//			if(i == 5) {
//				continue;
//			}
			if(i %2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
