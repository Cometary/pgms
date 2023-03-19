package pgms6;

public class prac02 {

	public static void main(String[] args) {
		int[][] size = {{60,50},{30,70},{60,30},{80,40}};
		int tmp;
		int x, y;
		
		if (size[0][0] > size[0][1]) {
			x = size[0][0];
			y = size[0][1];
		}else {
			y = size[0][0];
			x = size[0][1];			
		}
		for(int i=0; i<size.length; i++) {
			if(size[i][0]<size[i][1]) {
				tmp = size[i][0];
				size[i][0] = size[i][1];
				size[i][1] = tmp;
			}
			if(x<size[i][0]) {
				x = size[i][0];
			}
			if(y<size[i][1]) {
				y = size[i][1];
			}
		}
		int answer = x*y;
		System.out.println(answer);
		System.out.println(answer);
		
		

	}

}
