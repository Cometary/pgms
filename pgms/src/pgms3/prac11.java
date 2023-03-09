package pgms3;

import java.math.BigInteger;

public class prac11 {

	public static void main(String[] args) {
		int balls = 5;
		int share = 3;
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("1");
		BigInteger ans = new BigInteger("1");
		int answer = 0;
		
		for(int i=1; i<=balls;i++) {
			a = a.multiply(BigInteger.valueOf(i));
		}
		for(int i=1; i<=balls-share;i++) {
			b = b.multiply(BigInteger.valueOf(i));
		}
		for(int i=1; i<=share; i++) {
			c = c.multiply(BigInteger.valueOf(i));
		}
		ans = a.divide(b.multiply(c));
		answer = ans.intValue();
		
		System.out.println(answer);
		

	}

}
