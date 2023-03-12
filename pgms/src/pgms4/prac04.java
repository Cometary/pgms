package pgms4;

public class prac04 {

	public static void main(String[] args) {
		long n = 121;
		double tmp = Math.sqrt(n);
		long m = (long)tmp;
		long answer =-1;
		
		if(m*m==n) {
			answer = (m+1)*(m+1);
		}
		System.out.println(answer);
		
		
	}

}
