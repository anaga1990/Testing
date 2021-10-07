package stringex;

import java.util.stream.Stream;

public class LinesEx {
	public static void main(String[] args) {
		String string = "java is to easy while see but if your not practice its difficult";
		Stream<String> stream = string.lines();
		stream.forEach(line -> System.out.println(line));
		
		System.out.println("with '\n' using lines() Method");
		string = "java is to easy while see \nbut if your not practice its difficult";
		stream=string.lines();
		stream.forEach(data -> System.out.println(data));
		
		System.out.println("with '\r' using lines() Method");
		string = "java is to easy while see \rbut if your not practice its difficult";
		stream=string.lines();
		stream.forEach(data -> System.out.println(data));
		
		System.out.println("with '\r\n' using lines() Method");
		string = "java is to easy while see \r\nbut if your not practice its difficult";
		stream=string.lines();
		stream.forEach(data -> System.out.println(data));
	}
}
