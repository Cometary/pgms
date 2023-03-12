package pgms4;

import java.util.ArrayList;
import java.util.Collections;

public class prac05 {

	public static void main(String[] args) {
		long n = 118372;
		long answer;
		String m = Long.toString(n);
		char[] car = m.toCharArray();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<car.length; i++) {
			arr.add((int)car[i]-48);
		}
		
		Collections.sort(arr);
		m="";
		
		for(int i=arr.size()-1; i>=0; i--) {
			m+= arr.get(i);
		}
		
		answer = Long.parseLong(m);
		System.out.println(answer);
		
	}

}
