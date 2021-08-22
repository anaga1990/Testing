package methods.ex;

public class MethodsExamples {
	
	public static void main(String[] args) {
		//main method
		//Classname objectREFF = new Classname();
		MethodsExamples mx = new MethodsExamples();
		mx.name();
		int a =mx.calAddtion();
		System.out.println("we juist printing a value "+a);
		//System.out.println(mx.calAddtion2());
		boolean bb =mx.calAddtion2();
		Boolean b1 =mx.calAddtion2();
		System.out.println(bb);
		System.out.println(b1);
		System.out.println("20");
		System.out.println(mx.sa());
		
	}
	
	public void name() {
		int a = 20; //gf nag  // gc sabgemesh
		int b = 30;
		int cx = a+b;
		System.out.println("displayed from void "+cx);
		//return 0;
	}
	
	
	//int type method
	public int calAddtion() {
		int a = 20; //gf nag  // gc sabgemesh or gf sabgemesh gc nag
		int b = 20;
		int add = a+b;
		return add;
	}
	
	public long calAddtion1() {
		
		return 20;
	}
	
	
	public boolean calAddtion2() {
		return false;
		
	}
	
	public String sa() {
		
		return "nagarjuna";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

/* void  >> not hold the information (do the action but result/values/object will not be store)
 * short/int/long/float/double  >> hold the information (result/values 12333333)
 * boolean  >> true/false
 * chat ''
 * string "nana122333@@@@@"
 * Object
 * []  one dimenction
 * [] [] 2 dim
 * [][][] 3 dim
 */
