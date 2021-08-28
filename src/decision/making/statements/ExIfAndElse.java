package decision.making.statements;

public class ExIfAndElse {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a > b);
		System.out.println(!(a > b));
		if (!(a < b)) { // if you get ture then ! will reverse true to false
			System.out.println("If block executed");
		} else {
			System.out.println("else block executed");
		}

	}

}
