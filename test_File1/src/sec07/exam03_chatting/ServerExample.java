package sec07.exam03_chatting;

public class ServerExample extends Application{ //ServerExample class는 Application을 상속하고있다. 
	//field로 3개가 생성되어 있다. 
	ExecutorService executorService; // 스레드풀을 생성하기 위해서 선언
	serverSocket serverSocket; // 클라이언트의 연결 요청을 수락하기 위해서 선언 
	List<Clinet> connections = new Vector<Client>(); //클라이언트라는 객체를 만들어서 List에 저장하고 관리 스레드에 안전한 Vector을 사용 
	
	void startServer() {
		//서버 시작 코드
	}
	 
	void stopServer() {
		//서버 종료 코드
	}
	
	class Client {
		//데이터 통신 코드
	}
	
	
}
