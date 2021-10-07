package stringex;

public class MatchesEx {
	public static void main(String[] args) {
		String str1 = "Welcome to java-schools";
		boolean isMatch = str1.matches("(.*)java(.*)");
		System.out.println("Does input str1 has 'java' word : "+isMatch);
		
		isMatch = str1.matches("[a-zA-Z- ]*");
		System.out.println(isMatch);
	}
}
