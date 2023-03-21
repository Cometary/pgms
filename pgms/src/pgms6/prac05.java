package pgms6;

import java.util.Arrays;

public class prac05 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int n;
		int[] tmp;
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			n = commands[i][1]-commands[i][0]+1;
			tmp= new int[n];
			for(int j=0; j<n; j++) {
				tmp[j] = array[j+commands[i][0]-1];
			}
			Arrays.sort(tmp);
			n = tmp[commands[i][2]-1];
			answer[i] = n;
		}
		
		
		
		
	}

}
