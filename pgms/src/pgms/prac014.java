package pgms;

import java.util.ArrayList;

public class prac014 {

	public static void main(String[] args) {
		int[] a = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int n = 3;
//		String b ="";
//		
//		for(int i=0; i<a.length;i++) {
//			if(a[i]%3==0) {
//				b += Integer.toString(a[i]);
//			}
//		}
//		int[] answer = new int[b.length()];
//		for(int i=0; i<b.length(); i++) {
//			answer[i] = b.charAt(i)-'0';
//			System.out.print(answer[i]);
//		}
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=0; i<a.length;i++) {
			if(a[i]%3==0) {
				ar.add(a[i]);
			}
		}
		int[] answer = new int[ar.size()];
		for(int i=0; i<ar.size();i++) {			
			System.out.println(ar.get(i));
			answer[i] = ar.get(i);
			System.out.println(answer[i]);			
		}
		
		
	}

}
