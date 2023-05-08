package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_FileEncryptionT {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		encrypt1(13);
		System.out.println("time1(byte): "
				+(System.currentTimeMillis() - start) + "ms");
		start = System.currentTimeMillis();
		encrypt2(13);
		System.out.println("time2(char): "
				+(System.currentTimeMillis() - start) + "ms");
		start = System.currentTimeMillis();
		encrypt3(13);
		System.out.println("time3(char[]): "
				+(System.currentTimeMillis() - start) + "ms");
	}
	
	public static void encrypt2(int key) {
		
		try (FileReader in = new FileReader(src);
				FileWriter out = new FileWriter(dst);
			){
				int ch;
				while ((ch = in.read()) != -1) {
					
					ch = D09_CaesarCipherT.encryption((char)ch, key);
					out.write(ch);
					
				}
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
	}
	
	public static void encrypt3(int key) {
		try (FileReader in = new FileReader(src);
				FileWriter out = new FileWriter(dst);
			){
				char[] buff = new char[1024];
				int len;
				while ((len = in.read(buff)) != -1) {
					for(int i = 0; i < len; ++i) {
						out.write(encryption(buff[i],13));
					}
						
				}
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
	}
	
	
	public static void encrypt1(int key) {
		try (FileInputStream in = new FileInputStream(src);
			FileOutputStream out = new FileOutputStream(dst);
		){
			int b;
			while ((b = in.read()) != -1) {
				
					char ch = (char)b;	
					encryption(ch, key);
				
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public static void encrypt4(int key) {
//		try(FileReader fin = new FileReader(src);
//			BufferedReader in = new BufferedReader(fin);
//			FileWriter fout = new FileWriter(dst);
//			BufferedWriter out = new BufferedWriter(fout);) {
//			
//			//buffered 한 글자씩
//			int ch;
//			while((ch = in.read()) != 1) {
//				fout.append(D09_CaesarCipherT.encryption((char)ch,10));
//			}
			
//			String line;
//			
//			while ((line = in.readLine()) != null) {
//				out.append(
//						);
//			}
		}	
	
	
		
	public static char encryption(char ch, int key) {
		int index = charset.indexOf(ch);
		
		if(index == -1) {
			return ch;
		}
		
		return charset.charAt((index + key) % charset.length());
	}
	public static File src = new File("Files/frankenstein.txt");
	public static File dst = new File("Files/frankenstein_encrypted.enc");
	
	static String charset = "ABCDEFGHIJKLNMOPQRSTUVWXYZ!@#$%^&*01012346789"
			+ "abcdefghijklnmopqrstuvwxyz[]/?;'\"" + " ";
	
}