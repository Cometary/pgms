package pgms2;

import java.util.ArrayList;

public class prac05 {

	public static void main(String[] args) {
		// 420	[2, 3, 5, 7]
		int n = 17;
		int tmp = 2;
		ArrayList<Integer> ans = new ArrayList<>();
		boolean sosu = true;
		
		// 소수로 나누기
		while(true) {
			//만약 소수tmp로 나뉘어지면 tmp를 추가하고 tmp로 나누고 tmp 초기화한다.
			if(n%tmp==0) {
				if(!ans.contains(tmp)) {
					ans.add(tmp); 
				}
				n /=tmp;
				tmp=2;
				continue;
			}
			System.out.println("n : "+n);
			//만약 n이 1이면 반복 종료한다.
			if(n<=1) {
				break;
			}
			//tmp가 소수일때
			sosu=true;
			while(sosu) {
				++tmp;
				sosu = false;
				for(int i=2; i<tmp; i++) {
					if(tmp%i==0) {
						sosu=true;
					}
					
				}	
			}
			System.out.println("tmp : "+tmp);
		}
		
		int[] answer = new int[ans.size()];
		for(int i=0; i<ans.size(); i++) {
			answer[i] = ans.get(i);
			System.out.println("answer["+i+"] : "+answer[i]);
		}
		
		
	}

}
