package stringex;

public class IndexOfEx {
	public static void main(String[] args) {
		String string = "Nagarjuna Annabathina";
		System.out.println(string.indexOf('n'));
		System.out.println(string.indexOf("nna"));
		System.out.println("index of (string) ->  "+string.indexOf("na",1));
		System.out.println("index of (char) ->  "+string.indexOf("a",10));
		
	}
}
