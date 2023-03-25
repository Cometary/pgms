package pgms6;

public class prac10 {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int day =0;
		
		for(int i=1; i<a; i++) {
			if(i==2) {
				day+=29;
			}else if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
				day+=31;
			}else {
				day+=30;
			}
		}
		day+=b;
		
		String answer = week[(day-1)%7];
		
	}

}
