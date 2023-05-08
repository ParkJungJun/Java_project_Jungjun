package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E05_Save {
	/*
	 * 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후
	 * 프로그램 종료시 전적을 파일에 저장하고
	 * 프로그램 실행 시에는 파일에 저장된 전적 데이터를 읽어 예전 전적이
	 * 그대로 이어지도록 만들어보세요
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int player = 0;
		int com;
		int countWin = 0;
		int countDraw = 0;
		int countLose = 0;
		
		try {
			FileInputStream record = new FileInputStream("Files/record");
			byte[] all = record.readAllBytes();
			String score = new String(all);
			System.out.println(score);
			
			record.read();
			
			record.close();
		} catch (FileNotFoundException e) {
			 System.out.println("경로 오류");
	         e.printStackTrace();
	         
	    } catch (IOException e) {
	         e.printStackTrace();
	    }
		System.out.println("1. 가위 2. 바위 3. 보 4. 종료");
		while(player != 4) {
			
			player = sc.nextInt();
			com = (int)(Math.random() * 3 + 1);
			System.out.println(com);
			if(player == 1) {
				System.out.println("플레이어는 가위를 냈습니다");
				if(com == 1) {
					System.out.println("컴퓨터는 가위를 냈습니다");
					System.out.println("무승부입니다");
					++countDraw;
				}else if(com == 2) {
					System.out.println("컴퓨터는 바위를 냈습니다");
					System.out.println("플레이어의 패배입니다");
					++countLose;
				}else if(com == 3) {
					System.out.println("컴퓨터는 보를 냈습니다");
					System.out.println("플레이어의 승리입니다");
					++countWin;
				}
			}else if(player == 2) {
				System.out.println("플레이어는 바위를 냈습니다");
				if(com == 1) {
					System.out.println("컴퓨터는 가위를 냈습니다");
					System.out.println("플레이어의 승리입니다");
					++countWin;
				}else if(com == 2) {
					System.out.println("컴퓨터는 바위를 냈습니다");
					System.out.println("무승부입니다");
					++countDraw;
				}else if(com == 3) {
					System.out.println("컴퓨터는 보를 냈습니다");
					System.out.println("플레이어의 패배입니다");
					++countLose;
				}
			}else if(player == 3) {
				System.out.println("플레이어는 보를 냈습니다");
				if(com == 1) {
					System.out.println("컴퓨터는 가위를 냈습니다");
					System.out.println("플레이어의 패배입니다");
					++countLose;
				}else if(com == 2) {
					System.out.println("컴퓨터는 바위를 냈습니다");
					System.out.println("플레이어의 승리입니다");
					++countWin;
				}else if(com == 3) {
					System.out.println("컴퓨터는 보를 냈습니다");
					System.out.println("무승부입니다");
					++countDraw;
				}
			}else if(player > 4) {
				System.out.println("1부터 3사이의 값을 입력하세요");
			}
		}
		
		try {
			FileOutputStream record = new FileOutputStream("Files/record");
			
			record.write((countWin + " 만큼 이겼습니다").getBytes());
			record.write('\n');
			record.write((countDraw + " 만큼 비겼습니다").getBytes());
			record.write('\n');
			record.write((countLose + " 만큼 졌습니다").getBytes());
			record.write(countWin);
			record.write(countDraw);
			record.write(countLose);
			
			record.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
