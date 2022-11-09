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

// ex2)위의 예제처럼 배열의 값을 모를 때 배열은 정의만 하고 값을 입력받아 데이터를 저장한다. 데이터의 값을 모를 경우가 더 많기 때문에 위와 같은 방법을 더 자주 사용하게 된다. 


//import java.util.Scanner; // Scanner에서 저장한 후 불러낸다고 생각하면 편하다. 
//public class prac1 {
//
//	public static void main(String[] args) {
//		int[] num = new int[5]; // 배열생성
//		int max,min;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("5개의 정수를 입력하시오");
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt(); // 데이터 입력 및 배열에 저장
//		}
//		max = num[0]; // 최대값 초기 설정
//		min = num[0]; // 최소값 초기 설정
//		for (int i = 0; i <num.length; i++) {
//			if (max < num[i]) {
//				max = num[i];
//			}
//			if (min > num[i]) {
//				min = num[i];
//			}
//		}
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
//	}
//}

// ex3) for-each 문으로 작성한 것 

public class prac1 {
	public static void main(String[] args) {
		int[] score = { 78, 70, 65, 98, 58 };
		int sum = 0;
		for (int i : score ) {
			sum += i; 
		}
		System.out.println("점수 합계 : " + sum);
	}
}

