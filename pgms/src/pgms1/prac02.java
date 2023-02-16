package pgms1;

import java.util.ArrayList;
import java.util.Collections;

public class prac02 {

	public static void main(String[] args) {
		int[] nums = {1, 2, -3, 4, -5};
		ArrayList<Integer> ar = new ArrayList<>();
		int x = 0;
		int y = 0;
		for(int i=0;i<nums.length-1;i++) {
			x = nums[i];
			for(int k=i+1;k<nums.length;k++) {
				y = x*nums[k];
				System.out.println(y);
				ar.add(y);
			}
		}
		Collections.sort(ar);
		
		System.out.println(ar.get(ar.size()-1));
		
		
		
		
		
		

	}

}
