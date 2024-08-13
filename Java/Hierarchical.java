package mb;
import java.util.*;

class Vechicle1 {
	void noOfEnginee() {
		System.out.println("have one engine");
	}
}

class TwoWheeler2 extends Vechicle1{
	void noOfWheels() {
		System.out.println("Have two wheels");
	}
}
class Bike1 extends TwoWheeler2{
	void brandName() {
		System.out.println("Brand is honda");
	}
}

class scooty extends TwoWheeler2{
	void brandName() {
		System.out.println("Name is activa");
	}
}
public class Hierarchical {
	  public static void main(String[] args) {
		Bike1 bk=new Bike1();
		bk.noOfWheels();
		bk.brandName();
		bk.noOfEnginee();
		bk.brandName();
	}
	}
