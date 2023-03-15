package pgms5;

public class prac13 {

	public static void main(String[] args) {
		int n = 45;
		String s3 = Integer.toString(n, 3);
		String s3r = "";
		for(int i=s3.length()-1; i>=0; i--) {
			s3r += s3.charAt(i);
		}
		int answer = Integer.parseInt(s3r, 3); 
		System.out.println(answer);
		
	}

}
