package pgms1;

public class prac10 {

	public static void main(String[] args) {
		int n = 232343;
		int w = 4;
		String s = Integer.toString(n);
		char c = (char)(w+48);
		
		int answer = -1; 
		if(s.indexOf(c)!=-1) {
			answer = s.indexOf(c)+1;			
		}
		System.out.println(answer);

	}

}
