package pgms1;

public class prac20 {

	public static void main(String[] args) {
		int numer1 = 9;
		int denom1 = 2;
		int numer2 = 1;
		int denom2 = 3;
		
		int numer3 = (numer1 * denom2) + (numer2 * denom1); 
		int denom3 = denom1 * denom2;  
		
		int ans=0;;
		for(int i=1;i<=numer3; i++) {
			if(numer3%i==0 && denom3%i==0 ) {
				ans = i;
			}
		}
		if(ans!=0) {
			numer3 /=ans;
			denom3 /=ans;
		}
		System.out.println(numer3+"/"+denom3);
		
	}

}
