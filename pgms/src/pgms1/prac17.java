package pgms1;

public class prac17 {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		int list_num = num_list.length / n;
		int[][] answer = new int[list_num][n];
		
		for(int k=0; k<list_num; k++) {
			for(int l=0; l<n; l++) {
					answer[k][l] =  num_list[(n*k)+l];
					System.out.println("answer["+k+"]["+l+"] = "+answer[k][l]);
			}
		}
	}

}
// 아니 이런 방법이?
//int length = num_list.length;
//
//answer = new int[length/n][n];
//
//for(int i=0; i<length; i++){
//    answer[i/n][i%n]=num_list[i];
//}
