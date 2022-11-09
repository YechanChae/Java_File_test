package prac_textWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class prac_BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//1. ���� ��ü ����
			File file = new File("C://Temps//writerFile.txt");
			
			//2. ���� ���翩�� üũ �� ����
			if(!file.exists()) {
				file.createNewFile();
			}
			
			//3. Buffer�� ����Ͽ� File�� Write�� �� �ִ� BufferedWriter ����
			//4. FileWriter fw = new FileWriter(file, true�� �ϸ� �������Ͽ��� �߰��� �����ϴ�. );
			FileWriter fw = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fw);
			
			//4. ���Ͽ� ����
			writer.write("�ȳ��ϼ���.");
			
			//5. BufferedWriter close .. ���� ���� ���̰� �ִٸ� writer.flush()�� �Ƚᵵ �ȴ�. 
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("������ ����Ϸ�!!");
	}

}
