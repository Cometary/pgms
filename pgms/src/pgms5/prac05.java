package pgms5;

import java.util.Arrays;

public class prac05 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		int[] in = new int[s.length()];
		System.out.println(s.charAt(0)+0);
		System.out.println(s.charAt(1)+0);
		for(int i=0; i<in.length; i++) {
			in[i] = s.charAt(i)+0;
		}
		Arrays.sort(in);
		String answer ="";
		for(int i=in.length-1; i>=0; i--) {
			answer += (char)in[i];
		}
		System.out.println(answer);
		
	}

}
