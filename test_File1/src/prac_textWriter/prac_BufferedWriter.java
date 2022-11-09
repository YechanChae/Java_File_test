package prac_textWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class prac_BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//1. 파일 객체 생성
			File file = new File("C://Temps//writerFile.txt");
			
			//2. 파일 존재여부 체크 및 생성
			if(!file.exists()) {
				file.createNewFile();
			}
			
			//3. Buffer를 사용하여 File에 Write할 수 있는 BufferedWriter 생성
			//4. FileWriter fw = new FileWriter(file, true로 하면 기존파일에서 추가가 가능하다. );
			FileWriter fw = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fw);
			
			//4. 파일에 쓰기
			writer.write("안녕하세요.");
			
			//5. BufferedWriter close .. 전에 꺼와 차이가 있다면 writer.flush()를 안써도 된다. 
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일이 저장완료!!");
	}

}
