package stringex;

public class SplitEx {
	public static void main(String[] args) {
		String string = "welcome to java world";
		for(String ss : string.split(" ", 2)) { // based on count of 2nd parameter it split the String
			System.out.println(ss);
		}
		
	}
}
