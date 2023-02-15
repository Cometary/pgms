package pgms;

import java.util.ArrayList;

public class prac008 {

	public static void main(String[] args) {
		String s = "hello";
		int n = 3;

		
//		ArrayList<String> ar = new ArrayList<String>();
//		
//		for(int i=0; i<s.length(); i++) {
//			for(int k=0; k<n; k++) {
//				ar.add(String.valueOf(s.charAt(i)));
//			}
//		}
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i=0; i<ar.size();i++) {
//			sb.append(ar.get(i));
//		}
//		String answer = sb.toString();
//		
//		System.out.println(answer);
		
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			for(int i=0; i<n; i++) {
				sb.append(c);				
			}
		}
		String answer = sb.toString();
		System.out.println(answer);
		
	}

}
