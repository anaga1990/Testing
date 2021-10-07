package stringex;


public class ReplaceMethodsAll {
	public static void main(String[] args) {
		String string = "Nagarjuna";
		System.out.println(string.repeat(10));
		
		
		String string2 ="I am not nani";
		string2=string2.replace('n', 'A');
		System.out.println(string2);
		
		String string3 = "i am good kid, i am good Reader";
		string3 = string3.replace("good", "bad");
		System.out.println(string3);
		
		String string4 = "i am good kid, i am good Reader";
		string4=string4.replaceAll("am", "so");
		System.out.println(string4);
		
		String string5 = new String("I AM good");
		string5=string5.replaceFirst(" ", "");
		System.out.println(string5);
	}
}
