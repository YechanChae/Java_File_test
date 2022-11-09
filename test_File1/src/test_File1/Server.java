package test_File1;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Server {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			
			serverSocket = new ServerSocket(); //serverSocket 객체 생성
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5002));
			
			while (true) {
				System.out.println("[연결 기다림]");
				socket = serverSocket.accept(); //연결요청이 들어오게 되면 socket이라고 하는 통신객체를 만들고 return 한다.
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
				
				Receiver receiver = new Receiver(socket);
				receiver.start();
				System.out.println("파일전송 테스트");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
//
class Receiver extends Thread {
	
	Socket socket;
	DataInputStream dis = null;
	FileOutputStream fos = null;
	BufferedOutputStream bos = null; // 버퍼를 이용한 속도 증가 
	
	public Receiver(Socket socket) {
		this.socket = socket;
	}
	
	// @Override
	public void run() {
		
		try {
			dis = new DataInputStream(socket.getInputStream());
			String type = dis.readUTF();
			
			if(type.equals("file")) {
				String result = fileWrite(dis);
				System.out.println("result:" + result); 
			} 
		} catch (IOException e) {
			System.out.println("run() Fail");
			e.printStackTrace();
		}
	}
	
	 public static void StringArray(String str, char arr) {
		    String str1 = str; 

		    char[] arr1 = new char[str1.length()];

		    for (int i = 0; i < str1.length(); i++) {
		      arr1[i] = str1.charAt(i);
		    }

		    for (char x : arr1) {
		      System.out.println(x);
		    }
	 }
	
	 public static int[] ElementRemove(int[] Array) {
		    int[] newArray = new int[Array.length - 1];

		    for(int index = 0; index < Array.length - 1; index++) {
		      newArray[index] = Array[index];
		    }
		    return newArray;
		  }
	 
	private String fileWrite(DataInputStream dis) {
		
		String result;
		String filePath = "C:\\Temps\\test1";
		String data_b = null;
		
		try {
			File file_b = new File("C:\\Temps\\test1\\test.txt");
			FileReader filereader = new FileReader(file_b);
			
			Path bef_path = Paths.get("C:\\Temps\\test1\\test.txt");
			
			long beforesize = Files.size(bef_path);
			System.out.println(beforesize);
			
			System.out.println("파일 수신 작업을 시작합니다.");
			
			String fileNm = dis.readUTF();
			System.out.println("파일명"+ fileNm + "을 전송받았습니다.");
			
			File file = new File(filePath + "/" + fileNm);
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			System.out.println(fileNm + "파일을 생성하였습니다. ");
			
			int len;
			int size = 4096;
			byte[] data = new byte[size];
			while ((len = dis.read(data)) != -1) {
				bos.write(data, 0, len);
			}
			
			bos.flush();
			result = "SUCCESS";
			System.out.println("파일 수신 작업을 완료하였습니다.");
			System.out.println("받은 파일의 사이즈 : " + file.length());
//			
			
			Path cur_path = Paths.get("C:\\Temps\\test1\\test.txt");
			
			long currentsize = Files.size(cur_path);
			System.out.println(currentsize);
			
			
//			String covert_bf = new String(data_b);
//			char[] arr_bf = covert_bf.toCharArray();
//			for(int i=0;i<arr_bf.length;i++){
//				
//			}
//			
//			
//			String covert_lf = new String(data);
//			char[] arr_lf = covert_lf.toCharArray();
//			for(int i=0;i<arr_lf.length;i++){
//				
//			}
//			
//			
			
//			if(file_bl < file.length()) {
//				
//				System.out.println("변경해야함");
//			} else {
//				System.out.println("변경사항이 없습니다.");
//			}
			
		} catch(IOException e) {
			e.printStackTrace();
			result = "ERROR";
		} finally {
			try {bos.close();} catch (IOException e) {e.printStackTrace();}
			try {fos.close();} catch (IOException e) {e.printStackTrace();}
			try {dis.close();} catch (IOException e) {e.printStackTrace();}
		}
		return result;
	} 	
				
}


