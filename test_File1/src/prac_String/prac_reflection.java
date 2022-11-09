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
			// `value[]` 는 `String` 클래스의 문자 저장에 사용됩니다.
			field = String.class.getDeclaredField("value");
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		
		// private 범위를 가지고 있기 때문에 접근 가능한 value[]을 설정합니다.
		field.setAccessible(true);
		

        char[] chars = new char[0];
        try {
            // 필드 값 가져오기
            chars = (char[])field.get(str);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
 
        // 지정된 위치의 문자 교체
        chars[pos] = ch;
 
        // 수정된 문자열을 출력
        System.out.println(str);			
	}

}
