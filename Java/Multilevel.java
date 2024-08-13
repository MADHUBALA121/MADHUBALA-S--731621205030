package mb;
import java.util.*;

class Vechicle {
	void noOfEnginee() {
		System.out.println("have one engine");
	}
}

class TwoWheeler1 extends Vechicle{
	void noOfWheels() {
		System.out.println("Have two wheels");
	}
}

class bike extends TwoWheeler1{
	void brandName() {
		System.out.println("Brand is honda");
	}
}

public class Multilevel{
  public static void main(String[] args) {
	bike bk=new bike();
	bk.noOfWheels();
	bk.brandName();
	bk.noOfEnginee();
}
}