package stringex;

public class IsBlankAndIsEmptyEx {
	public static void main(String[] args) {
		String string = "     ";
		String string2 = "naga";
		System.out.println(string.isBlank()+ " is blank");
		System.out.println(string2.isBlank()+ " is blank");
		System.out.println(string.isEmpty()+ "  isEmpty");
		System.out.println(string2.isEmpty()+ "  isEmpty");
		
	}
}
