package pgms3;

import java.util.HashSet;

public class prac09 {

	public static void main(String[] args) {
		int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		HashSet<Integer> hs = new HashSet<>();
		int answer = 0;
		int x, y;
		
		for(int i=0; i<3; i++) {
			for(int j=i+1; j<4;j++) {
				x=0; y=0;
				x = (dots[i][0]-dots[j][0])*100;
				y = dots[i][1]-dots[j][1];
					hs.add((x/y));
				System.out.println((x/y)+"   "+(y/x));
			}
		}
		if(hs.size()<6) {
			answer =1;
		}
		System.out.println(answer);
		
		
		
		
	}

}
