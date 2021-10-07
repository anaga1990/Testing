package stringex;

public class EndsWithEx {
	public static void main(String[] args) {
		String string1 = "String One";
		String string2 = "String Two String One";
		String string3 = "String Three";
		System.out.println(string1.endsWith("e"));
		System.out.println(string3.endsWith("ree"));
		System.out.println(string2.endsWith(string1));
		System.out.println(string2.endsWith(string3));
	}
}
