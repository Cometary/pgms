package pgms1;

public class prac12 {

	public static void main(String[] args) {
		int n = 15;
		int answer = 0;
		int trans = 0;
		
		for(int i=1; i<=n; i++) {
			trans = 0;
			for(int k=1; k<=i; k++) {
				if(i%k==0) {
					trans ++;
				}
			}	
			if(trans>2) {
				answer ++;
			}
		}
		
		System.out.println(answer);

	}

}
