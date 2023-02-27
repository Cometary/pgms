package pgms2;

public class prac11 {

	public static void main(String[] args) {
		String my_string = "3 + 4 - 2 + 10";
		String[] my = my_string.split(" ");
		int answer = Integer.parseInt(my[0]);
		
		for(int i=1; i<my.length; i+=2) {
			if(my[i].equals("+")) {
				answer += Integer.parseInt(my[i+1]);
			}else {
				answer -= Integer.parseInt(my[i+1]);
			}
		}
		
		System.out.println(answer);

	}

}
