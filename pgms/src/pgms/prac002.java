package pgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class prac002 {

	public static void main(String[] args) {
		
		
		int[] num = {1, 2, 3, 4, 5};
		Integer[] con = Arrays.stream(num).boxed().toArray(Integer[]::new);
		ArrayList<Integer> list = new ArrayList(Arrays.asList(con));
		Collections.sort(list);
		
		int n = list.size();
		
		System.out.println(list.get(n/2));
		
	}

}
