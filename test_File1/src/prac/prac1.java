package prac;

// ex1)

//public class prac1 {
//
//	public static void main(String[] args) {
//		int[] num = new int[3];
//		num[0] = 10;
//		num[1] = 15;
//		num[2] = 13;
//		for (int i =0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
//	}
//}

// ex2)���� ����ó�� �迭�� ���� �� �� �迭�� ���Ǹ� �ϰ� ���� �Է¹޾� �����͸� �����Ѵ�. �������� ���� �� ��찡 �� ���� ������ ���� ���� ����� �� ���� ����ϰ� �ȴ�. 


//import java.util.Scanner; // Scanner���� ������ �� �ҷ����ٰ� �����ϸ� ���ϴ�. 
//public class prac1 {
//
//	public static void main(String[] args) {
//		int[] num = new int[5]; // �迭����
//		int max,min;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("5���� ������ �Է��Ͻÿ�");
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt(); // ������ �Է� �� �迭�� ����
//		}
//		max = num[0]; // �ִ밪 �ʱ� ����
//		min = num[0]; // �ּҰ� �ʱ� ����
//		for (int i = 0; i <num.length; i++) {
//			if (max < num[i]) {
//				max = num[i];
//			}
//			if (min > num[i]) {
//				min = num[i];
//			}
//		}
//		System.out.println("�ִ밪 : " + max);
//		System.out.println("�ּҰ� : " + min);
//	}
//}

// ex3) for-each ������ �ۼ��� �� 

public class prac1 {
	public static void main(String[] args) {
		int[] score = { 78, 70, 65, 98, 58 };
		int sum = 0;
		for (int i : score ) {
			sum += i; 
		}
		System.out.println("���� �հ� : " + sum);
	}
}

