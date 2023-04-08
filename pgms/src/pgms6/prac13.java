package pgms6;

import java.util.Arrays;

public class prac13 {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		int[] a = new int[N+1]; 
		float[] b	= new float[N+1];
		for(int i=0; i<stages.length; i++) {
			a[stages[i]-1]++;
			for(int j=0; j<stages[i]; j++) {
				b[j]++;
			}
		}
		float[] c = new float[N+1];
		for(int i=0; i<c.length; i++) {
			if(b[i]==0) {
				c[i] = 0;
			}else {
			c[i] = a[i] / b[i];
			}
//			System.out.println(i+"번째 "+a[i]+" / "+b[i]+" = "+c[i]);
			System.out.println(c[i]);
		}
//		int[] answer = new int[N];
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<N; j++) {
//				if(c[i])
//			}
//		}
		
		
		
		
		
		
		
		

	}

}
