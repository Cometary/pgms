package pgms8;

public class Ex147355 {

	public static void main(String[] args) {
		String t = "10203";	
		String p = "10203";
		int answer = 0;
		int tl = t.length(); //7
		int pl = p.length(); //3
		
		for(int i = 0; i<=tl-pl; i++) {
			answer += Long.parseLong(p) >= Long.parseLong(t.substring(i, i+pl)) ? 1 : 0;
		}
	
		System.out.println(answer);

	}

}
