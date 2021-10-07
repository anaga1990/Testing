package stringex;

public class StripAllMethods {
	public static void main(String[] args) {
		String string = "   java to point website good for    beginers   ";
		System.out.println(string.strip());
		String string1 = "   java to beginers   ";
		System.out.println(string1.stripLeading());
		System.out.println(string1.stripTrailing());
		String s = "   Line 1\n" +
		           "       Line 2\n" +
		           "   Line 3";
		System.out.println(s.stripIndent());
		
		String tags = """
	               <html>
	                   <body>
	                       <p>Hello, world</p>
	                   </body>
	               </html>
	               """;
		System.out.println(tags.stripIndent());
	}
}
