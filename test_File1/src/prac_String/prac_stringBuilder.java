package prac_String;

public class prac_stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Techie Delight";
		char ch = '_';
		int pos = 6;
		
		StringBuilder sb = new StringBuilder(str);
		
		// ������ ��ġ�� ���� ��ü 
		sb.setCharAt(pos, ch);
		str = sb.toString();
		
		System.out.println(str);
	}

}
