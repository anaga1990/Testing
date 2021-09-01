package looping.statements.ex;

public class ForloopWithBreakStatemet {
	public static void main(String[] args) {
		int a =10;
		for(int i = 1; i<10; i++) {
			if (i==4) {
				break; // if your getting data about 
			}
			a++;
			System.out.println(a);
		}
	}
}

// if you are using break statement if condition true then it will come out of for/while/do-while