package Java_Object;

public class Method_call {
	void instanceMethod() {} // �ν��Ͻ��޼���
	static void staticMethod() {} //static�޼���
	
	void instanceMethod2() { // �ν��Ͻ��޼���
		instanceMethod(); // �ٸ� �ν��Ͻ��޼��带 ȣ���Ѵ�.
		staticMethod(); // static�޼���� ȣ�� �� �� �ִ�.
	}
	
	static void staticMethod2() {
		instanceMethod(); // ����!! �ν��Ͻ��޼��带 ȣ���� �� ����.
		staticMethod(); // static�޼���� ȣ�� �� �� �ִ�.
	}
} 

class TestClass2 {
	int iv; // �ν��Ͻ� ���� 
	static int cv; // Ŭ���� ����
	
	void instanceMethod() {		// �ν��Ͻ� �޼���
		System.out.println(iv); // �ν��Ͻ� ������ ����� �� �ִ�.
		System.out.println(cv); // Ŭ���� ������ ����� �� �ִ�.
	}
	
	static void staticMethod() {
		System.out.println(iv); // �ν��Ͻ� ������ ����� �� ����.
		System.out.println(cv); // Ŭ���� ������ ����� �� �ִ�.
	}
}





