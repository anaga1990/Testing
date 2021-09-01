package looping.statements.ex;

public class ForloopWithContinueStatemet {
	public static void main(String[] args) {
		int a =10;
		for(int i = 1; i<=10; i++) {
			if (i==4) {
				continue; // if your getting data about 
			}
			a++;
			System.out.println(a);
		}
	}
}
//if you are using continue statement if condition true, then it will skip rest of below code in for/while/do-while loops
//and courser will hand over to loops for rest of iterations