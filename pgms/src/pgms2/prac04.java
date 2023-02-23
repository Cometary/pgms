package pgms2;

public class prac04 {

	public static void main(String[] args) {
		String bin1 = "10";
		String bin2 = "11";
		String answer = "";
		String what = "11000";
		int tmp;
		int bint1=0; int bint2=0;
		
		for(int i=bin1.length()-1; i>=0; i--) {
			tmp = 1;
			for(int k=0; k<i;k++) {
				tmp *=2;
			}
			bint1 += (int)(bin1.charAt(i)-48)*tmp;
		}
		for(int i=bin2.length()-1; i>=0; i--) {
			tmp = 1;
			for(int k=0; k<i;k++) {
				tmp *=2;
			}
			bint2 += (int)(bin2.charAt(i)-48)*tmp;
		}
		System.out.println(bint1+" "+bint2);
		tmp = bint1+bint2;
		while(true) {
			if(tmp==0) {
				break;
				}
			answer += tmp%2;
				tmp/=2;
			}
		StringBuffer sb = new StringBuffer(answer);
		answer = sb.reverse().toString();
		System.out.println(answer);
		}

	}


