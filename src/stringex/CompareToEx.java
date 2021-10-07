package stringex;

public class CompareToEx {
	public static void main(String[] args) {
		String string = "naga";
		String string1 = "naga";
		String string2 = new  String("naga");
		int s = string.compareTo(string1);
		System.out.println(s);
		
		System.out.println(string.compareTo(string2));
	}
}
