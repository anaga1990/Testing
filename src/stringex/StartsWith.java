package stringex;

public class StartsWith {
	public static void main(String[] args) {
		String string = "naga najhnh sjioji ojsoijhs";
		System.out.println(string.startsWith("na")); 
		System.out.println(string.startsWith("nagarjuna"));
		
		System.out.println(string.startsWith("na", 5));
		System.out.println(string.startsWith("na", 12));
	}

}
