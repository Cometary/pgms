package pgms3;

public class prac06 {

	public static void main(String[] args) {
		int num = 5;
		int total = 5;
		int sum=0;
		int[] answer = new int[num];
		
		for(int i=-num;i<1000;i++) {
			sum=0;
			for(int j=0;j<num;j++) {
				sum+= i+j;
			}
			if(sum==total) {
				for(int j=0;j<num;j++) {
					answer[j] = i+j;
					System.out.println(answer[j]);
				}
			}
		}
		

	}

}
