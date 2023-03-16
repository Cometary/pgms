package pgms5;

import java.util.Arrays;

public class prac15 {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		int answer =0;
		Arrays.sort(d);
		for(int i=0; i<d.length; i++) {
			System.out.println(d[i]);
			budget -= d[i];
			if(budget==0) {
				answer = i+1;
			}
			if(budget<0) {
				answer = i-1;
			}
		}
		System.out.println(answer);
	}

}
