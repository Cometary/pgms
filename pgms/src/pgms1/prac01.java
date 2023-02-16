package pgms1;

public class prac01 {

	public static void main(String[] args) {
		int[] box = {10, 8, 6};
		int n = 3;
		int answer = 1;
		
		answer *= box[0]/n;
		answer *= box[1]/n;
		answer *= box[2]/n;
		
		System.out.println(answer);
	}

}
