package mb;

class TwoWheeler{
	void noOfWheels() {
		System.out.println("Have two wheels");
	}
}

class car extends TwoWheeler{
	void brandName() {
		System.out.println("Brand is honda");
	}
}


public class Single1 {
  public static void main(String[] args) {
	car bk=new car();
	bk.noOfWheels();
	bk.brandName();
}
}
