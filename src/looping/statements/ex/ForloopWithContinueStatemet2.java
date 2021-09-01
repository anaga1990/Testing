package looping.statements.ex;

public class ForloopWithContinueStatemet2 {
	public static void main(String[] args) {
		int a = 10;
		for (int i = 1; i <= 10; i++) { //for loop started in line number 6 & for loop end in line number 11
			a++;							//'continue' statement Satisfied rest of code skipped and cursor hand over to 6th line				
			if (i == 4) {
				continue; // if your getting data about
			}
			System.out.println(a);
		}
	}
}

//11,12,13,15



//if you are using continue statement if condition true, then it will skip rest of below code in for/while/do-while loops
//and courser will hand over to loops for rest of iterations