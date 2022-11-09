package prac;
import java.util.ArrayList;

public class java_prac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 만들기
		int [] score = new int[] { 10, 20, 30, 40, 50 };
		int count = score.length;
		System.out.println(count);
		
		score[0] = 10;
		System.out.println(score[1]);
		System.out.println(score[score.length -1 ]); // 마지막 것을 출력하고 싶으면 보통 인덱스의 맨 마지막 값을 뽑는다. 
		
		//갯수를 추가하고 싶으면 list사용
		//String[] names = { "홍길동", "이순신" };
		String[] names = new String[2]; // String은 값이 없으면 null을 반환한다. 
		
		ArrayList<Integer> scoreList = new ArrayList<>();
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(40);
		scoreList.add(50);
		
		// size 리스트의 숫자 나오게 하기 
		// get() 원하는 값을 뽑아낼 때 사용 
		
		scoreList.add(2, 200); // 2번째 index에 200이라는 값을 추가 
		scoreList.remove(2); // 뺄 때 사용!!
		System.out.println(names[0]);
		System.out.println(scoreList);
	}

}
