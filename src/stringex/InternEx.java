package stringex;

public class InternEx {
	public static void main(String[] args) {
		String string = new String("naga").intern();
		String string2 = new String("naga").intern();
		System.out.println(string==string2);
	}
}
