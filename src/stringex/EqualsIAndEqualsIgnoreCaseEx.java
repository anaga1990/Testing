package stringex;

public class EqualsIAndEqualsIgnoreCaseEx {
	public static void main(String[] args) {
		String string = new String("Nagarjuna");
		String string2 = "Nagarjuna";
		String string3 = "NAGARJUNA";
		
		System.out.println(string.equals(string2));
		System.out.println(string.equals(string3)+" from equals");
		System.out.println(string.equalsIgnoreCase(string3)+ " from equalsIgnoreCase");
	}
}	
