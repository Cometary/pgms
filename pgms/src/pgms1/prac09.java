package pgms1;

public class prac09 {

	public static void main(String[] args) {
		
		int n = 2003;
		String s = Integer.toString(n);
		int answer = 0;
		int a =0;
		
		for(int i=0; i<s.length();i++) {
			a = (int)s.charAt(i)-48;
			if(a!=0 && a%3==0) {
				answer ++;
			}
		}
		
		System.out.println(answer);
		
		
		
		
		

	}

}
