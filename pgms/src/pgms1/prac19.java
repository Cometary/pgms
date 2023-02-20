package pgms1;

public class prac19 {

	public static void main(String[] args) {
		int i = 1;
		int j = 13;
		int k = 1;
		
		int answer = 0;
		String st = "";
		
		for(int a=i; a<=j; a++) {
			st = Integer.toString(a);
			for(int b=0; b<st.length(); b++) {
				if((int)st.charAt(b)-48==k) {
					answer ++;
				}
			}
		}
		
		System.out.println(answer);

	}

}
