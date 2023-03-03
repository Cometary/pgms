package pgms2;

public class prac14 {

	public static void main(String[] args) {
		String[] keyinput = {"down", "down", "down", "down", "down"};
		int[] board = {7,9};
		int[] result = {0,0};
		
		for(String key : keyinput) {
			switch(key) {
			case "up" :
				if(result[1]==board[1]/2) {
					
				}else {
					result[1]++;
				}
				break;
			case "down" :
				if(result[1]==board[1]/2*-1) {
					
				}else {
					result[1]--;
				}
				break;
			case "right" :
				if(result[0]==board[0]/2) {
					
				}else {
					result[0]++;
				}
				break;
			case "left" :
				if(result[0]==board[0]/2*-1) {
					
				}else {
					result[0]--;
				}
				break;
			}
		}
		System.out.println(result[0]+" "+result[1]);
		

	}

}
