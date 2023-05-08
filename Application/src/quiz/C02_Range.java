package quiz;
import java.util.Arrays;
public class C02_Range {
	/*
	 * 1. 최대값을 인자로 전달하면
	 * 0부터 최대값 미만의 int[]을 생성하며 반환하는
	 * range 함수를 만들어 보세요
	 * 
	 * ex> range (8)의 결과 -> [0,1,2,3,4,5,6,7]
	 * 
	 * 2. 최소값과 최대값을 인자로 전달하면
	 * 	  최소값부터 최대값 미만의 int[]을 생성하여 반환하는
	 *    range 함수를 만들어 보세요
	 *    
	 *    ex> range(10,15)의 결과 -> [10,11,12,13,14]
	 *        range(15,10)의 결과 -> [15,14,13,12,11]
	 *        
	 * 3. 최소값 최대값 증가값을 인자로 전달하면
	 * 	  최소값부터 최대값 미만까지 증가값만큼 증가하는 int[]을 반환하는
	 *    range 매서드를 만들어 보세요
	 *    
	 *    ex> range(30,40,2) -> [30,32,34,36,38]
	 *        range(50,40,-3) -> [50,47,44,41]
	 *        range(50,40,5) -> []
	 */
	public static int[] range(int num) {
		int[] a = new int[num];
		for(int i = 0; i <num; ++i) {
			a[i] = i;
		}
		return a;
	}
	
	public static int[] range(int num1, int num2) {
		int[] a = new int[Math.abs(num1 - num2)];
		for(int i =0; i < Math.abs(num1 - num2); ++i) {
			a[0] = num1;
			if(num1 < num2) {
				a[i] = num1 +i;
			}else if(num2 < num1) {
				a[i] = num1 -i;
			}	
		}
		return a;
	}
	public static int[] range(int num1, int num2, int num3) {
		int size = (int)Math.ceil(Math.abs(num1 - num2)/(double)Math.abs(num3));
		int [] a = new int[size];
		a[0] = num1;
		for(int i = 0; i < size; ++i) {			
			if(num1 < num2 && num3 > 0) {		
				a[i] = num1 + (i * num3);
			}else if(num1 > num2 && num3 > 0) {
				a = new int[0];
			}else if(num1 > num2 && num3 <0) {
				a[i] = num1 - (i * Math.abs(num3));
			}else if(num1 < num2 && num3 < 0) {
				a = new int[0];
			}else {
				a = new int[0];
			}			
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(range(8)));
		System.out.println(Arrays.toString(range(10,15)));
		System.out.println(Arrays.toString(range(15,10)));
		System.out.println(Arrays.toString(range(30,40,2)));
		System.out.println(Arrays.toString(range(50,40,-3)));
		System.out.println(Arrays.toString(range(50,40,5)));
	}
}
