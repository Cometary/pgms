package pgms5;

public class prac01 {

	public static void main(String[] args) {
		int[] numbers = {5,8,4,0,6,7,9};
		int answer = 0;
		boolean own = false;
		
		for(int i=0; i<10; i++) {
			own = false;
			for(int j=0; j<numbers.length; j++) {
				if(numbers[j]==i) {
					own = true;
				}
			}
			if(!own) {
				answer+=i;
			}
		}
		System.out.println(answer);

	}

}
