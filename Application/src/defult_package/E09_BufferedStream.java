package defult_package;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class E09_BufferedStream {
	/*
	 *  # Buffered
	 *  
	 *  - 데이터를 하나씩 전송하는 것이 아니라 모아서 한번에 전송하는 것 (ex: 인터넷 동영상)
	 *  - BufferedReader/Writer : 버퍼를 사용하면서 char단위로 읽고 쓰는 클래스
	 *  - BufferedInput/OutputStream : 버퍼 + byte단위
	 *  - 버퍼기능을 알아서 적용해주는 스트림 클래스들은 Buffered라는 이름이 붙는다
	 */
	public static void main(String[] args) {
		File f = new File("Files/test.txt");
		
		// Buffered InputStream/OutputStream 사용해보기
		//FileInputStream fin = new FileInputStream(f)
//		BufferedInputStream in = new BufferedInputStream(System.in)
		// 우리가 알고있는 InputStream - FileInputStream, System in
		try (
				FileInputStream fin = new FileInputStream(f);
			BufferedInputStream in = new BufferedInputStream(fin);)
		{
			//System.out.println("입력: ");
			System.out.println(
					Arrays.toString(in.readAllBytes()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File f2 = new File("Files/test2.txt");
		
		try (FileOutputStream fout =  new FileOutputStream(f2,true);
			BufferedOutputStream out = new BufferedOutputStream(fout)
		){
			long start = System.currentTimeMillis();
			out.write(quiz.D10_ReporterList.data.getBytes());
				
			System.out.println(System.currentTimeMillis() - start + "ms");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Buffered Writer/Reader 사용해보기
		
		// 알고있는 Writer - FileWriter, System.in은 어떻게 넣어야 할까?
		
		// InputStreamReader : byte단위를 스트림을 char단위로 업그레이드 해준다
		
		// BuferedReader는 Reader만 넣을 수 있기 때문에
		// System.in으로부터 문자 단위로 입력받기 위해서는
		// InputStreamReader로 업그레이드가 필요하다
		
		try(InputStreamReader cin = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(cin);
		){
			//BufferedReader에는 readLine이 있다 (더 읽을게 없으면 null 리턴)
			String line;
			int row = 0;
			while((line = in.readLine()) != null) {
				System.out.println(row++ + ": " + line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
