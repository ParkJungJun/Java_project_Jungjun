package myobj2;

public class AbstractAnswer extends AbstractQuiz{
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
		};
		
}

