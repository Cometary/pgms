package pgms1;

import java.util.ArrayList;

public class prac08 {

	public static void main(String[] args) {
		
		int n =24;
		int c = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				c ++;
			}
		}
		int[] answer = new int[c];
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				ar.add(i);
			}
		}
		for(int i=0; i<c; i++) {
			answer[i] = ar.get(i);
			System.out.println(answer[i]);
		}
		
		
		

	}

}
