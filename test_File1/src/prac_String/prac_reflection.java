package prac_String;

import java.lang.reflect.Field;

public class prac_reflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Techie Delight";
		char ch = '_';
		int pos = 6;
		
		Field field = null;
		try {
			// `value[]` �� `String` Ŭ������ ���� ���忡 ���˴ϴ�.
			field = String.class.getDeclaredField("value");
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		
		// private ������ ������ �ֱ� ������ ���� ������ value[]�� �����մϴ�.
		field.setAccessible(true);
		

        char[] chars = new char[0];
        try {
            // �ʵ� �� ��������
            chars = (char[])field.get(str);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
 
        // ������ ��ġ�� ���� ��ü
        chars[pos] = ch;
 
        // ������ ���ڿ��� ���
        System.out.println(str);			
	}

}
