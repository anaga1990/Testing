package looping.statements.ex;

public class ExOfWhileLoop {
	public static void main(String[] args) {
		//while(true) {
			//execute code
		//}
		int a = 0;
		while(a<=18) {
			System.out.println("complete your higher educaction");
			System.out.println(a);
			a++;
			if(a==3) {
				break;
			}
		}
	}
}
