package pgms3;

public class prac16 {

	public static void main(String[] args) {
		int[][] dots = {
				{1,4}, {9,2}, {3,8}, {11, 6}
		};
		String ans;
		int x, y;
		int answer =0;
		for(int a=0; a<3; a++) {
			for(int b=a+1; b<4; b++) {
					ans = Double.toString((double)(dots[a][0]-dots[b][0])/(double)(dots[a][1]-dots[b][1]));
					x=4; y=4;
					for(int i=0; i<4;i++) {
						if(i!=a && i!=b && x==4) {
							x=i;
						}
						if(i!=a && i!=b && x!=4) {
							y=i;
						}
					}
					if(ans.equals(Double.toString((double)(dots[x][0]-dots[y][0])/(double)(dots[x][1]-dots[y][1])))) {
						answer =1;
					}

			}
		}

		System.out.println(answer);

		
		
		
		

	}

}
