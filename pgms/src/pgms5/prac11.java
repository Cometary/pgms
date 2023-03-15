package pgms5;

public class prac11 {

	public static void main(String[] args) {
		int n = 7;
		int m = 15;
		int[] answer = new int[2];
		int a = 0;
		
		if(n>m) {
			a = n;
			n = m;
			m = a;
		}
		
		for(int i=1; i<=n; i++) {
			if(n%i==0 && m%i==0) {
				answer[0] = i;
			}
		}
		
		int i = m;
		while(true) {
			if(i%n==0 && i%m==0) {
				answer[1] = i;
				break;
			}
			i++;
		}
		System.out.println(answer[0]+" "+answer[1]);
		
		
		

	}

}
