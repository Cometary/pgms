package pgms2;

public class prac16 {

	public static void main(String[] args) {
		int[][] dots = new int[4][2];
		dots[0][0] = -1;
		dots[0][1] = -1;
		dots[1][0] = 1;
		dots[1][1] = 1;
		dots[2][0] = 1;
		dots[2][1] = -1;
		dots[3][0] = -1;
		dots[3][1] = 1;
		
		int max=dots[0][0];
		int min=dots[0][0];
		
		for(int i =1; i<4; i++) {
			if(max<dots[i][0]) {
				max = dots[i][0];
			}
			if(min>dots[i][0]) {
				min = dots[i][0];
			}
		}
		
		int x = max-min;
		
		max=dots[0][1];
		min=dots[0][1];
		
		for(int i =1; i<4; i++) {
			if(max<dots[i][1]) {
				max = dots[i][1];
			}
			if(min>dots[i][1]) {
				min = dots[i][1];
			}
		}
		
		int y = max-min;
		
		int answer = x* y;
		
		System.out.println(answer);
		
		
		
	}

}
