package pgms4;

public class prac01 {

	public static void main(String[] args) {
		int n = 12345;
		
		int leng =0;
        long m=n;
        while(m!=0){
            leng++;
            m/=10;
        }
        int[] answer = new int[leng];
        int index = 0;
        for(int i=0; i<leng; i++){
            answer[index] = (int)(n%10);
            System.out.println(answer[index]);
            index++;
            n/=10;
            
        }
        
	}

}
