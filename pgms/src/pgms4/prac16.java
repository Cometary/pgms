package pgms4;

public class prac16 {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int min =arr[0];
		int mini = 0;
		int[] answer;
		
		if(arr.length==1) {
			answer = new int[1];
			answer[0] = -1;
		}else {
		answer = new int[arr.length-1];
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
				mini = i;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i<mini) {
				answer[i] = arr[i];
			}else if(i==mini) {
				
			}else {
				answer[i-1] = arr[i];
			}
		}
		}
		
		
		
		

	}

}
