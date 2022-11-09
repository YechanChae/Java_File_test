package sec04.exam04_filereader;

import java.io.File;
import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\user\\eclipse-workspace\\prac1\\src\\sec04\\exam04_filereader\\FileReaderExample.java");
		File file = new File("C:\\\\Users\\\\user\\\\eclipse-workspace\\\\prac1\\\\src\\\\sec04\\\\exam04_filereader\\\\FileReaderExample.java");
		System.out.println(file.length());
		int readCharNo;
		char[] cbuf = new char[100];
		while( (readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
//			System.out.println(data.length());
		}
		System.out.println(file.length());

		fr.close();
	}

}
