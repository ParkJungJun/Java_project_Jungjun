package quiz;
import myobj2.AbstractAnswer;
import myobj2.AbstractQuiz;

public class C16_AbstractQuiz {
	public static void test(AbstractQuiz quiz) {
		// 어떤 정수 타입 배열을 넣으면 내림차순으로 정렬된 결과를 리턴해주세요
		int[] result = quiz.answer1(new int[] {3,5,1,9});
		
		if(result[0] == 9 && result[1] == 5
				&& result[2] == 3 && result[3] == 1) {
			System.out.println("정답입니다!");
		}else {
			System.out.println("정답이 아닙니다 ㅠㅠ");
		}
	}
	
	public static void main(String[] args) {
		// 위의 코드를 수정하지 말고 정답입니다!가 콘솔에 출력되게 만들어보세요
		
		AbstractQuiz quiz = new AbstractQuiz() {
			int temp = 0;
		@Override
			public int[] answer1(int[] data) {
				for(int i = 0; i < data.length; ++i) {
					for(int j = 0; j < i; ++j) {
						if(data[j] <= data[i]) {
							temp = data[j];
							data[j] = data[i];
							data[i] = temp;
						}	
					}
				}
				return data;
			}
		};
		test(quiz);
		test(new AbstractAnswer());
	}

}
