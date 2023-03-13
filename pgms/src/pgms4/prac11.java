package pgms4;

public class prac11 {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		String answer="";
		int w = 0;
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				w=i;
			}
		}
		answer = "김서방은 "+w+"에 있다";
		System.out.println(answer);
		
		
		
		

	}

}
