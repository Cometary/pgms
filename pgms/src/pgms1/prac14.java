package pgms1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class prac14 {

	public static void main(String[] args) {
		String my = "We are the world";
		String[] str = new String[my.length()];
		
		for(int i=0; i<my.length(); i++) {
			str[i] = Character.toString(my.charAt(i));
		}
		
		LinkedHashSet<String> ll = new LinkedHashSet<>(Arrays.asList(str));
		String[] ans = ll.toArray(new String[] {});
		
		String answer = "";
		
		for(int i=0; i<ans.length; i++) {
			answer += ans[i];
		}
		
		System.out.println(answer);
	}

}
