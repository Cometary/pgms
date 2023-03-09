package pgms3;

import java.util.HashSet;

public class prac12 {

	public static void main(String[] args) {
		int[] sides = {3, 6};
		HashSet<Integer> hs = new HashSet<>();
		int answer;
		
		if(sides[1]>sides[0]) {
			int max = sides[1];
			sides[1] = sides[0];
			sides[0] = max;
		}
		
		for(int i=1; i<=sides[0]; i++) {
			if(sides[0]<sides[1]+i) {
				hs.add(i);
			}
		}
		
		for(int i=sides[0]+1; i<sides[0]+sides[1]; i++) {
			if(sides[0]+sides[1]>i ) {
				hs.add(i);
			}
		}
		
		answer = hs.size();
		System.out.println(answer);
		
		
		
	}

}
