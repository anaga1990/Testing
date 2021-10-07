package stringex;

public class SubStringEx2 {
	public static void main(String[] args) {
		String string = "Nagarjuna 1234567890 test";
		System.out.println(string.substring(10));
		System.out.println(string.substring(10,20));
		
		
		String names[]= {"Nagarjuna Annabathina","praveenm Kumar","Naresh kamani", "Swathi Annabathina", "lakshmi Annabathina", "venki madala"};
		String lasteName="Annabathina";
		int sublength= lasteName.length();
		System.out.println("substring length : "+sublength);
		for (int i = 0; i < names.length; i++) {
			int length = names[i].length();
			String listOfnames=names[i].substring(length-lasteName.length());
			if (listOfnames.equals(lasteName)) {
				System.out.println(names[i]);
			}
		}
	}
}
