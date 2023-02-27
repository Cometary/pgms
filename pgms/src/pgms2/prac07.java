package pgms2;

public class prac07 {

	public static void main(String[] args) {
		// [1, 2, 3, 4, 5, 6]	5
		int[] numbers = {1, 2, 3, 4, 5};
		int k = 6;
		int answer;
		if((2*k-1)%numbers.length-1<0){
            answer = numbers[numbers.length-1];
        }else{
		answer = numbers[(2*k-1)%numbers.length-1];
        }
		System.out.println(answer);
		
		
		
		
	}

}
