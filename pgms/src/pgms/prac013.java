package pgms;

import java.util.Arrays;

public class prac013 {

	public static void main(String[] args) {
		String my = "hi12392";
		
		String st = my.replaceAll("[^0-9]", "");
		int[] answer = new int[st.length()];
		for(int i=0;i<st.length(); i++) {
			answer[i] = st.charAt(i)-'0';
		}
		
		Arrays.sort(answer);
		

	}

}
