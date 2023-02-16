package pgms1;

public class prac05 {

	public static void main(String[] args) {
		String st = "I love you";
		int num1 = 3;
		int num2 = 6;
		String answer = "";
		
		for(int i=0; i<st.length(); i++) {
			if(i==num1) {
				answer += st.charAt(num2);
			}else if(i==num2) {
				answer += st.charAt(num1);
			}else {
				answer += st.charAt(i);
			}
		}
		
		System.out.println(answer);
		
		
		
	}

}
