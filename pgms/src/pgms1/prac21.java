package pgms1;

public class prac21 {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 3, 3, 4, 4, 4};
		
		int answer = array[0];
        int max = 0; int frequent[] = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            frequent[array[i]]++;
            
            if(max < frequent[array[i]]) {
                max = frequent[array[i]];
                answer = array[i];
            }
        }
        
        int temp = 0; // 여러 개인 지
        for(int j = 0; j < 1000; j++) {
            if(max == frequent[j]) temp++;
            if(temp > 1) answer = -1;
        }
        
        
//		int[] freq = new int[99];
//		int max = 0;
//		int answer = 0;
//		
//		for(int i=0; i<array.length; i++) {
//			freq[array[i]]++;
//			if(max<freq[array[i]]) {
//				max = freq[array[i]];
//				answer = array[i];
//			}
//		}
//		int tmp = 0;
//		for(int i=0; i<freq.length; i++) {
//			if(max==freq[i]) {
//				tmp ++;
//			}
//			if(tmp>1) {
//				answer = -1;
//			}
//		}
//		System.out.println(answer);
		
		
		
		
		

	}

}
