package quiz;
public class B14_Arrary2Quiz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myArr = {
				{1,1,1,1,1,1,1},
				{1,1,1},
				{1,1,1,1,1},
				{1,1},
				{1,1,1,1}
		};
		
		// 1. myArr의 모든 값을 100 ~ 200 사이의 랜덤 정수로 바꾸기
		
		// 2. 랜덤으로 바뀐 모든 값의 총합과 평균 구하기
		
		// 3. myArr의 각 행(row)의 합을 구해서 출력하기
		
		// 4. myArr의 각 열(column)의 합을 구해서 출력하기
		int count = 0;
		double count2 = 0;
		int rowindex = 0;
		int rowcount[] = new int[5];
		int columnindex = 0;
		int columncount[] = new int[7];
		for(int i= 0; i < myArr.length; ++i) {
			for(int j = 0; j < myArr[i].length; ++j) {
				myArr[i][j]=(int)(Math.random() * 101 + 100);
				System.out.printf("myArr[%d][%d] : %d\n",
						i ,j ,myArr[i][j]);
				count += myArr[i][j];
				++count2;
				rowindex = i;
				columnindex =j;
				if(rowindex == i) {
					rowcount[i] += myArr[rowindex][j];
				}
				if(columnindex == j ) {
					columncount[j] += myArr[i][columnindex];
				}
			}
		}
		System.out.printf("총합 : %d\n",count);
		System.out.printf("평균 : %f\n",count/count2);
		for(int i = 0; i < rowcount.length; ++i) {
			System.out.printf("rowcount[%d]의 총합 : %d\n",i,rowcount[i]);
		}
		for(int i = 0; i < columncount.length; ++i) {
			System.out.printf("columncount[%d]의 총합 : %d\n",i,columncount[i]);
		}
	}
}
