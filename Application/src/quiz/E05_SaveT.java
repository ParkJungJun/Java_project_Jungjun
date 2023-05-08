package quiz;

import myobj2.RpsGame;

public class E05_SaveT {
	/*
	 * 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후
	 * 프로그램 종료시 전적을 파일에 저장하고
	 * 프로그램 실행 시에는 파일에 저장된 전적 데이터를 읽어 예전 전적이
	 * 그대로 이어지도록 만들어보세요
	 */
	public static void main(String[] args) {
		RpsGame game = new RpsGame();
		
		for(int i = 0; i < 10; ++i) {
			game.play(RpsGame.SCISSORS);
		}
		
		game.close();
	}

}
