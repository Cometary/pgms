package pgms8;

public class Ex181929 {

	public static void main(String[] args) {
		int[] num_list1 = {3, 4, 5, 2, 1};
		int[] num_list2 = {5, 7, 8, 3};
		
		int xx = 1;
		int plus = 0;
		
		for(int num : num_list1) {
			xx *= num;
			plus += num;
		}
		
		System.out.println("xx : "+xx+", plus : "+plus);
		
		int answer;
		if(xx<Math.pow(plus, 2)) {
			answer = 1;
		}else {
			answer = 0;
		}
		
		System.out.println("answer : "+answer);
	}

}
