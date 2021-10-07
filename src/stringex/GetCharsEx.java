package stringex;

public class GetCharsEx {
	public static void main(String[] args) {
		String string = "Nagarjuna Annabathina";
		char[] c = new char[20];
		string.getChars(3, 11, c, 0);
		
		for (char d : c) {
			System.out.print(d+ " ");
		}
	}
}
