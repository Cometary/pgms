package pgms5;

public class prac16 {

	public static void main(String[] args) {
		String s = "a z A Z";
		int n = 4;
		String answer = "";
		for (int k = 0; k < n; k++) {
			answer = "";
			for (int i = 0; i < s.length(); i++) {
				if (((s.charAt(i) + 0) > 96 && (s.charAt(i) + 0) < 122)
						|| ((s.charAt(i) + 0) > 64 && (s.charAt(i) + 0) < 90)) {
					answer += (char) (s.charAt(i) + 1);
				} else if ((s.charAt(i) + 0) == 122 || (s.charAt(i) + 0) == 90) {
					answer += (char) (s.charAt(i) - 25);
				} else {
					answer += s.charAt(i);
				}
			}
			s = answer;				
		}
		System.out.println(answer);
	}

}
