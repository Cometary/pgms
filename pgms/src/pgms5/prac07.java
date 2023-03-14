package pgms5;

public class prac07 {

	public static void main(String[] args) {
		String s = "1234";
		if(s.length()==4 || s.length()==6) {
			for(int i=0; i<s.length(); i++) {
				if((int)(s.charAt(i))<48 || (int)(s.charAt(i))>57) {
					System.out.println("false");
				}
			}
			System.out.println("true");
			
		}
		System.out.println("false");
	}

}
