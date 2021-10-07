package stringex;

import java.util.stream.IntStream;

public class CodePointsMethods {
	public static void main(String[] args) {
		
		String string = "I am good programmer";
		
		IntStream ss = string.codePoints();
		ss.forEach(c -> System.out.print(c+" "));
		
		System.out.println("\ncodePointAt method");
		int get = string.codePointAt(1);
		System.out.println(get);
		
		for (int i = 0; i < string.length(); i++) {
			System.out.print(string.codePointAt(i)+" ");
		}
		
		//codePointBefore method
		System.out.println("codePointBefore method");
		System.out.println(string.codePointBefore(1));
		
		
		//codePointCount method
		String heartString =  "\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93";
		int count = heartString.codePointCount(0, heartString.length());
		System.out.println(count);
	
	
	}
}
