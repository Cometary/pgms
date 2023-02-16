package pgms1;

public class prac04 {

	public static void main(String[] args) {
		int[] nums = {9, 10, 11, 80};
		int[] answer = new int[2];
		int max = nums[0];
		int n = 0;
		for(int i=1; i<nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
				n = i+1;
			}
		}
		answer[0] = max;
		answer[1] = n;
		
		System.out.println(max+""+n);
		
	}

}
