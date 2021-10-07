package stringex;

import java.util.stream.IntStream;

public class StringBuilderEx {
	public static void main(String[] args) {
		String string = "Java";
		StringBuilder builder = new StringBuilder(string);
		System.out.println(builder);
		
		StringBuilder builder2 = new StringBuilder("testing");
		System.out.println(builder2);
		System.out.println(builder2.capacity());
		
		builder.append(false);
		System.out.println(builder);
		
		StringBuilder builder3 = new StringBuilder("Jhello");
		
		builder3.insert(1, "ava ");
		System.out.println(builder3);
		
		System.out.println(builder3.appendCodePoint(67)); // this method input is ASCII key value will take as input
		
		System.out.println(builder.charAt(4));
		
		StringBuilder builder4 = new StringBuilder(string);
		System.out.println(builder4.chars());
		IntStream input = builder4.chars();
		input.forEachOrdered(aa -> System.out.println(aa));
		
		StringBuilder builder5 = new StringBuilder("NAGARJUNA");
		
		System.out.println(builder5.delete(0, 4));
		System.out.println(builder5);
		System.out.println(builder5.deleteCharAt(3));
		
		System.out.println(builder5.replace(0, 2, "nagarjuna"));
		System.out.println(builder5.reverse().delete(0, 2));
		
		System.out.println(builder5.reverse());
		builder5.setCharAt(0, 'N');
		System.out.println(builder5);
		StringBuilder builder6 = new StringBuilder("test naga");
		System.out.println("before trimToSize capacity : "+builder6.capacity());
		System.out.println("before trimToSize length: "+builder6.length());
		builder6.trimToSize();
		System.out.println("After trimToSize capacity : "+builder6.capacity());
		System.out.println("After trimToSize length : "+builder6.length());
		
		
	}
}
