package prac;
import java.util.ArrayList;

public class java_prac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 �����
		int [] score = new int[] { 10, 20, 30, 40, 50 };
		int count = score.length;
		System.out.println(count);
		
		score[0] = 10;
		System.out.println(score[1]);
		System.out.println(score[score.length -1 ]); // ������ ���� ����ϰ� ������ ���� �ε����� �� ������ ���� �̴´�. 
		
		//������ �߰��ϰ� ������ list���
		//String[] names = { "ȫ�浿", "�̼���" };
		String[] names = new String[2]; // String�� ���� ������ null�� ��ȯ�Ѵ�. 
		
		ArrayList<Integer> scoreList = new ArrayList<>();
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(40);
		scoreList.add(50);
		
		// size ����Ʈ�� ���� ������ �ϱ� 
		// get() ���ϴ� ���� �̾Ƴ� �� ��� 
		
		scoreList.add(2, 200); // 2��° index�� 200�̶�� ���� �߰� 
		scoreList.remove(2); // �� �� ���!!
		System.out.println(names[0]);
		System.out.println(scoreList);
	}

}
