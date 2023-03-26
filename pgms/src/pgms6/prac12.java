package pgms6;

public class prac12 {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5,1,2,3,4,5};
		
		int[] one = {1,2,3,4,5};
		int[] two = {2,1,2,3,2,4,2,5};
		int[] thr = {3,3,1,1,2,2,4,4,5,5};
		
		int[] person = {0,0,0};
		
		for(int i=0; i<answers.length; i++) {
			if(one[i%5]==answers[i]) {
				person[0]++;
			}
			if(two[i%8]==answers[i]) {
				person[1]++;
			}
			if(thr[i%10]==answers[i]) {
				person[2]++;
			}
		}
		int max = 0;
		for(int i=0; i<3; i++) {
			if(max<person[i]) {
				max = person[i];
			}
		}
		int size = 0;
		for(int i=0; i<3; i++) {
			if(max == person[i]) {
				size++;
			}
		}
		int[] answer = new int[size];
		size = 0;
		for(int i=0; i<3; i++) {
			if(max == person[i]) {
				answer[size] = i+1;
				size++;
			}
		}
		
		

	}

}
