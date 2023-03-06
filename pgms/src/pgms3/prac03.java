package pgms3;

public class prac03 {

	public static void main(String[] args) {
		int[] numlist = {10000,20,36,47,40,6,10,7000};
		int n = 30;
		int[] cha = new int[numlist.length];
		int[] answer = new int[numlist.length];
		
		for(int i=0; i<numlist.length; i++) {
			for(int j=0; j<numlist.length; j++) {
				if(Math.abs(numlist[i]-n)>Math.abs(numlist[j]-n)) {
					cha[i]++;
				}	
				if(Math.abs(numlist[i]-n)==Math.abs(numlist[j]-n) && numlist[i]<numlist[j]) {
					cha[i]++;
				}
			}
		}
		for(int i=0; i<numlist.length; i++) {
			answer[cha[i]] = numlist[i];
		}
		
		for(int i=0; i<numlist.length; i++) {
			System.out.print(answer[i]+" ");
		}
		
		

	}

}
