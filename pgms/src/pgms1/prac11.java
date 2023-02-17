package pgms1;

import java.util.Arrays;

public class prac11 {

	public static void main(String[] args) {
		
		String qu = "Python";
		qu = qu.toLowerCase();
		char[] c = qu.toCharArray();
		Arrays.sort(c);
		String answer = String.valueOf(c);
		
		System.out.println(answer);
		
		
		
	}

}
