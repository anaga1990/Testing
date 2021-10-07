package stringex;

public class GetBytesEx {
	public static void main(String[] args) {
		String string = "nagarjuna";
		byte[] b = string.getBytes();
		for (byte c : b) {
			System.out.println(c);
		}
		
		String string2 = new String(b);
		System.out.println(string2);
	}
}
