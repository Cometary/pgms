package pgms2;

public class prac08 {

	public static void main(String[] args) {
		String numbers = "onetwothreefourfivesixseveneightnine";
		numbers = numbers.replaceAll("one", "1");
		numbers = numbers.replaceAll("two", "2");
		numbers = numbers.replaceAll("three", "3");
		numbers = numbers.replaceAll("four", "4");
		numbers = numbers.replaceAll("five", "5");
		numbers = numbers.replaceAll("six", "6");
		numbers = numbers.replaceAll("seven", "7");
		numbers = numbers.replaceAll("eight", "8");
		numbers = numbers.replaceAll("nine", "9");
		numbers = numbers.replaceAll("zero", "0");
		
		long answer = Long.parseLong(numbers);
		System.out.println(answer);
		
		
	}

}
