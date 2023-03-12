package pgms4;

public class prac06 {

	public static void main(String[] args) {
		int n = 10;
		int x = 1;
		int answer =0;
		while(true) {
			if(n%x==1) {
				answer = x;
				break;
			}
			x++;
		}
		System.out.println(answer);

	}

}
