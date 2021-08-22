
public class InstanceExample {

	int maths = 100;  // with in the class but out side the methods/ block + local
	int phy = 78; // non-static or instance var
	int eng = 92;

	{
		System.out.println("i am from non-static block");
		System.out.println(
				"display marks " + " Maths marks : " + maths 
				+ " Phisics marks : " + phy 
				+ " english marks : " + eng);
	}

	public void calculate() {
		int avg = (maths + phy + eng) / 3;
		System.out.println("Average : " + avg);
	}

	public static void main(String[] args) {
		InstanceExample example = new InstanceExample();  // object creation  // heap memory area 
		example.calculate();  // non-static method calling using object reference
		example.maths=70;
		example.phy=70;
		example.eng=70;
		System.out.println("After Marks Updated is ....");
		example.calculate();
	}

}
