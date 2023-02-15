package pgms;

public class prac010 {

	public static void main(String[] args) {
		String st = "abCdEfghIJ";
		
		char[] ist = st.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<st.length(); i++) {
			int n = (int)ist[i];
			if(n<95) {
				sb.append((char)(n+32));
			}else {
				sb.append((char)(n-32));
			}
		}
		
		String answer = sb.toString();
		System.out.println(answer);
		
		
		
	}

}
