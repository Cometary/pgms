package pgms1;

import java.util.HashMap;

public class prac13 {

	public static void main(String[] args) {
		String[] mor = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String[] se = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String letter = ".--. -.-- - .... --- -.";
		String answer = "";
		String[] let = letter.split(" ");
		HashMap<String, String> hash = new HashMap<>(21);
		
		for(int i=0; i<mor.length; i++) {
			hash.put(mor[i], se[i]);
		}
		
		for(int i=0; i<let.length;i++) {
			answer += hash.get(let[i]);
		}
		
		System.out.println(answer);
		
		
	}

}
