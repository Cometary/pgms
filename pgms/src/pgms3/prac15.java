package pgms3;

import java.util.HashSet;

public class prac15 {

	public static void main(String[] args) {
		int[][] dots = {
				{3,5}, {4,5}, {2,4}, {3, 4}
		};
		HashSet<String> hs = new HashSet<>();
		int answer = 0;
		int x, y, a, b,max, gcd=1;
		String minus;
		
		for(int i=0; i<3; i++) {
			for(int j=i+1; j<4;j++) {
				minus = "";
				x=0; y=0;
				x = dots[i][0]-dots[j][0];
				y = dots[i][1]-dots[j][1];
				a =x ; b=y;
				if(x*y<0) {
					minus += "-";
				}
				a = Math.abs(x);
				b = Math.abs(y);
				if(a>b) {
					max = a;
					a = b;
					b = max;
				}
				for(int k=1; k<=a; k++) {
					if(b%k==0 && a%k ==0) {
						gcd = k;
					}
				}
				a= Math.abs(x/gcd);
				b= Math.abs(y/gcd);
				hs.add(minus+" "+a+" "+b);
				System.out.println(minus+" "+a+" "+b);
			}
		}
		if(hs.size()<6) {
			answer =1;
		}
		System.out.println(answer);
		
	}

}
