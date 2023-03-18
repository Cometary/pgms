package pgms6;

public class prac01 {

	public static void main(String[] args) {
		int[] number = {-2, 3, 0, 2, -5};
		int result = 0;
		
		for(int i=1; i<number.length-1; i++) {
			for(int j=i+1; j<number.length; j++) {
				if(number[i]+number[j]+number[i-1]==0) {
					result++;
					System.out.println(number[i]+" "+number[j]+" "+number[i-1]);
				}
			}
		}
		
		System.out.println(result);
		
		
		
		
	}

}
