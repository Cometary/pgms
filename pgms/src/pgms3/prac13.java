package pgms3;

public class prac13 {

	public static void main(String[] args) {
		String polynomial = "99 + x";
		String[] poly = polynomial.split(" ");
		int a=0;
		int b=0;
		String answer ="";
		for(int i=0; i<poly.length; i+=2) {
			if(poly[i].contains("x")) {
				if(poly[i].charAt(0)=='x') {
					a+= 1;
				}else {
					a += Integer.parseInt(poly[i].replace("x", ""));
				}
			}else {
				b += Integer.parseInt(poly[i]);
			}
		}
		if(a!=0) {
			if(a==1) {
				answer += "x";
			}else {
				answer += a+"x";
			}
			if(b!=0){
				answer+=" + ";
			}
		}
		if(b!=0) {
			answer+= b;
		}
		System.out.println(answer);
		
		

	}

}
