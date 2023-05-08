package quiz;

public class B10_sosu {
	// while문만 사용해서 1000 미만의 소수 문제를 풀어보세요
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 2;
		while (target < 1000) {
			
			boolean sosu = true;			
			double targetRoot =Math.sqrt(target);
			int divider = 2;
			while (sosu && divider <= targetRoot) {
				sosu &= target % divider != 0;
				++divider;
				
			}
			if(sosu) {
				System.out.printf("%-3d ", target);
			}else {
				//System.out.printf("%d(not sosu)\n", target);
			}
			if (target % 100 == 0) {
				System.out.println();
			}
			++target;
		}
	}

}
