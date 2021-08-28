package decision.making.statements;

public class ExSwitchStatement3 {
	public static void main(String[] args) {
		
		//Monday, Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday,
		switch ("Monday") {
		case "Monday": {
		}
		case "Tuesday": {
		}
		case "Wednesday": {
		}
		case "Thursday": {
		}
		case "Friday": {
			System.out.println(" Hey this is week day ");
			break;
		}
		case "Saturday": {
		}
		case "Sunday": {
			System.out.println("This is weekend");
			break;
		}
		default:
			System.out.println("This is God day");
		}
	}
}
