package test_File1;

import java.io.BufferedInputStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

public static void main(String[] args) {
		
		String serverIP = "127.0.0.1";
		Socket socket = null; 
		
		try {
			socket = new Socket(serverIP,5002); // ��������
			System.out.println("������ ����Ǿ����ϴ�.");
			
			String filePath = "C:\\Temps\\test";
			String fileNm = "test.txt";
			FileSender fs = new FileSender(socket, filePath, fileNm);
			fs.start();
			System.out.println("�߰��ܰ�");
		} catch(IOException e) {
			e.printStackTrace();
		}

	}
}

//
class FileSender extends Thread {
	String filePath;
	String fileNm;
	Socket socket;
	DataOutputStream dos;
	FileInputStream fis;
	BufferedInputStream bis;
	
	public FileSender(Socket socket, String filePath, String fileNm) {
		
		this.socket = socket;
		this.fileNm = fileNm;
		this.filePath = filePath;
		
		try {
			dos = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// @Override
	public void run() {
		try {
			dos.writeUTF("file"); // ���� ������ ������ ����
			dos.flush(); // ������ ���� ���ؼ�
			
			String result = fileRead(dos);
			System.out.println("result:" + result);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try { dos.close();} catch (IOException e) { e.printStackTrace();}
			try { bis.close();} catch (IOException e) { e.printStackTrace();}
		}
	}
	 
	private String fileRead(DataOutputStream dos ) {
		String result;
		try {
			dos.writeUTF(fileNm); // ������ ����
			
			File file = new File(filePath + "/" + fileNm);
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			int len;
			int size = 4096;
			byte[] data = new byte[size];
			while ((len = bis.read(data)) != -1) {
				dos.write(data, 0, len);
			}
			
			dos.flush(); // ����
			result = "SUCCESS";
		} catch (IOException e) {
			e.printStackTrace();
			result = "ERROR";
		} finally {
			try { fis.close(); } catch (IOException e) {e.printStackTrace(); }
		}
		
		return result;
		
	}
	
}
		
		
		
	
	
	
	
	

	
	

