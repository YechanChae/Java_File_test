package Prac_Replace;

import java.util.Scanner;

public class prac_charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		char c = ' ';
		str = "안녕하세요";
		c = str.charAt(2);
		System.out.println(c);
		
		//charAt을 사용하는 2가지 방법
		// 1) String타입의 참조변수 뒤에 붙여서 사용
		// 2) Scanner에서 next()또는 nextLine()뒤에 붙여서 사용하는 방법
		
		Scanner sc = new Scanner(System.in);
		
		char c1 = ' ';
		char c2 = ' ';
		
		c1 = sc.next().charAt(0);
		c2 = sc.nextLine().charAt(3);
		
		System.out.println(c1);
		System.out.println(c2);
		
		sc.close();
	}

}
