package pgms8;

public class Ex181882 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=50 && arr[i]%2==0) {
				arr[i] /= 2;
			}else if(arr[i]<50 && arr[i]%2==1) {
				arr[i] *= 2;
			}
			System.out.println(arr[i]);
		}
		
	}

}
