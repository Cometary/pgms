package pgms5;

public class prac03 {

	public static void main(String[] args) {
		int n = 7;
		String answer = "";
		
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				answer+="수";
			}else {
				answer += "박";
			}
		}
		
		System.out.println(answer);

	}

}
