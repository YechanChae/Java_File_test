package Java_Object;

public class Method_call {
	void instanceMethod() {} // 인스턴스메서드
	static void staticMethod() {} //static메서드
	
	void instanceMethod2() { // 인스턴스메서드
		instanceMethod(); // 다른 인스턴스메서드를 호출한다.
		staticMethod(); // static메서드는 호출 할 수 있다.
	}
	
	static void staticMethod2() {
		instanceMethod(); // 에러!! 인스턴스메서드를 호출할 수 없다.
		staticMethod(); // static메서드는 호출 할 수 있다.
	}
} 

class TestClass2 {
	int iv; // 인스턴스 변수 
	static int cv; // 클래스 변수
	
	void instanceMethod() {		// 인스턴스 메서드
		System.out.println(iv); // 인스턴스 변수를 사용할 수 있다.
		System.out.println(cv); // 클래스 변수를 사용할 수 있다.
	}
	
	static void staticMethod() {
		System.out.println(iv); // 인스턴스 변수는 사용할 수 없다.
		System.out.println(cv); // 클래스 변수를 사용할 수 있다.
	}
}





