package prac_String;

public class prac_tocharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Techie Delight";
		char ch = '_';
		int pos = 6;
		
		// 주어진 문자열을 문자 어레이로 변환
		char[] chars = str.toCharArray();
		
		// chars 어레이의 지정된 위치에 있는 문자를 교체합니다. 
		chars[pos] = ch;
		
		// 문자 어레이를 다시 문자열로 변환
		str = String.copyValueOf(chars);
		
		// 수정된 문자열을 출력
		System.out.println(str);
	}

}
