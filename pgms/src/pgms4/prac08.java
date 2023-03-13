package pgms4;

public class prac08 {

	public static void main(String[] args) {
		int x = 12;
		boolean answer = true;
		int y=x;
		int sum = 0;
		
		while(y!=0) {
			sum+=y%10;
			y/=10;
		}
		if(x%sum!=0) {
			answer = false;
		}
		System.out.println(answer);

	}

}
