package test_File1;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test {

	public static void main(String[] args) {
		
		try {
			long beforesize=0;
//			
//			if(true) {
//				RandomAccessFile file = new RandomAccessFile( "C:\\Temps\\test1\\test.txt", "r" );
//				
//				long filePointer = file.length();
//				char ReadData = (char)file.read();
//			} else {
				
				
				RandomAccessFile file = new RandomAccessFile( "C:\\Temps\\test1\\test.txt", "r" );
				
				long currentsize = file.length(); //  current 파일길이
				
				while (true) {
					
					if(beforesize < currentsize) {
						
						for(long pointer = beforesize -1; pointer <= currentsize-1; pointer++) {
							
							file.seek(pointer);;
						
							char ReadData = (char)file.read();
							System.out.println(ReadData);
							
							beforesize = currentsize;
						}
					}
				
				Thread.sleep(1000);
				}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

