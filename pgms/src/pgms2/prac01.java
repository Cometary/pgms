package pgms2;

public class prac01 {

	public static void main(String[] args) {
		int[] emergency = {30, 10, 23, 6, 100};
		int[] grade = new int[emergency.length];
		
		for(int i=0; i<emergency.length; i++) {
			for(int k=0; k<emergency.length; k++) {
				if(emergency[i]<emergency[k]) {
					grade[i] ++;
				}else if(i==k) {
					grade[i] ++;
				}
			}
		}
		for(int i=0; i<grade.length;i++) {
			System.out.println(grade[i]);
		}
	

	}

}
