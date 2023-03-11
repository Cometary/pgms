package pgms4;

public class prac02 {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		int a = x;
		long b = x;
		long[] answer = new long[n];
		
		for(int i=0; i<n; i++) {
			answer[i] = b;
			b+=a;
		}

		
	}

}
