package looping.statements.ex;

public class ExInfiniteForLoop {
	public static void main(String[] args) {
		
		for (long a = 10L; a<11; a--) {
			System.out.println(a);
			//10
			//9
			//8
			//-1,-2,-22343444
		}
		System.out.println("after the for loop");
		
	}
}
