package decision.making.statements;

public class ExIfAndElseIf {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a > b);
		System.out.println(!(a > b));
		if (a > b) { // if you get ture then ! will reverse true to false
			System.out.println("If block executed");
		}else if(a==b) {
			System.out.println("I am from else if block");
		}else if(a<b) {
			System.out.println(" a vlaues less than B");
		}else {
			System.out.println("we are form default block called else");
		}

	}

}
