package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class E08_Copy {
	/*
	 * 폴더 이름을 전달하면 폴더이름2에 모든 내용을 복사하는 메서드를 만들어보세요
	 */
	public static void main(String[] args) {
		File src = new File("Files/test.txt");
		File f1 = new File("Files");
		File parent = new File("Files2");
		File dst = new File("Files2/test.txt");
//		File src2 = new File("../ReportList2");
//		File dst2 = new File("Files2/ReportList2");
//		File src = null;
//		File dst = null;
//		String[] s = f1.list();
//		System.out.println(Arrays.toString(s));
//		for(int i = 0; i < s.length; ++i) {
//			src = new File("Files/s[i]");
//			dst = new File("Files2/s[i]");
//		}
		if(!parent.exists()) {
			parent.mkdir();
		}
		try (FileReader in = new FileReader(src);
			FileWriter out = new FileWriter(dst);){
			int ch;
			while((ch = in.read()) != -1) {
				out.write(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File srcDirectory = new File("Files");
		
		for(File f : srcDirectory.listFiles()) {
			System.out.printf("%s, %s\n", f,f.isDirectory());
		}
		search(srcDirectory);
		
	}
	
	// 재귀 (recursive)
	public static void search(File src) {
		for(File f : src.listFiles()) {
			if(f.isDirectory()) {
				System.out.println(f + "는 폴더이므로 리스트 봐야함");
				search(f);
			}else {
				System.out.println(f + "는 파일 복사");
			}
		}
	}
}
