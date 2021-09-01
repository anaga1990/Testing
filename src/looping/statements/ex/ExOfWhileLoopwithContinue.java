package looping.statements.ex;

public class ExOfWhileLoopwithContinue {
	public static void main(String[] args) {
		//while(true) {
			//execute code
		//}
		int a = 0;
		while(a<=18) {
			if (a==5) {
				continue;
			}
			System.out.println(a);
			a++;
		}
	}
}
