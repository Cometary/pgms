package pgms5;

public class prac14 {

	public static void main(String[] args) {
		String s = "tRy hello  WORLD ";
		String[] arr = s.split(" ");
		String answer ="";
		for(int j=0; j<arr.length; j++) {
			if(!arr[j].isEmpty()) {
			for(int i=0; i<arr[j].length(); i++) {
				if(i%2!=0) {
					answer += Character.toString(arr[j].charAt(i)).toLowerCase(); 
				}else {
					answer += Character.toString(arr[j].charAt(i)).toUpperCase(); 
				}
			}
			if(j<arr.length-2) {
				answer += " ";
			}
			}
			
		}
		System.out.println(answer);
		
		
		
	}

}
