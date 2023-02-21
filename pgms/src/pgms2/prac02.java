package pgms2;

import java.util.Arrays;

public class prac02 {

	public static void main(String[] args) {
		String s = "hello";
		String[] ss = new String[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			ss[i] = Character.toString(s.charAt(i));
		}
		Arrays.sort(ss);
//		
//		for(int i=0; i<ss.length; i++) {
//			System.out.println(ss[i]);
//		}
		
		String answer = "";
		
		if(!ss[0].equals(ss[1])) {
			answer += ss[0];				
		}			
		for(int i=1; i<ss.length-1; i++) {
			if(!ss[i].equals(ss[i+1]) && !ss[i].equals(ss[i-1])) {
				answer += ss[i];
			}
		}
		if(!ss[ss.length-2].equals(ss[ss.length-1])) {
			answer += ss[ss.length-1];				
		}
		System.out.println(answer);
		
		
		
		
		
		
		
		
	}

}
