package prac_String;

public class prac_tocharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Techie Delight";
		char ch = '_';
		int pos = 6;
		
		// �־��� ���ڿ��� ���� ��̷� ��ȯ
		char[] chars = str.toCharArray();
		
		// chars ����� ������ ��ġ�� �ִ� ���ڸ� ��ü�մϴ�. 
		chars[pos] = ch;
		
		// ���� ��̸� �ٽ� ���ڿ��� ��ȯ
		str = String.copyValueOf(chars);
		
		// ������ ���ڿ��� ���
		System.out.println(str);
	}

}
