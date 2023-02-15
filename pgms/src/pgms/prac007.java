package pgms;

public class prac007 {

	public static void main(String[] args) {
		String my = "nice to meet you";
		
//		my = my.replace("a", "");
//		my = my.replace("e", "");
//		my = my.replace("i", "");
//		my = my.replace("o", "");
//		my = my.replace("u", "");

		my = my.replaceAll("[aeiou]", "");
		
		System.out.println(my);
		
	}

}
