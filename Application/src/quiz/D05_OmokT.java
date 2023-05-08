package quiz;

public class D05_OmokT {
	final private static char[] icons =
		{'┌','┬','┐','├','┼','┤','└','┴','┘','○','●'};
	
	final public static int WHITE_STONE = 9;
	final public static int BLACK_STONE = 10;
	int[][] board = {
			{0,1,1,1,1,1,1,1,1,1,1,1,1,1,2},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{6,7,7,7,7,7,7,7,7,7,7,7,7,7,8}
	};
	public boolean put(String location, int color) {
		if(color != WHITE_STONE && color != BLACK_STONE) {
			System.out.println("[ERROR]"
					+ "3번째 파라미터에는 D05_OmokT.WHITE_STONE 또는"
					+ "D05_OmokT.BLACK_STONE을 사용해주세요");
			return false;
		}
		// "".substring(index) : 해당 위치부터 마지막 까지 문자열을 자른다
		
		int col =Integer.parseInt(location.substring(1)) -1;
		int row =location.charAt(0) - 'A';
		
		if(row < 0 || row > 14 || col < 0 || col > 14) {
			System.out.println("잘못된 위치를 입력하셨습니다");
			return false;
		}
		board[row][col] =color;
		
		return false;
	}
	
	public void print() {
		System.out.println(" 1  2  3  4  5  6  7  8  9  10 11 12 13 14 15");
		for(int i = 0; i <board.length; ++i) {
			System.out.print((char)('A'+i));
			for(int j = 0; j <board[i].length; ++j) {
				if(j == 14) {
					System.out.print(icons[board[i][j]] + "\n");
				}else {
					System.out.print(icons[board[i][j]] + "──");
				}
			}
			//System.out.println();
		}
	}
	
	public boolean checkWin(String location, int color) {
		
		int[] rowcol = getIndexes(location);
		
		int row = rowcol[0];
		int col = rowcol[1];
		// 현재 돌의 위치로부터 가로로 오목 검사
		
		int count = 1;
		// 현재 돌의 위치로부터 가로 오른쪽 체크
		for(int i = col +1; i < board[0].length; ++i) {
			if(board[row][i] == color) {
				++count;
			}else {
				break;
			}
		}
		if(count == 5) {
			return true;
		}
		count = 1;
		// 현재 돌의 위치로부터 가로 왼쪽 체크
		for(int i = col -1; i >= 0; --i) {
			if(board[row][i] == color) {
				++count;
			}else {
				break;
			}
		}
		
		if(count == 5) {
			return true;
		}
		
		count = 1;
		// 현재 돌의 위치로부터 세로로 오목 검사
		// 현재 돌의 위치로부터 세로로 위쪽 검사
		for(int i = row -1; i >= 0; --i) {
			if(board[i][col] == color) {
				++count;
			}else {
				break;
			}
		}
		if(count == 5) {
			return true;
		}
		count = 1;
		// 현재 돌의 위치로부터 세로로 아래쪽 검사
		for(int i = row +1; i < board.length; ++i) {
			if(board[i][col] == color) {
				++count;
			}else {
				break;
			}
		}
		
		if(count == 5) {
			return true;
		}
		count = 1;
		// 현재 돌의 위치로부터 대각선으로 오목 검사
		// 오른쪽 위 (-,+)
		for(int i = row -1, j = col +1; 
				i >= 0 && j < board[0].length; --i, ++j) {
			if(board[i][j] == color) {
				++count;
			}else {
				break;
			}
		}
		if(count == 5){
			return true;
		}
		count = 1;
		// 왼쪽 아래 (+,-)
		for(int i = row +1, j = col -1; 
				j >= 0 && i < board.length; ++i, --j) {
			if(board[i][j] == color) {
				++count;
			}else {
				break;
			}
		}	
		if(count == 5){
			return true;
		}
		count = 1;
		// 오른쪽 아래 (+,+)
		for(int i = row +1, j = col +1; 
				j < board.length && i < board[0].length; ++i, ++j) {
			if(board[i][j] == color) {
				++count;
			}else {
				break;
			}
		}	
		if(count == 5){
			return true;
		}
		count = 1;
		// 왼쪽 위 (-,-)
		for(int i = row -1, j = col -1; 
				j >= 0 && i >= 0; --i, --j) {
			if(board[i][j] == color) {
				++count;
			}else {
				break;
			}
		}	
		if(count == 5){
			return true;
		}
		return false;
	}
	
	private int[] getIndexes(String location) {
		return new int[] {
				location.charAt(0) - 'A',
				Integer.parseInt(location.substring(1)) -1
		};
	}
	
	public static void main(String[] args) {
		D05_OmokT game = new D05_OmokT();
		
//		game.put("A1", BLACK_STONE);
//		game.put("B2", BLACK_STONE);
//		game.put("C3", BLACK_STONE);
//		game.put("D4", BLACK_STONE);
//		game.put("E5", BLACK_STONE);
		
		game.put("A11", WHITE_STONE);
		game.put("B12", WHITE_STONE);
		game.put("C13", WHITE_STONE);
		game.put("D14", WHITE_STONE);
		game.put("E15", WHITE_STONE);
		game.print();
		
//		System.out.println("검은 돌이 이겼는가? " 
//				 + game.checkWin("A1", BLACK_STONE));
		System.out.println("흰 돌이 이겼는가? " 
				 + game.checkWin("A11", WHITE_STONE));
	}

}
