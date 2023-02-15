package pgms;

public class prac006 {

	public static void main(String[] args) {
		int n = 999;
		int answer = 0; //201
		
//		while(n>=5) {
//			n -= 5;
//			answer +=1;
//		}
//		
//		while(n>=3) {
//			n -= 3;
//			answer +=1;			
//		}
//
//		while(n>=1) {
//			n -= 1;
//			answer +=1;			
//		}
		
		answer += n/5;
		n %= 5;
		
		answer += n/3;
		n %= 3;
		
		answer += n/1;
		n %= 1;
		
		System.out.println(answer);
		
	}

}
