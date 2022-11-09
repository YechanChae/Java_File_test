package test_File1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test4 {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Temps\\test1\\test1010.txt");
			FileWriter fw = new FileWriter(file);
			FileReader fr = new FileReader("C:\\Temps\\test1\\test1010.txt");
			
			String AL = null;
			int num = 0;
			char[] alphabets = new char[26];
			char ch = 'A';
			
			for(int i=0; i< alphabets.length; i++) {
				alphabets[i] = ch++;
			}
			long filesize = file.length();
	
//			byte[] i1 = new byte[1024];
//			for (int i = 0; i <= 10; i++) {
//			}
			char[] cbuf = new char[100];
			
			for( int count=1; count<= 100; count++) {
				 if(filesize < 1024) {
					if(count%2 != 0) {
						fw.write("a");
						fw.flush();
						
						Thread.sleep(1000);
						
					} else {
						fw.write("1");
						fw.flush();
						
					    Thread.sleep(1000);
						
					}
					fr.read(cbuf); 
					String data = new String(cbuf);
					System.out.println(data);

				} else {
					System.out.println("파일용량을 초과하였습니다.");
				}
			}
			
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}


