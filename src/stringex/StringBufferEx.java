package stringex;

import java.util.stream.IntStream;

public class StringBufferEx {
	public static void main(String[] args) {
		String string = "Java";
		StringBuffer buffer = new StringBuffer(string);
		System.out.println(buffer);
		
		StringBuffer buffer2 = new StringBuffer("testing");
		System.out.println(buffer2);
		System.out.println(buffer2.capacity());
		
		buffer.append(false);
		System.out.println(buffer);
		
		StringBuffer buffer3 = new StringBuffer("Jhello");
		
		buffer3.insert(1, "ava ");
		System.out.println(buffer3);
		
		System.out.println(buffer3.appendCodePoint(67)); // this method input is ASCII key value will take as input
		
		System.out.println(buffer.charAt(4));
		
		StringBuffer buffer4 = new StringBuffer(string);
		System.out.println(buffer4.chars());
		IntStream input = buffer4.chars();
		input.forEachOrdered(aa -> System.out.println(aa));
		
		StringBuffer buffer5 = new StringBuffer("NAGARJUNA");
		
		System.out.println(buffer5.delete(0, 4));
		System.out.println(buffer5);
		System.out.println(buffer5.deleteCharAt(3));
		
		System.out.println(buffer5.replace(0, 2, "nagarjuna"));
		System.out.println(buffer5.reverse().delete(0, 2));
		
		System.out.println(buffer5.reverse());
		buffer5.setCharAt(0, 'N');
		System.out.println(buffer5);
		StringBuffer buffer6 = new StringBuffer("test naga");
		System.out.println("before trimToSize capacity : "+buffer6.capacity());
		System.out.println("before trimToSize length: "+buffer6.length());
		buffer6.trimToSize();
		System.out.println("After trimToSize capacity : "+buffer6.capacity());
		System.out.println("After trimToSize length : "+buffer6.length());
		
		
	}
}
