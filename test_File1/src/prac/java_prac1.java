package prac;

public class java_prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isMarried = true;
		boolean isMan = false;
		
		String str;
		
		str = isMarried ? "°áÈ¥ Çß´Ù" : "°áÈ¥ ¾È Çß´Ù";
		
		if(isMarried || isMan) {
			str = "°áÈ¥ Çß´Ù";
		} else {
			str = "°áÈ¥ ¾ÈÇß´Ù";
		}
		
		System.out.println(str);
	}

}
