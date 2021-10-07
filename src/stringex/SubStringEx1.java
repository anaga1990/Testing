package stringex;

public class SubStringEx1 {
	public static void main(String[] args) {
		String string = "java to point website good for beginers";
		int i=string.offsetByCodePoints(3,20);
		System.out.println(i);
		String str1 = "welcome to java-w3schools blog";
		String str2 = "to";
		boolean isChecked = str1.regionMatches(8, str2, 0, 2);
		System.out.println(isChecked);
		String str3 = "welcome to java-w3schools blog";
		String str4 = "TO";
		boolean ischeck = str3.regionMatches(true,8, str4, 0, 2);
		System.out.println(ischeck);
		System.out.println(str1.subSequence(4, 6));
		
		System.out.println(str1.substring(7));
		System.out.println(str1.substring(4, 6));
	}
}
