package pgms1;

import java.util.Arrays;

public class prac15 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		int answer = 1;
		String[] be = new String[before.length()];
		String[] af = new String[after.length()];
		for(int i=0; i<be.length; i++) {
			be[i]=Character.toString(before.charAt(i));
			af[i]=Character.toString(after.charAt(i));
		}
		Arrays.sort(be);
		Arrays.sort(af);
		for(int i=0; i<be.length; i++) {
			if(!be[i].equals(af[i])) {				
				answer = 0;
			}
		}
		
		System.out.println(answer);
	}

}
