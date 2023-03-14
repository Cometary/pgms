package pgms5;

public class prac08 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		long answer = 0;
		long sum = 0;
		
		for(int i=1; i<=count; i++) {
			sum += price * i;
		}
		
		if(money>sum) {
			answer = 0;
		}else {
			answer = sum - money; 
		}
		System.out.println(answer);

	}

}
