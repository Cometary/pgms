package pgms3;

public class prac14 {

	public static void main(String[] args) {
		int[][] lines = {{-3, -1}, {-1, 0}, {0, 2}};
		int[] a;
		int[] b = new int[201];
		int answer=0;
		
		for(int i=0; i<2; i++) {
			for(int j=i+1; j<3; j++) {
				a = new int[201];
				for(int x=lines[i][0]; x<=lines[i][1]; x++) {
					a[x+100]++;
				}
				for(int x=lines[j][0]; x<=lines[j][1]; x++) {
					a[x+100]++;
				}
				if((a[0]>1 && a[0+1]>1)) {
					b[0]++;
				}
				if((a[199]>1 && a[200]>1)) {
					b[200]++;
				}				
				for(int x=1; x<200; x++) {
					if((a[x]>1 && a[x+1]>1) || (a[x-1]>1 && a[x]>1)) {
						b[x]++;
					}
				}		
			}
		}
		for(int i=0; i<200; i++) {
			if(b[i]>0 && b[i+1]>0) {
				answer ++;
			}
		}
		System.out.println(answer);
		
		
		
		
	}

}
