package pgms3;

public class prac05 {

	public static void main(String[] args) {
		int[] common = {2, 4, 8};
		int answer;
		
		int a = common[1] - common[0];
		if(common[2]==common[1]+a) {
			answer = common[common.length-1]+a;
		}else {
			a= common[1]/common[0];
			answer = common[common.length-1]*a;
		}
		

	}

}
