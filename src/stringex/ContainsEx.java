package stringex;

public class ContainsEx {
	public static void main(String[] args) {
		String string = "world is so large";
		String string2= " worldline is a software company";
		String string3= "  worldline is a software company and worldline banking application used world wide";
		boolean value = string.contains("world");
		System.out.println(value);
		System.out.println(string3.contains(string2));
		System.out.println(string2.contains(string3));
	}
}
