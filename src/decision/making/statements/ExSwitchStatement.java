package decision.making.statements;

public class ExSwitchStatement {
	public static void main(String[] args) {
		switch (2) {
		case 1: {
			System.out.println("I am from case one");
			break;
		}
		case 2: {
			System.out.println("I am from case two");
			break;
		}
		case 3: {
			System.out.println("I am from case 3");
			break;
		}
		case 4: {
			System.out.println("I am from case 4");
			break;
		}
		case 5: {
			System.out.println("I am from case 5");
			break;
		}
		default:
			System.out.println("I am from default ");
		}
	}
}
