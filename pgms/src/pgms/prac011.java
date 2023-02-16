package pgms;

public class prac011 {

	public static void main(String[] args) {
		String rsp = "205";
		
		rsp = rsp.replace("2", "묵");
		rsp = rsp.replace("0", "빠");
		rsp = rsp.replace("5", "찌");
		rsp = rsp.replace("묵", "0");
		rsp = rsp.replace("빠", "5");
		rsp = rsp.replace("찌", "2");
		
		System.out.println(rsp);

	}

}
