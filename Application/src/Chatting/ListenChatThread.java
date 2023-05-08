package Chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.time.LocalTime;
import java.util.List;

public class ListenChatThread extends Thread{
	List<Socket> users;
	Socket me;
	public ListenChatThread(List<Socket> users, Socket s) {
		me = s;
		this.users = users;
	}
	
	private void sendAll(String message) {
		for(Socket user : users) {
			try {
				OutputStream out = user.getOutputStream();
				message = "nick : " + message + "\t" +LocalTime.now() + "\n";
				out.write(
						String.format("nick: %s\t%s \n", message, LocalTime.now())
						.getBytes());
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// run이 끝나면 해당 쓰레드도 종료된다
	@Override
	public void run() {
		try (InputStreamReader isr = new InputStreamReader(me.getInputStream());
			 BufferedReader in = new BufferedReader(isr);
		){
			while(true) {
				String message = in.readLine();
				
				if(message == null) {
					users.remove(me); // 유저 리스트에서 제거하기
					me.close(); // 소켓 닫기
					break; //스레드 종료
				}
				
				sendAll(message);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
