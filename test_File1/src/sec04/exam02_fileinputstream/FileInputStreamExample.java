package sec04.exam02_fileinputstream;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\prac1\\src\\sec04\\exam02_fileinputstream\\FileInputStreamExample.java");
		int data;
		while((data = fis.read()) != -1){ //1bite�� �д� read method�� ����غ��Ҵ�
			System.out.write(data);
		}
		System.out.flush();
		fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
 