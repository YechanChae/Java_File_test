package test_File1;

import java.io.IOException;
import java.io.RandomAccessFile;

public class test3 {

	public static void main(String[] args) {
		
		try {
			long beforesize=0;
			
			RandomAccessFile file = new RandomAccessFile( "C:\\Temps\\test1\\test123.txt", "r" );
			
			beforesize = file.length();
			
			while (true) {					
				long currentsize = file.length();
				long dif = currentsize - beforesize; 
				
				if(dif >0) {
						
					file.seek(beforesize);
					
					byte[] data = new byte[(int)dif]; //중요!!
					file.read(data);
					String newdata = new String(data); // 중요!!
					System.out.println(newdata);
					
				} 
				Thread.sleep(1000);
				beforesize=currentsize;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

