package prac_textWriter;

public class prac_indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello welcome to the this place";
		System.out.println(s.indexOf("welcome"));		//���ڿ� �˻�
		System.out.println(s.indexOf("t"));		//�ܾ�˻�		
		System.out.println(s.indexOf("welcome",10));		//���ڿ��� 10��° index���� �˻�
		System.out.println(s.indexOf("t",10));		//�ܾ 10��° index���� �˻�
		
		if(s.indexOf("welcome") != -1) {
			System.out.println("���ڰ� ���ԵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println("���ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
		}
	}

}
