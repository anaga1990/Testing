package stringex;

public class CharsMethod {
	public static void main(String[] args) {
		// The stream contains the integer code point values of the characters in the
		// string object
		String string = "Hello World";
		string.chars().forEach(System.out::println);
		System.out.println("_______________________________________________________________");
		String string2 = "testing java application in web";
		string2.chars().parallel().forEach(c -> System.out.print(Character.valueOf((char) c)));
		System.out.println("\n______________________________________________________________");
		string2.chars().forEach(c -> System.out.print(Character.valueOf((char) c)));
	}
}
