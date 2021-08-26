import com.protectmodifiers.Car;
import com.publicmodifiers.PubOne;

public class Demo extends Car{
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.carDetails();
		//car.
		//parents + yours
		PubOne o = new PubOne();
		o.age = 20;
		o.getPersonDetails();
	}
}
