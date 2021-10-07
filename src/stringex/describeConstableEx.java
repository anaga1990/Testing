package stringex;

import java.util.Optional;

public class describeConstableEx {
	public static void main(String[] args) {
		String string1 = "String One";
		Optional<String> opt = string1.describeConstable();
		System.out.println(opt);
		System.out.println(opt.get());
		System.out.println(opt.isPresent());
	}
}
