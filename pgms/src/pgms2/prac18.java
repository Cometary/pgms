package pgms2;

public class prac18 {

	public static void main(String[] args) {
		int chicken = 1081;
		int answer=0;
		int coupon=0;
		
		while(chicken!=0) {
			answer += chicken/10;
			coupon += chicken%10;
			chicken /= 10;
			if(coupon>=10) {
				chicken += 10;
				coupon -= 10;
			}
		}
		
		System.out.println(answer);
		
		
		

	}

}
