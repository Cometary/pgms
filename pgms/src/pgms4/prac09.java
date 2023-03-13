package pgms4;

public class prac09 {

	public static void main(String[] args) {
		int a =3;
		int b =3;
		int answer =0;
		if(a>b) {
			int c = a;
			a = b;
			b = c;
		}
		for(int i=a; i<=b; i++) {
			answer +=i;
		}
		System.out.println(answer);

	}

}
