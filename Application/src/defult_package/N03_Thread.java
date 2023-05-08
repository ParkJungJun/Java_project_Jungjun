package defult_package;

public class N03_Thread {
	/*
	 * # 쓰레드
	 * - 우리가 사용하던 것은 main 쓰레드였다
	 * - main 쓰레드말고도 여러 쓰레드를 추가해서
	 *   동시에 여러 작업을 진행하는 것이 가능하다
	 */
	public static void main(String[] args) {
		Wallet w = new Wallet();
		//스레드 하나 생성
		MyThread t1 = new MyThread(w);
		MyThread t2 = new MyThread(w);
		//메인과 따로 진행될 쓰레드 시작
		t1.start();
		t2.start();
		while(true) {
			Thread t3 = new Thread() {
				@Override
				public void run() {
					System.out.println("토끼");
				}
			};
			
			t3.run();
			System.out.println("main은 main대로 진행중입니다...");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class MyThread extends Thread{
	static int num;
	int threadNum;
	Integer money;
	
	Wallet wallet;
	// 또 하나의 main같은 것
	@Override
	public void run() {
		System.out.printf("Thread%d을 실행합니다...", threadNum = num++);
		int i = 0;
		while(true) {
			//++money;
			System.out.printf("Thread%d 작업중...(%d)\n",threadNum, i++);
			wallet.add();
			wallet.print();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public MyThread(Wallet w) {
		wallet = w;
	}
}

class Wallet{
	int money;
	
	public void add() {
		money += 10;
	}
	
	public void print() {
		System.out.println("current cash : " + money);
	}
}