package sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	
	public static void main(String[] args) {
		Socket socket = null; //������ ���� ��û�� �ϱ� ���ؼ� socket�̶�� ��ü�� ���� 
		
		try {
			socket = new Socket();
			System.out.println("[���� ��û]");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[���� ����]");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {	
			}
		}
		
	}
}
