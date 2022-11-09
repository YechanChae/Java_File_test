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
		
		writer.write("안녕하세요\n");
		writer.println("Nice to meet you");
		writer.print("!!");
		
		writer.close();
		
		System.out.println("PrintWriter 완료!!");
	}

}

//writer.write();
//writer.println();
//writer.print();
//PrintWriter 클래스를 사용하면,
//write() 메소드 뿐만 아니라, println(), print() 메소드를 사용할 수 있습니다.
//println() 메소드를 사용하면 자동으로 줄 바꿈이 됩니다.

