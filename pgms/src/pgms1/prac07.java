package pgms1;

public class prac07 {

	public static void main(String[] args) {
		int n = 6;
		int p = 30;
		int answer =0;
		
		if(p%2==0 && p%3==0) {
			answer = p/n;
		}else if(p%2==0 && p%3!=0) {
			answer = p/2;
		}else if(p%2!=0 && p%3==0) {
			answer = p/3;
		}else {
			answer = p;
		}
		System.out.println(answer);
		

	}

}
