package pgms2;

public class prac13 {

	public static void main(String[] args) {
		String[] spell = {"z", "d", "x"};
		String[] dic = {"def", "dww", "dzx", "loveaw"};
		int answer = 2;
		
		for(int i=0; i<dic.length;i++) {
			int tmp =0;
			for(int j=0; j<spell.length; j++) {
				if(dic[i].indexOf(spell[j])!=-1 && dic[i].indexOf(spell[j])==dic[i].lastIndexOf(spell[j])) {
					tmp++;
				}
			}
			if(tmp>=spell.length && tmp==dic[i].length()) {
				answer = 1;
			}
		}
		
		System.out.println(answer);
		
		

	}

}
