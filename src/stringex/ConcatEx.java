package stringex;

public class ConcatEx {
	public static void main(String[] args) {
		String string = "naga";
		System.out.println(string);
		String string2= " java";
		string.concat(string2);
		System.out.println(string);
		string=string.concat(string2);
		System.out.println(string);
		
		String string3 = "jhon";
		string3.concat(" wick");
		System.out.println(string3);
		string3=string3.concat(" wick").concat(" ").concat(string3);
		System.out.println(string3);
	}
}
