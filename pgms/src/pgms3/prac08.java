package pgms3;

public class prac08 {

	public static void main(String[] args) {
		int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
		int[] point = new int[201];
		int sum = 0;
		int answer = 0;
		boolean butn = true;
		
		for(int a=0; a<2; a++) {
			for(int b=a+1; b<3; b++) {
				point = new int[201];
				sum = 0;
				for(int i=lines[a][0]; i<=lines[a][1]; i++) {
					point[i+100]++;
				}
				for(int i=lines[b][0]; i<=lines[b][1]; i++) {
					point[i+100]++;
				}
				for(int i=0; i<201; i++) {
					if(point[i]>1) {
						sum++;
					}
				}
				if(sum>0) {
					sum--;
				}
				answer+=sum;
			}
		}
		
		
		point = new int[201];
		for(int i=0; i<lines.length; i++) {
			for(int j=lines[i][0];j<=lines[i][1];j++) {
				point[j+100]++;
			}
		}
		
		for(int i=0; i<201; i++) {
			if(point[i]>2) {
				answer--;
				butn = false;
			}
		}
		if(!butn) {
			answer--;
		}
		System.out.println(answer);
		
	}

}
