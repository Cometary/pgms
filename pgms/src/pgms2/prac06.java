package pgms2;

public class prac06 {

	public static void main(String[] args) {
		int[] array = {777, 77, 17};
		int answer = 0;
		
		for(int i=0; i<array.length; i++) {
			String tmp = Integer.toString(array[i]);
			for(int k=0; k<tmp.length(); k++) {
				if(tmp.charAt(k)=='7') {
					answer++;
				}
			}
			
		}
		System.out.println(answer);
		
		

	}

}
