package Prac_Replace;

import java.util.Scanner;

public class prac_charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		char c = ' ';
		str = "�ȳ��ϼ���";
		c = str.charAt(2);
		System.out.println(c);
		
		//charAt�� ����ϴ� 2���� ���
		// 1) StringŸ���� �������� �ڿ� �ٿ��� ���
		// 2) Scanner���� next()�Ǵ� nextLine()�ڿ� �ٿ��� ����ϴ� ���
		
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
