package pgms4;

public class prac13 {

	public static void main(String[] args) {
		String phone_number = "012345678911";
		String answer = "";
		
		for(int i=0; i<phone_number.length(); i++) {
			if(i<phone_number.length()-4) {
				answer+="*";
			}else {
				answer += phone_number.charAt(i);
			}
		}
		System.out.println(answer);
		
		
		

	}

}
