package pgms2;

public class prac19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =12;
		int b =21;
		int max = 0;
		int answer = 1;
		
		for(int i=1; i<=a && i<=b; i++) {
			if(a%i==0 && b%i==0) {
				max=i;
			}
		}
		
		b /= max;
		while(b%2==0) {
			b /=2;
		}
		while(b%5==0) {
			b /=5;
		}
		if(b!=1) {
			answer =2;
		}
		
	}

}
