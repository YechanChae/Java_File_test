package prac;

public class java_prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isMarried = true;
		boolean isMan = false;
		
		String str;
		
		str = isMarried ? "��ȥ �ߴ�" : "��ȥ �� �ߴ�";
		
		if(isMarried || isMan) {
			str = "��ȥ �ߴ�";
		} else {
			str = "��ȥ ���ߴ�";
		}
		
		System.out.println(str);
	}

}
