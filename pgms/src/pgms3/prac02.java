package pgms3;

import java.util.ArrayList;

public class prac02 {

	public static void main(String[] args) {
		
		int n = 10;
		
		ArrayList<Integer> num = new ArrayList<>();
		for(int i=1; num.size()<101; i++) {
			if(Integer.toString(i).contains("3")==false && i%3!=0) {
				num.add(i);
			}
		}
		
		System.out.println(num.get(n-1));
		
		
		
		
		

	}

}
