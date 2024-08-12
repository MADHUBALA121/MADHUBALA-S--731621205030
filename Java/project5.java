package mb;

public class project5{
	
	 project5(String name) {
		System.out.println("Welcome "+name);
	}
	 project5(int a,int b) {
		System.out.println("Sum:"+(a+b));
	}

	
	 project5(int n) {
		System.out.println("Sum:"+(n+n));
	}
	public static void main(String[] args) {
		 project5 obj1=new  project5("MADHU");
		 project5 obj2=new project5(10,24);
		 project5 obj3=new  project5(5);
	}
}
