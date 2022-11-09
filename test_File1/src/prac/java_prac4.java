package prac;
import models.Hero;
import models.Person;

public class java_prac4 {

//	public static void main(String[] args) {
//		add(50,10);
//		add(30,10);
//	}
//	public static void add(int x, int y) {
//		System.out.println(x + y);
//	}
	public static void main(String[] args) {
		System.out.println(add(50,10));
		System.out.println(add(50,10,30));
		
		System.out.println(add(1,2,3,4,5));
		
		Person person = new Person();
		Person person2 = new Person("È«±æµ¿",10);
		
		System.out.println(person);
		System.out.println(person2);
		
		Hero hero = new Hero("½´ÆÛ¸Ç");
		Hero hero2 = new Hero("º£Æ®¸Ç");
		hero.attack(hero2);
		
	}
	public static int add(int x, int y) {
		return x + y;
	}
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	public static int add(int ... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + i;
		}
		return sum;
	}
}



	

