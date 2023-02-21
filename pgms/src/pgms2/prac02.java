package pgms2;

import java.util.Arrays;

public class prac02 {

	public static void main(String[] args) {
		String s = "bbbbsd";
		String[] ss = new String[s.length()];	//문자열을 하나씩 짤라서 오름차순으로 정렬시킬 배열
		
		for(int i=0; i<s.length(); i++) {	//문자열을 배열에 짤라 담음
			ss[i] = Character.toString(s.charAt(i));
		}
		Arrays.sort(ss);	//배열 오름차순 정렬
		
		String answer = "";	//정답을 담을 변수
		if(s.length()==1) {	//s가 1개일 경우의 수 
			answer = s;
		}else {	
		if(!ss[0].equals(ss[1])) {	//맨 처음 문자가 2번째 문자와 다를 경우 정답에 추가
			answer += ss[0];				
		}			
		for(int i=1; i<ss.length-1; i++) {	//배열의 앞자리와 뒷자리가 다르면 정답에 추가
			if(!ss[i].equals(ss[i+1]) && !ss[i].equals(ss[i-1])) {
				answer += ss[i];
			}
		}
		if(!ss[ss.length-2].equals(ss[ss.length-1])) {	//맨 뒷 문자가 그 앞 문자와 다를 경우 정답에 추가
			answer += ss[ss.length-1];				
		}
		}
		System.out.println(answer);
		
	}

}
