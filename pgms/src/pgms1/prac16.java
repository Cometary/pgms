package pgms1;

public class prac16 {

	public static void main(String[] args) {
		int n = 7;
		int tmp = 1;
		int answer = 0;
		
		for(int i=1; tmp<=n; i++) {
			tmp *= i;
			if(tmp<n) {
				answer = i;
			}else {
				answer = i-1;				
			}
		}
		
		System.out.println(answer);

	}

}
