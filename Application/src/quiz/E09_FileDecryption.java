package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_FileDecryption {
	/*
	 * 암호화 된 파일(.enc)의 맨 위부터 10줄(공백 줄 제외)을 모든 키값으로 복호화한 샘플을 보여준 후
	 * 사용자가 해당 키값을 선택하면 해당 키값으로 복호화한 파일을 생성하도록 만들어보세요
	 * (복호화한 파일의 확장자는 .dec이고 파일명 맨 뒤에 _decrypted를 추가할 것)
	 */
	public static void main(String[] args) {
		
		decryption(13);
//		FileReader in2 = null;
//		try {
//			in2 = new FileReader(dst);
//			
//			char[] buff = new char[1024];
//			//char[] buff2 = new char[1];
// 			
//				int len = in2.read(buff);
//				//int ten = in2.read(buff2);
//				//System.out.println(new String(buff,0,len));
			
			
			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(in2 != null) {
//					in2.close();
//				}
//			}catch(IOException e) {
//				e.printStackTrace();
//				}
//		}
	}
	
	public static char decryption(char ch, int key) {
		int index = charset.indexOf(ch);
		int len2 = charset.length();
		if(index == -1) {
			return ch;
		}
		
		return charset.charAt((index - key + len2) % charset.length());
	}
	
	public static void decryption(int key) {
		try (FileReader in = new FileReader(src);
				FileWriter out = new FileWriter(dst);
				BufferedReader fin = new BufferedReader(in);
				BufferedWriter fout = new BufferedWriter(out);
			){
//				char[] buff = new char[1024];
//				int len;
//				while ((len = in.read(buff)) != -1) {
//					for(int i = 0; i < len; ++i) {
//						out.write(decryption(buff[i],13));
//					}
//						
//				}
				String str;
				//fin.readLine();
				int count = 0;
				char ch;
				
				while((str = fin.readLine()) != null && count < 10) {
					System.out.println(str);
					++count;
				}
				
				
				fin.close();
				fout.close();
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
	}
	
//	public static void decryption2(int key) {
//		
//		for() {
//			try (FileReader in = new FileReader(src);
//				FileWriter out = new FileWriter("Files/frankenstein_decrypted2.dec");
//			){
//				char[] buff = new char[1024];
//				int len;
//				while ((len = in.read(buff)) != -1) {
//					for(int i = 0; i < len; ++i) {
//						out.write(decryption(buff[i],1));
//					}		
//				}
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} 
//		}
		
	//}
	
	public static File src = new File("Files/frankenstein_encrypted.enc");
	public static File dst = new File("Files/frankenstein_decrypted.dec");
	
	static String charset = "ABCDEFGHIJKLNMOPQRSTUVWXYZ!@#$%^&*01012346789"
			+ "abcdefghijklnmopqrstuvwxyz[]/?;'\"" + " ";
}
