package pgms7;

public class prac01 {

	public static void main(String[] args) {
		String[] cards1 = {"a", "b", "c"};
		String[] cards2 = {"d", "e"};
		String[] goal = {"b", "c", "d", "e"};
		int tmp1=-1;
		int tmp2=-1;
		String answer = "Yes";
		
		for(int i=0; i<cards1.length; i++) {
			for(int j=0; j<goal.length; j++) {
				if(cards1[i].equals(goal[j])) {
					if(tmp1>j) {
						answer = "No";
					}
					tmp1 = j;
				}
			}
			if(tmp1==-1) {
				answer = "No";				
			}
		}
		for(int i=0; i<cards2.length; i++) {
			for(int j=0; j<goal.length; j++) {
				if(cards2[i].equals(goal[j])) {
					if(tmp2>j) {
						answer = "No";
					}
					tmp2 = j;
				}
			}
			if(tmp2==-1) {
				answer = "No";				
			}
		}
		System.out.println(answer);
		
		
		

	}

}
