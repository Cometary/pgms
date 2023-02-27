package pgms2;

public class prac09 {

	public static void main(String[] args) {
		String s = "10 Z 20 Z 1 99";
		
		String[] ss = s.split(" ");
		int answer = 0;
		for(int i=0; i<ss.length; i++) {
			try {
				answer += Integer.parseInt(ss[i]);
			} catch (Exception e) {
				answer -= Integer.parseInt(ss[i-1]);
				continue;
			}
		}
		System.out.println(answer);
		
		
		
		
		
	}

}
