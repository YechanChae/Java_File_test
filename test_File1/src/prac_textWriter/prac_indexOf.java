package prac_textWriter;

public class prac_indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello welcome to the this place";
		System.out.println(s.indexOf("welcome"));		//문자열 검색
		System.out.println(s.indexOf("t"));		//단어검색		
		System.out.println(s.indexOf("welcome",10));		//문자열을 10번째 index부터 검색
		System.out.println(s.indexOf("t",10));		//단어를 10번째 index부터 검색
		
		if(s.indexOf("welcome") != -1) {
			System.out.println("문자가 포함되어 있습니다.");
		} else {
			System.out.println("문자가 포함되어 있지 않습니다.");
		}
	}

}
