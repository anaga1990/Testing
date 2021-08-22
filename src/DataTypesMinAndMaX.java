

public class DataTypesMinAndMaX {
	public static void main(String[] args) {
		
		// System.out.println will try to print the values holding by object/data types/etc..
		
		//by using relative wrapper class you are getting the range
		System.out.println("Byte : "+Byte.MIN_VALUE);  //just single room // min = -128
		System.out.println("Byte : "+Byte.MAX_VALUE);  //max = 127
		byte b = -128;
		byte b1 = 127;
		 
		System.out.println("Short : "+Short.MIN_VALUE); //1 BHK - min = -32768
		System.out.println("Short : "+Short.MAX_VALUE); //1 BHK -max = 32767
		short s = -32768;
		short s1 = (short)32769; // type casting
		
		System.out.println("Integer : "+Integer.MIN_VALUE); //2 BHK - min =-2147483648  4 bits 
		System.out.println("Integer : "+Integer.MAX_VALUE); //2 BHK - max = 2147483647
		
		System.out.println("Long : "+ Long.MIN_VALUE); //3 BHK -min=-9223372036854775808  /8 bits
		System.out.println("Long : "+ Long.MAX_VALUE); //3 BHK -max=9223372036854775807
		long l = 9223372036854775807L; ///The literal 9223372036854775808 of type int is out of  range
		
		System.out.println("Float : "+ Float.MIN_VALUE); // Villa's (5000 Sq/ft) (2^28-1)4 bits
		System.out.println("Float : "+ Float.MAX_VALUE); // Villa's (5000 Sq/ft)
		float f = 99999999999F;
		
		System.out.println("Double : "+Double.MIN_VALUE); // Villa's (50000 Sq/ft) (2^1024) 10.00 (8 bit)
		System.out.println("Double : "+Double.MAX_VALUE); // Villa's (50000 Sq/ft) (308)
		double d= 99999999999999999999999D;
		
		//long & float & double = default pointing to int/Integer Range, use type at the end
		
		
		
	}
}
