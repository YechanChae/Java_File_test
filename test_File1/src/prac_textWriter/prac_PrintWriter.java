package prac_textWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class prac_PrintWriter {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Temps\\writeFile1.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file);
		PrintWriter writer = new PrintWriter(fw);
		
		writer.write("�ȳ��ϼ���\n");
		writer.println("Nice to meet you");
		writer.print("!!");
		
		writer.close();
		
		System.out.println("PrintWriter �Ϸ�!!");
	}

}

//writer.write();
//writer.println();
//writer.print();
//PrintWriter Ŭ������ ����ϸ�,
//write() �޼ҵ� �Ӹ� �ƴ϶�, println(), print() �޼ҵ带 ����� �� �ֽ��ϴ�.
//println() �޼ҵ带 ����ϸ� �ڵ����� �� �ٲ��� �˴ϴ�.

