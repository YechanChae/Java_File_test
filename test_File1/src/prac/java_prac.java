package prac;
import java.util.Random;
import java.util.Scanner; //자바에서 값을 받고 싶을 때는 Scanner을 사용한다. 

public class java_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 30;
		int x = 30;
		short s = 30;
		byte b = 30;
		
		int i = (int)30L; //작은타입을 큰타입에 넣을 때에는 형변환을 해줄 필요가 없지만 큰타입을 작은 타입에 넣을 때에는 형변환을 해줘야한다)
		long ll = 30;
		System.out.println(35);
		
		System.out.printf("저는 %s입니다. 나이는 %d이고요. 키는 %fcm입니다.\n", "홍길동", 20, 180.5f);
		
		String str2 =String.format("저는 %s입니다. 나이는 %d이고요. 키는 %fcm입니다.", "홍길동", 20, 180.5f);
		
		System.out.println(str2);
		
		System.out.println(Math.max(10, 30));
		System.out.println(Math.min(10, 30));
		System.out.println(Math.abs(-30));
		
		String str = "100"; //문자열 숫자 변환
		int in = Integer.parseInt(str);
		
		String str3 = String.valueOf(in);
		
		System.out.println(in);
		System.out.println(str3);
		
		Random random = new Random(); //랜덤하게 숫자 찍기
		int rand = random.nextInt(4)+5; // 기본이 0부터 x까지 이므로 계산해서 범위를 설정해 주어야 한다.
		
		System.out.println(rand);
		
		Scanner scanner = new Scanner(System.in); //출력하기 위한 것 
		int i1 = scanner.nextInt();
		
		
		System.out.println(i1); //scanner.next()를 쓰면 문자를 출력 할 수 있다. 
	}

}
