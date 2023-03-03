package pgms2;

public class prac17 {

	public static void main(String[] args) {
		// ["meosseugi", "1234"]	[["rardss", "123"], ["yyoom", "1234"], ["meosseugi", "1234"]]
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = new String[][] {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		String answer = "fail";
		
		for(int i=0; i<db.length; i++) {
			if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
				answer = "login";
			}else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])){
				answer = "wrong pw";
			}
		}
		System.out.println(answer);
		
	}

}
