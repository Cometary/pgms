package pgms3;

public class prac07 {

	public static void main(String[] args) {
		int[][] board = new int[][] {
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}
		};
		int answer = 0;
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				if(board[i][j]==1) {
					for(int k=i-1;k<i+2;k++) {
						for(int l=j-1;l<j+2;l++) {
							try {
								if(board[k][l]==0) {
									board[k][l]=3;
								}
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
					}
				}
			}
		}
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				System.out.print(board[i][j]+" ");
				if(board[i][j]==0) {
					answer ++;
				}
			}
			System.out.println();
		}
		System.out.println(answer);
	}

}
