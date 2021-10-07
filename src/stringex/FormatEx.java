package stringex;

public class FormatEx {
	public static void main(String[] args) {
		String ss = "Naga";
		String string= String.format("value of %s", ss);
		System.out.println(string);
		string= String.format("value of %S", ss);
		System.out.println(string);
		String string2 = String.format("value of %d", 1234);
		System.out.println(string2);
		String string3 = String.format("value of %f", 10.00);
		System.out.println(string3);
		String string4 = String.format("value of %e", 10.00);
		System.out.println(string4);
		String string5 = String.format("value of %g", 10.00);
		System.out.println(string5);
		String string6 = String.format("none %n", 10+"none %n");
		System.out.println(string6);
		String string7 = String.format(" %a", 20.00); //
		System.out.println(string7);
		String string8 = String.format("%x", 1000);  // hex value of Only integer 
		System.out.println(string8);
		String string9 = String.format("%o", 1000);  // octal value of Only integer 
		System.out.println(string9);
		String string10 = String.format("%b", true);
		System.out.println(string10);
		string10 = String.format("%B", true);
		System.out.println(string10);
		string10 = String.format("%B", null);
		System.out.println(string10);
	}
}
