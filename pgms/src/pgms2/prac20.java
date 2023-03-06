package pgms2;

public class prac20 {

	public static void main(String[] args) {
		int[][] score = new int[][] {
//			{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}
			{80, 70}, {90, 50}, {40, 70}, {50, 80}, {0, 0}, {0, 0}
		};
		
		int[] avg = new int[score.length];
		int[] answer = new int[score.length];
		
		for(int i=0; i<score.length; i++) {
			avg[i] = (score[i][0] + score[i][1]);
			answer[i]++;
		}
		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(avg[i]<avg[j]) {
					answer[i]++;
				}
			}
		}
		for(int i=0; i<score.length; i++) {
			System.out.println(answer[i]);
		}
		
		
		System.out.println();
	}

}
