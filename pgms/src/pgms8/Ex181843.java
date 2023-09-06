package pgms8;

public class Ex181843 {

	public static void main(String[] args) {
		String my_string = "banana";	
		String target = "anan";
		int answer;
		
//		answer = my_string.indexOf(target)>=0 ? 1 : 0;
		
		answer = my_string.contains(target) ? 1 : 0;
		
		// 연산속도 자체는 indexOf함수가 더 빠르다 함
		
		System.out.println(answer);

	}

}
