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
		
		// FileOutputStream�� write() �޼ҵ�� �Ķ���ͷ� byte�� �޽��ϴ�.
		
		FileOutputStream fos = new FileOutputStream(file);
		
		fos.write("�ȳ��ϼ���".getBytes());
		
		fos.close();
		
		System.out.println("FileOutputStream �Ϸ�!!");
	}

}
