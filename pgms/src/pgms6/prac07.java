package pgms6;

public class prac07 {

	public static void main(String[] args) {
		//문제
		String s = "aukks";
		String skip = "wbqd";
		int index = 5;
		//사전준비
		String answer = "";
		String[] alpha = new String[26-skip.length()];
		String alphabet ="";
		int num = 0;
		for(int i=97; i<123; i++) {
			if(!skip.contains(Character.toString((char)i))) {
				alpha[num] = Character.toString((char)i);
				alphabet += Character.toString((char)i);
				num++;
			}
		}
		//추출
		int tmp;
		for(int i=0; i<s.length(); i++) {
			tmp = alphabet.indexOf(s.charAt(i))+index;
			while(tmp>=alphabet.length()) {
				tmp-=alphabet.length();
			}
			answer += alpha[tmp];
		}
		System.out.println(answer);
	}

}
