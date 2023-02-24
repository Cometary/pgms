package pgms2;

public class prac04 {

	public static void main(String[] args) {
		//
		String bin1 = "0";
		String bin2 = "0";
		String answer = "";
		int tmp;
		int bint1=0; int bint2=0;
		
		char[] ch1 = bin1.toCharArray();
		tmp =1;
		for(int i = ch1.length-1;i>=0;i--) {
			bint1 += (ch1[i]-'0')*tmp;
			tmp*=2;
		}
		System.out.println("1번째 2진수 "+bin1 +"의 10진수값 "+bint1);
		char[] ch2 = bin2.toCharArray();
		tmp =1;
		for(int i = ch2.length-1;i>=0;i--) {
			bint2 += (ch2[i]-'0')*tmp;
			tmp*=2;
		}
		System.out.println("2번째 2진수 "+bin2 +"의 10진수값 "+bint2);
		tmp = bint1+bint2;
		System.out.println("두 십진수의 합 "+tmp);
		if(tmp==0) {
			answer = Integer.toString(0);
		}
		while(true) {
			if(tmp==0) {
				break;
				}
			answer += tmp%2;
				tmp/=2;
			}
		System.out.println("두 십진수의 합의 2진수의 역순 "+answer);		
		StringBuffer sb = new StringBuffer(answer);
		answer = sb.reverse().toString();
		System.out.println("뒤집은 2진수 값 "+answer);
		}

	}


