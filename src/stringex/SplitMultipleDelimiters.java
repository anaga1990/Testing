package stringex;


public class SplitMultipleDelimiters {
	public static void main(String[] args) {
		
		String string = "I am-not stying-in India@and i am not;good";
		String[] s = string.split("[- @;]");
		for (String splits : s) {
			string=splits;
			System.out.println(string);
		}
	}
}
