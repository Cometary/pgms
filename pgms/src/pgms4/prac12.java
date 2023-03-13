package pgms4;

import java.util.ArrayList;

public class prac12 {

	public static void main(String[] args) {
		
	int[] arr = {5, 9, 7, 10};
	int divisor = 5;
	ArrayList<Integer> ans = new ArrayList<>();
	int[] answer = {};
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]%divisor==0) {
			ans.add(arr[i]);
		}
	}
	if(!ans.isEmpty()) {
		java.util.Collections.sort(ans);
	answer = new int[ans.size()];
	for(int i=0; i<ans.size(); i++) {
		answer[i] = ans.get(i);
	}
	}else {
		answer = new int[1];
		answer[0] = -1;
	}
	
	
	
	}
}
