package sec07.exam03_chatting;

public class ServerExample extends Application{ //ServerExample class�� Application�� ����ϰ��ִ�. 
	//field�� 3���� �����Ǿ� �ִ�. 
	ExecutorService executorService; // ������Ǯ�� �����ϱ� ���ؼ� ����
	serverSocket serverSocket; // Ŭ���̾�Ʈ�� ���� ��û�� �����ϱ� ���ؼ� ���� 
	List<Clinet> connections = new Vector<Client>(); //Ŭ���̾�Ʈ��� ��ü�� ���� List�� �����ϰ� ���� �����忡 ������ Vector�� ��� 
	
	void startServer() {
		//���� ���� �ڵ�
	}
	 
	void stopServer() {
		//���� ���� �ڵ�
	}
	
	class Client {
		//������ ��� �ڵ�
	}
	
	
}
