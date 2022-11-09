package sec04.exam01_file;

import java.io.File;
import java.net.URI;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File dir = new File("C:/Temps/Dir");
		File file1 = new File("C:/Temps/file1.txt");
		File file2 = new File("C:/Temps/file2.txt");
		File file3 = new File(new URI("file:///C:/Temps/file3.txt"));
		
		if(dir.exists() == false) {dir.mkdirs();}
		if(file1.exists() == false) { file1.createNewFile();}
		if(file2.exists() == false) { file2.createNewFile();}
		if(file3.exists() == false) { file3.createNewFile();}
		
		File temp = new File("C:/Temps");
		File[] contents = temp.listFiles(); //위에 경로에 있는 파일들에 대한 파일들을 배열의 형태로 return 한다는 것이다 .
		System.out.println("날짜	시간		형태		 크기		이름");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}

}
