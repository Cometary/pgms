package pgms6;

public class prac09 {

	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		String before = "";
		String after = "";
		
		for(int i=1; i<food.length; i++) {
			for(int j=0; j<food[i]/2; j++) {
				before += ""+i;
			}
		}
		StringBuffer sb = new StringBuffer(before);
		after = sb.reverse().toString();
		
		String answer = "";
		answer = before+"0"+after;
		System.out.println(answer);
		
		
		
		
	}

}
