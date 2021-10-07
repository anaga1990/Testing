package stringex;

public class CompareToIgnoreCaseEx {
	public static void main(String[] args) {
		String string = "naga";
		String string1 = "Naga";
		String string2 = new  String("NAGA");
		int s = string.compareToIgnoreCase(string1);
		System.out.println(s);
		System.out.println(string.compareToIgnoreCase(string2));
	}
}
