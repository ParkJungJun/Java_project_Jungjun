package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_FileEncryption {
	/*
	 *  frankenstein.txt를 시저 암호방식으로 암호화 한 파일
	 *  frankenstein_encrypted.enc를 생성해보세요
	 *  
	 *  (1) byte 방식으로 한 글자씩 암호화하는 속도를 측정해보기
	 *  
	 *  (2) char 방식으로 한 글자씩 암호화하는 속도를 측정해보기
	 *  
	 *  (3) char[] 방식으로 암호화하는 속도를 측정해보기
	 *  
	 *  (4) 버퍼 방식을 사용해 암호화하는 속도를 측정해보기
	 *  
	 *  공백도 암호화하기
	 */
	public static void main(String[] args) {
		File f1 = new File("Files/frankenstein.txt");
		File f2 = new File("Files/frankenstein_encrypted.enc");
		//String result = encryption(s1,13);
		try (FileInputStream in = new FileInputStream(f1);
			FileOutputStream out = new FileOutputStream(f2);
		){
			long start = System.currentTimeMillis();
			String enstr;
			byte[] buff = new byte[1024];
			int len;
			while((len = in.read(buff)) != -1) {
				enstr = encryption(new String(buff, 0,len), 8);
				out.write(enstr.getBytes());
			}
			System.out.println(System.currentTimeMillis() - start + "ms");
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileReader in2 = null;
		try {
			in2 = new FileReader(f1);
			
			char[] buff = new char[1024];
			int len = in2.read(buff);
			System.out.println(new String(buff,0,len));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in2 != null) {
					in2.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
				}
		}
	}
	
	static String charset = "ABCDEFGHIJKLNMOPQRSTUVWXYZ!@#$%^&*01012346789"
			+ "abcdefghijklnmopqrstuvwxyz[]/?;'\"" + " ";
	
	public static String encryption(String message, int key) {
		
		StringBuilder sb = new StringBuilder(message);
		
		int len = sb.length();
		
		for(int i = 0; i < len; ++i) {
			char ch = sb.charAt(i);
			
			int index = charset.indexOf(ch);
			
			if(index != -1) {
				sb.setCharAt(i,
						charset.charAt((index + key) % charset.length()));
			}
		}
		
		return sb.toString();
	}
	
	public static String decryption(String message, int key) {
		StringBuilder sb = new StringBuilder(message);
		int len = sb.length();
		int len2 = charset.length();
		key = key % len2;
		
		for (int i = 0; i <len; ++i) {
			int index = charset.indexOf(sb.charAt(i));
			
			if(index != -1) {
				sb.setCharAt(i,
						charset.charAt((
								index - key + len2) % len2));
			}
		}
		return sb.toString();
	}	
}
