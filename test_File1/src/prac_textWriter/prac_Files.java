package prac_textWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class prac_Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		Path path = Paths.get("C:\\Temps\\writerFile3.txt");
		
		Files.write(path, "æ»≥Á«œººø‰", getBytes());
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
