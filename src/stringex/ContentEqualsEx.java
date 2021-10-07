package stringex;

public class ContentEqualsEx {
	public static void main(String[] args) {
		String string1 = "String One";
		String string2 = "String Two";
		String string3 = "String Three";
		System.out.println(string1.contentEquals("String One"));
		System.out.println(string2.contentEquals(string3));
		
		StringBuffer buffer = new StringBuffer(string3);
		StringBuffer buffer2 = new StringBuffer(string2);
		System.out.println(string1.contentEquals(buffer));
		System.out.println(string2.contentEquals(buffer2));
	}
}
