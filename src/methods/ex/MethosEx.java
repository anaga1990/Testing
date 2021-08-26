package methods.ex;

public class MethosEx {
	
	//Access modifier static/non-static Return_Type Method_Name(){
	

	public static void main(String[] args) {
		MethosEx methodsEx = new MethosEx();
		System.out.println("we are in Methods EX");
		methodsEx.addtion();
		int result = methodsEx.mOne();
		System.out.println(result);
		// int return type
		MethosEx ex = new MethosEx();
		System.out.println(ex.Mtwo());
		System.out.println("My Iphone amount : --> "+methodsEx.mthree());
		System.out.println(ex.iAMGoodInEnglish());
	}
	
	
	public void addtion() { // create object for class
		int a = 20;
		int b = 25;    // non static methods will be able to call using object ref
		int c = a+b;  // 20+25;
		System.out.println("we did adition and C value is: "+c);
	}
	
	//classname ref = new classname();
	
	public int mOne() {
		int a = 20;
		return a;
	}
	
	public long Mtwo() {
		
		long cardID =456500023123456L;
		return cardID;
	}
	
	public float mthree() {
		
		float iphoneXr_PaidAmount = 1037024.46F;
		return iphoneXr_PaidAmount;
		
	}
	
	public boolean iAMGoodInEnglish() {
		return false;
	}
	
	
}
