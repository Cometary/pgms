package pgms8;

public class Ex181907 {

	public static void main(String[] args) {
		String my_string = "ProgrammerS123";
		int n = 11;
		String answer = "";
		
//		// 12ms
//		for(int i=0; i<n; i++) {
//			answer += my_string.charAt(i);
//		}
		
		// 0.02ms
		answer = my_string.substring(0, n);
		
		System.out.println(answer);
		

	}

}
