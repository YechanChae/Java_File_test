package prac_String;

public class prac_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열은 Java에서 변경할 수 없는 클래스입니다. 즉, String 개체를 변경할 수 없습니다. 가능한 유일한 솔루션은 교체된 문자로 새 String 개체를 만드는 것 입니다. 
		
		String str = "Techie Delight";
		char ch = '_';
		int pos = 6;
		
		str = str.substring(0, pos) + ch + str.substring(pos + 1);
		System.out.println(str);
		
	} 

}
