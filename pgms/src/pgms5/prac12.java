package pgms5;

public class prac12 {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		java.util.ArrayList<Integer> arl = new java.util.ArrayList<>();
		arl.add(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1]!=arr[i]) {
				arl.add(arr[i]);
			}
		}
		int[] answer = new int[arl.size()];
		for(int i=0; i<arl.size(); i++) {
			answer[i] = arl.get(i);
		}
		
		

	}

}
