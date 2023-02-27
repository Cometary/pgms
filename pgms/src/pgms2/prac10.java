package pgms2;

public class prac10 {

	public static void main(String[] args) {
		String my_str = "abcdef123";
		int n = 3;
		char[] my_c = my_str.toCharArray();
		String ans = "";
		String[] answer = new String[(my_str.length()-1)/n+1];
		
		for(int i =0; i<=(my_str.length()-1)/n; i++) {
			ans = "";
			for(int j=0; j<n; j++) {
				try {
					ans += my_c[n*i+j];			
				} catch (Exception e) {
					continue;
				}
			}
			answer[i] = ans;
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}

}
