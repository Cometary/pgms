package pgms4;

public class prac03 {

	public static void main(String[] args) {
		String s = "pPoooyY";
		s = s.toLowerCase();
		int p=0;
		int y=0;
		boolean answer = true;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='p') {
				p++;
			}
			if(s.charAt(i)=='y') {
				y++;
			}
		}
		if(p!=y) {
			answer = false;
		}
		
		
		
	}

}
