package pgms;

public class prac012 {

	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int n = 4;
		String answer = "";
		
		for(int i=1; i<=cipher.length()/n;i++) {
			answer += cipher.charAt(n*i-1);
		}
		System.out.println(answer);

	}

}
