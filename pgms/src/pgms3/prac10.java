package pgms3;

public class prac10 {

	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		int[] bab = {0, 0, 0, 0};
		int answer=0;
		
		for(int i=0;i<babbling.length; i++) {
				babbling[i] = babbling[i].replaceAll("aya", " ");
				babbling[i] = babbling[i].replaceAll("ye", " ");
				babbling[i] = babbling[i].replaceAll("woo", " ");
				babbling[i] = babbling[i].replaceAll("ma", " ");
				babbling[i] = babbling[i].replaceAll(" ", "");				
				System.out.println(babbling[i]);
				if(babbling[i].equals("")) {
					answer++;
				}
		}
		System.out.println(answer);
	}

}
