package sec04.exam05_writer;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("C:/Temps/file.txt");
		FileWriter fw = new FileWriter(file);
	
		fw.write("FileWriter�� �ѱ۷ε�"+ "\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�."+"\r\n");
		fw.flush();
		fw.close();
	
	
	System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}

}
