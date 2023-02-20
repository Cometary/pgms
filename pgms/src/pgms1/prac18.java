package pgms1;

public class prac18 {

	public static void main(String[] args) {
		
		int[] array = {6, 1, -2, -4, 21, 19, 28};
		int n = -3;
		int answer = array[0];
		int tmp = 0;
		
		int differ = array[0]-n;
		if(differ<0) {
			differ = -differ;
		}
		
		for(int i=1; i<array.length; i++) {
			tmp = array[i]-n;
			if(tmp<0) {
				tmp = -tmp;
			}
			if(differ==tmp && answer>array[i]) {
				answer = array[i];
			}else if(differ==tmp && answer<array[i]) {
				
			}else if(differ>tmp) {
				differ = tmp;
				answer = array[i];
			}
			
		}
		System.out.println(answer);
		
		

	}

}
