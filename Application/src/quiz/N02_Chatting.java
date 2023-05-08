package quiz;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class N02_Chatting {
	/*
	 * 간단한 채팅 프로그램을 만들어 보세요
	 * 
	 * # 서버
	 * 
	 * 1. 최대 3명까지 접속이 가능하다
	 * 
	 * 2. 클라이언트가 메세지를 보내면 다른 클라이언트들에게 해당 메세지를 전달해줘야 한다
	 * 
	 * 3.  메세지는 닉네임 > 메세지 내용 - 보낸 시간 형식이여야 한다
	 * 
	 * # 클라이언트
	 * 
	 * 1. 서버에 접속하고 메세지를 보낼 수 있다
	 * 2. 클라이언트는 프로그램 시작시 닉네임을 설정할 수 있다
	 * 3. 서버에 접속한 다른 사람들과 채팅을 할 수 있다
	 * 4. 내가 메세지를 보낼 때 그 동안 다른 사람들이 보낸 메세지를 확인할 수 있다
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b1 = false;
		Socket ss3 = null;
		try {
			ServerSocket s1 = new ServerSocket(1020);
			ServerSocket s2 = new ServerSocket(3040);
			ServerSocket s3 = new ServerSocket(5060);
//			System.out.println("Server IP: " + s1.getLocalSocketAddress());
//			System.out.println("Server Port " + s1.getLocalPort());
			
			
			// accept() :다른 소켓의 연결을 기다린다. 여기서 프로그램이 멈춘다.
			System.out.println("유저 1의 연결을 기다리는 중입니다...");
			
			// 다른 클라이언스 소켓과의 연결이 수립된다
			Socket ss1 = s1.accept();
			System.out.println("유저 2의 연결을 기다리는 중입니다...");
			Socket ss2 = s2.accept();
			System.out.println("유저 3과 연결하시겠습니까? Y(1)/N(2) : ");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("유저 3의 연결을 기다리는 중입니다...");
				ss3 = s3.accept();
				b1 = true;
			}else {
				
			}
			
			System.out.println("연결이 수립되었습니다. 이제부터 메세지를 기다립니다...");
			
			DataOutputStream out1 = new DataOutputStream(ss1.getOutputStream());
			DataOutputStream out2 = new DataOutputStream(ss2.getOutputStream());
			if(b1) {
				DataOutputStream out3 = new DataOutputStream(ss3.getOutputStream());
			}
			
			DataInputStream in1 = new DataInputStream(ss1.getInputStream());
			
			String message1 = in1.readUTF();
			System.out.println("message from client " + message1);
			
			
			
//			String message1 = in1.readUTF();
//			String message2 = in2.readUTF();
//			String message3 = in3.readUTF();
			
//			DataOutputStream out1 = new DataOutputStream(ss1.getOutputStream());
//			DataOutputStream out2 = new DataOutputStream(ss2.getOutputStream());
//			DataOutputStream out3 = new DataOutputStream(ss3.getOutputStream());
			
			
				
			
			
			
			//System.out.println(s.getInetAddress() + " 누군가 연결했습니다!");
			
			s1.close();
			s2.close();
			s3.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("서버가 종료되었습니다");
	}

}
