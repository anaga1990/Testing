package stringex;


public class FormatEx2 {
	public static void main(String[] args) {
		String string = String.format("%10d", 10);
		System.out.println(string);
		String string1 = String.format("%-10d", 10);
		System.out.println(string1);
		String string2 = String.format("% d", 10);
		System.out.println(string2);
		long amount = 100000000l ;
		String string3 = String.format("%011d", amount);// fill with Zero if integer value
		System.out.println(string3);
		
	}
}
