package pgms6;

public class prac08 {

	public static void main(String[] args) {
		int a=2;
		int b=1;
		int n=20;
		
		int answer = 0;
		while(n>=a) {
			answer+=(n/a)*b;
			n = (n%a)+(n/a)*b;
		}
		System.out.println(answer);
		
//		class Solution {
//		    public int solution(int a, int b, int n) {
//		        return (n > b ? n - b : 0) / (a - b) * b;
//		    }
//		}
		
		
		
	}

}
