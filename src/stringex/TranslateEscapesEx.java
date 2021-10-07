package stringex;

public class TranslateEscapesEx {
	public static void main(String[] args) {
		String input = "Hey, \\n This is not normally a line break.";
		
		String output = input.translateEscapes();
		System.out.println(output);
	}
}
