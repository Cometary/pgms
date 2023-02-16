package pgms1;

public class prac03 {

	public static void main(String[] args) {
		int[] bnum = {4, 455, 6, 4, -1, 45, 6};
		String dir = "right";
		
		int[] anum = new int[bnum.length];
		
		if(dir.equals("left")) {
			for(int i=0; i<bnum.length-1; i++) {
				anum[i] = bnum[i+1];
			}
			anum[bnum.length-1] = bnum[0];
		}else {
			for(int i=0; i<bnum.length-1; i++) {
				anum[i+1] = bnum[i];
			}
			anum[0] = bnum[bnum.length-1];			
		}
		
		for(int i=0; i<anum.length;i++) {
			System.out.print(anum[i]+" ");
		}
		
		
		
		
		
		
		
		
	}

}
