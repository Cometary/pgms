package pgms5;

public class prac04 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		int answer = 0;
		for(int i=0; i<a.length; i++) {
			answer+= a[i]*b[i];
		}
		
		System.out.println(answer);

	}

}
