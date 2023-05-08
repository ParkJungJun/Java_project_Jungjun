package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class N02_Chatting4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (Socket s3 = new Socket("127.0.0.1", 5060);){
			
			DataOutputStream out = new DataOutputStream(s3.getOutputStream());
			
			while(true) {
				out.writeUTF(sc.nextLine());
				out.flush(); // flush : 보내기
				DataInputStream in = new DataInputStream(s3.getInputStream());
				String message = in.readUTF();
				System.out.println(message);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
