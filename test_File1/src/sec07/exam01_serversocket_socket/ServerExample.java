package sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	
	public static void main(String[] args) {
	ServerSocket serverSocket = null;
	
	try {
		serverSocket = new ServerSocket(); //serverSocket ��ü ����
		serverSocket.bind(new InetSocketAddress("localhost", 5001));
		while(true) {
			System.out.println("[���� ��ٸ�]");
			Socket socket = serverSocket.accept(); //�����û�� ������ �Ǹ� socket�̶�� �ϴ� ��Ű�ü�� ����� return �Ѵ�.
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println("[���� ������]" + isa.getHostName());
		} //������ �׻� client�� ���� ��û�� ��ٷ��� �ϱ� ������ ���ѷ����� �ۼ� 
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	if(!serverSocket.isClosed()) {
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}

