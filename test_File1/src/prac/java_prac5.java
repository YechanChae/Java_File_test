package prac;

public class java_prac5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		
		new Thread(new Runnable() {
			public void run() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName()+ i);
			}
			}
		}).start();
		
		System.out.println("2");
	}
	// �����л�� --> ��� Ÿ���� �����ϰ� ����� �ش�. 
	public static <I> void print(I type) {
		System.out.println(type);
	}
	
	
}
