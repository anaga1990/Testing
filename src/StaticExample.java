
class StaticExample {

	static int maths = 100;  // static var
	static int phy = 78;
	static int eng = 92;

	static {   // static block it will be execute only once
		System.out
				.println("display marks " + " Maths marks : " + maths 
						+ " Phisics marks : " + phy 
						+ " english marks : " + eng);
	}
	// to access static variables and static methods class reference
	public static void calculate() {   // static method
		int avg = (maths + phy + eng)/ 3 ;
		System.out.println("Average : "+avg);
		
		
	}

	public static void main(String[] args) {
		StaticExample.calculate();  // static method calling using class reference
		StaticExample.maths=30;  //static var calling using class reference
		StaticExample.phy=25;
		StaticExample.eng=45;
		System.out.println("After Marks Updated is ....");
		StaticExample.calculate();
		System.out.println("display marks " + " Maths marks : " + maths 
				+ " Phisics marks : " + phy 
				+ " english marks : " + eng);
	}

}
