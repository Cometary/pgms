package pgms3;

public class prac04 {

	public static void main(String[] args) {
		String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		String[][] math = new String[quiz.length][5];
		String[] answer = new String[quiz.length];
		
		for(int i=0; i<quiz.length; i++) {
			math[i] = quiz[i].split(" ");
			switch(math[i][1]) {
			case "+" :
				if(Integer.parseInt(math[i][0]) + Integer.parseInt(math[i][2]) == Integer.parseInt(math[i][4])) {
					answer[i] = "O";
				}else {
					answer[i] = "X";
				}
				break;
			case "-" :
				if(Integer.parseInt(math[i][0]) - Integer.parseInt(math[i][2]) == Integer.parseInt(math[i][4])) {
					answer[i] = "O";
				}else {
					answer[i] = "X";
				}
				break;
				
			}
			System.out.println("answer["+i+"] : "+answer[i]);
		}
		
//		for(int i=0; i<quiz.length; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.println("math["+i+"]["+j+"] : "+math[i][j]);
//			}
//		}
		
		
		
		
		
	}

}
