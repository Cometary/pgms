package pgms4;

public class prac10 {

	public static void main(String[] args) {
		int n =626331;
		long x = n;
		int result = 0;
		
		while(x!=1) {
			if(result==500) {
				result = -1;
				break;
			}
			if(x%2==0) {
				x /=2;
			}else {
				x = x*3+1;
			}
			System.out.println(result +" "+x);
			result++;
		}
		System.out.println(result);
		
	}

}
