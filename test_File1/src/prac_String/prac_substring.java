package prac_String;

public class prac_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���ڿ��� Java���� ������ �� ���� Ŭ�����Դϴ�. ��, String ��ü�� ������ �� �����ϴ�. ������ ������ �ַ���� ��ü�� ���ڷ� �� String ��ü�� ����� �� �Դϴ�. 
		
		String str = "Techie Delight";
		char ch = '_';
		int pos = 6;
		
		str = str.substring(0, pos) + ch + str.substring(pos + 1);
		System.out.println(str);
		
	} 

}
