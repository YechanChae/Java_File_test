package prac_textWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class prac_Split {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> N_list_1 = new ArrayList<String>();
		ArrayList<String> N_list_2 = new ArrayList<String>();
		
		File note = new File("C:\\Temps\\note.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(note));
			String[] str = br.readLine().split("=");
			while(str != null) {
				N_list_1.add(str[0]);
				N_list_2.add(str[1]);
				str = br.readLine().split("=");
			}
			br.close();
		} catch (NullPointerException e) {
			e.getStackTrace();
		} catch (FileNotFoundException  e) {
			e.getStackTrace();
		} catch(IOException e) {
			e.getStackTrace();
		}
	
		Random rd = new Random(); // 랜덤함수 선언
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 답 입력을 위한 입력문 선언

        int Rand = rd.nextInt(N_list_1.size()); // 문제의 수 만큼 랜덤한 값을 구함

        System.out.print(N_list_1.get(Rand)+" = ");

        String result = bf.readLine(); // 입력

        if(result.equals(N_list_2.get(Rand))){ // 입력한 값이 저장된 답과 같으면 성공
            System.out.println("Success!");
        }else{
            System.out.println("Fall.."); // 입력한 값이 저장된 답과 다르면 실패
        }
	System.out.println(N_list_1);
	System.out.println(N_list_2);
	}
}
