package stringex;


public class SplitEx2 {
	public static void main(String[] args) {
		String string = "Nagarjuna teaching java concepts from August";
		String[] string1 = string.split(" ");
		for (String string2 : string1) {
			System.out.println(string2);
		}
		System.out.println("++++++++++++++++++++++++");
		String[] string2 = string.split("\\s"); // \\s means white space
		for (String string3 : string2) {
			System.out.println(string3);
		}
		
		String string3 = "I am-not stying-in India";
		String[] s = string3.split("-");
		for (String splits : s) {
			System.out.println(splits);
		}
	}
}
