package pgms2;

public class prac04_1 {

	public static void main(String[] args) {
		String bin1 = "1000";
		String bin2 = "1100";
		int a; int b;
		a = Integer.parseInt(bin1, 2);
		b = Integer.parseInt(bin2, 2);
		System.out.println("10진수 "+a);
		System.out.println("10진수 "+b);
		String answer = Integer.toBinaryString(a+b);
		System.out.println("합의 2진수 "+answer);
	}

}
