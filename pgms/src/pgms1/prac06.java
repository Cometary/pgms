package pgms1;

public class prac06 {

	public static void main(String[] args) {
		
		int age = 2351;
		String sage = Integer.toString(age);
		String answer = "";
		
		char c = 97;
		int n = 0;
		
		for(int i=0; i<sage.length(); i++) {
			n = sage.charAt(i)+49;
			c = (char)n;
			answer += c;
		}
		System.out.println(answer);
		
		
		
	}

}
