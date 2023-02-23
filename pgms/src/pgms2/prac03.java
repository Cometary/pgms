package pgms2;

public class prac03 {

	public static void main(String[] args) {
		String my = "aAb1B2cC34oOp";
		int answer=0;
//		my = my.replaceAll("[^0-9]", "");
		System.out.println(my);
		String[] az = my.split("[a-zA-Z]");
		for(int i=0; i<az.length; i++) {
//			System.out.println(" "+az[i]+" ");
			if(!az[i].isEmpty()) {
				answer += Integer.parseInt(az[i]);
			}
			
		}
		System.out.println(answer);
		
		

	}

}
