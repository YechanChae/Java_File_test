package prac_textWriter;

import java.io.File;
import java.io.FileOutputStream;

public class prac_FileOutputStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:\\Temps\\writeFile2.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		// FileOutputStream의 write() 메소드는 파라미터로 byte를 받습니다.
		
		FileOutputStream fos = new FileOutputStream(file);
		
		fos.write("안녕하세요".getBytes());
		
		fos.close();
		
		System.out.println("FileOutputStream 완료!!");
	}

}
