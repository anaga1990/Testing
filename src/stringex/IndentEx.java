package stringex;

public class IndentEx {
	public static void main(String[] args) {
		String string = "Nagarjuna Annabathina  Watching Games";
		System.out.println(string.indent(0));
		System.out.println(string.indent(3)+" +ve");
		string = "    Nagarjuna Annabathina  Watching Games";
		System.out.println(string.indent(-7)+ " -ve");
	}
}
