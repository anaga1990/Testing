package methods.ex;

public class MethodsWithArguments {
	public static void main(String[] args) {
		MethodsWithArguments mwr = new MethodsWithArguments();
		mwr.testOne();
		
		System.out.println(mwr.testOne(10000000));
		int result=mwr.testOne(1000);
		System.out.println(result);
		long bb = mwr.testOne(result, result);
		System.out.println(bb);
		
	}
	//10000000
	//100000000
	//with arguments methods
	int testOne() {
		System.out.println("I am in without Argument");
		return 0;
	}
	
	int testOne(int a) {
		int reteOfIntrest=10;
		int total = reteOfIntrest*a;
		System.out.println("I am with Argument");
		return total;
	}
	
	long testOne(int a, int b) {
		int reteOfIntrest=10;
		int total = reteOfIntrest*a;
		System.out.println("I am with Argument");
		return total;
	}
	
}
