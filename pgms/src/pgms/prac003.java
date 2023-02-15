package pgms;

public class prac003 {

	public static void main(String[] args) {
		int n = 930809;
		String m = Integer.toString(n);
		int answer = 0;
		for(int i =0; i<m.length(); i++) {
			answer += m.charAt(i)-'0';
		}
		System.out.println(answer);
	}

}
