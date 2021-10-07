package stringex;

public class ToStringEx {
	String name;
	String className;
	
	public ToStringEx(String name, String className) {
		this.name=name;
		this.className=className;
	}
	
	
	
	/*
	 * @Override public String toString() { return name +" "+className; }
	 */



	public static void main(String[] args) {
		ToStringEx exOfToString = new ToStringEx("Nagarjuna", "10th");
		ToStringEx exOfToString1 = new ToStringEx("venu", "10th");
		System.out.println(exOfToString);
		System.out.println(exOfToString1);
	}
	
	
	
}
