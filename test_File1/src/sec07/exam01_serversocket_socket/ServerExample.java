package sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	
	public static void main(String[] args) {
	ServerSocket serverSocket = null;
	
	try {
		serverSocket = new ServerSocket(); //serverSocket 객체 생성
		serverSocket.bind(new InetSocketAddress("localhost", 5001));
		while(true) {
			System.out.println("[연결 기다림]");
			Socket socket = serverSocket.accept(); //연결요청이 들어오게 되면 socket이라고 하는 통신객체를 만들고 return 한다.
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println("[연결 수락함]" + isa.getHostName());
		} //서버는 항상 client의 연결 요청을 기다려야 하기 때문에 무한루프를 작성 
		
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

