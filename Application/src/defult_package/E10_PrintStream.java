package defult_package;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class E10_PrintStream {
	/*
	 * # PrintStream
	 * 
	 * - 문자를 훨씬 편리하게 출력할 수 있는 기능을 추가한 클래스
	 * - println(), printf(), print() 등을 사용할 수 있다
	 * - bufferedStream, BufferedWriter -> 성능증가
	 * - PrintStream, PrintWriter -> 개발자의 편리함 증가
	 */
	public static void main(String[] args) {
		try (FileWriter fout = new FileWriter("Files/print.txt",
					Charset.forName("UTF-8"));
			BufferedWriter bout = new BufferedWriter(fout);
			PrintWriter out = new PrintWriter(bout);){
			out.printf("%s는 %d원입니다.\n", "리치치즈스파케티",8000);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
