package prac;
import java.util.Random;
import java.util.Scanner; //�ڹٿ��� ���� �ް� ���� ���� Scanner�� ����Ѵ�. 

public class java_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 30;
		int x = 30;
		short s = 30;
		byte b = 30;
		
		int i = (int)30L; //����Ÿ���� ūŸ�Կ� ���� ������ ����ȯ�� ���� �ʿ䰡 ������ ūŸ���� ���� Ÿ�Կ� ���� ������ ����ȯ�� ������Ѵ�)
		long ll = 30;
		System.out.println(35);
		
		System.out.printf("���� %s�Դϴ�. ���̴� %d�̰��. Ű�� %fcm�Դϴ�.\n", "ȫ�浿", 20, 180.5f);
		
		String str2 =String.format("���� %s�Դϴ�. ���̴� %d�̰��. Ű�� %fcm�Դϴ�.", "ȫ�浿", 20, 180.5f);
		
		System.out.println(str2);
		
		System.out.println(Math.max(10, 30));
		System.out.println(Math.min(10, 30));
		System.out.println(Math.abs(-30));
		
		String str = "100"; //���ڿ� ���� ��ȯ
		int in = Integer.parseInt(str);
		
		String str3 = String.valueOf(in);
		
		System.out.println(in);
		System.out.println(str3);
		
		Random random = new Random(); //�����ϰ� ���� ���
		int rand = random.nextInt(4)+5; // �⺻�� 0���� x���� �̹Ƿ� ����ؼ� ������ ������ �־�� �Ѵ�.
		
		System.out.println(rand);
		
		Scanner scanner = new Scanner(System.in); //����ϱ� ���� �� 
		int i1 = scanner.nextInt();
		
		
		System.out.println(i1); //scanner.next()�� ���� ���ڸ� ��� �� �� �ִ�. 
	}

}
