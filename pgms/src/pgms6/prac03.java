package pgms6;

public class prac03 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] srr1 = new String[n];
		String[] srr2 = new String[n];
		for(int i=0; i<n; i++) {
			srr1[i] = Integer.toBinaryString(arr1[i]);	
			srr2[i] = Integer.toBinaryString(arr2[i]);
			while(srr1[i].length()<n) {
				srr1[i] = "0"+srr1[i];
			}
			while(srr2[i].length()<n) {
				srr2[i] = "0"+srr2[i];
			}
		}
		String[] answer = new String[n];
		for(int i=0; i<n; i++) {
			answer[i] = "";
			for(int j=0; j<n; j++) {
				if(srr1[i].charAt(j)=='1' || srr2[i].charAt(j)=='1') {
					answer[i] += "#";
				}else {
					answer[i] +=" ";
				}
			}
		}
		
		
		
		
		
		
	}

}
