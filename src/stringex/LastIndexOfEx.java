package stringex;

public class LastIndexOfEx {
	public static void main(String[] args) {
		String string = "providing nana training on na java now";
		int last = string.lastIndexOf('o');
		System.out.println(last);
		System.out.println(string.lastIndexOf("in"));
		System.out.println(string.lastIndexOf('a', 30));
		System.out.println(string.lastIndexOf("on", 27));
	}
}
