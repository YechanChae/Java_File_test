
// 파일변경 abcdef12345 --> abceAAAAA45로 변경완료
package test_File1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test1 {

	public static void main(String[] args) {
		
		String newAL = "AAAAA";
		byte[] r = newAL.getBytes();
		System.out.println(r);
		try {
			
			RandomAccessFile file = new RandomAccessFile( "C:\\Temps\\test1\\test12.txt", "rw" );
			
			long a = file.getFilePointer();
			System.out.println(a);
			
			int first = 4;
			file.seek(first);
			
			file.write(r);
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
}

//byte[] data = new byte[(int)dif]; //중요!!
//file.read(data);
//String newdata = new String(data); // 중요!!



//for(int i = 5; i <= last; i++) {
//	file.write(r);
//}

//file.write(newAL.getBytes(), first, last);
//file.read(data);
//String newdata = new String(data); // 중요!!
//System.out.println(newdata);
//newdata = newAL;
//file.write(data);
//newdata = newdata.replace(newdata, newAL);
//System.out.println(newdata);
//
//writeToPosition 









