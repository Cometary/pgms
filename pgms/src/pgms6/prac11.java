package pgms6;

public class prac11 {

	public static void main(String[] args) {
		
		int n = 10;
		int answer = n-1;
		for(int i=2; i<=n; i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					answer--;
					System.out.println("i : "+i+", j : "+j);
					break;
				}
			}
		}
		System.out.println(answer);
		
		
		
		

	}

}
