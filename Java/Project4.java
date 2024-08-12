package mb;

public class Project4 {
	void myMethod(String name) {
		System.out.println("Welcome "+name);
	}
	void myMethod(int a,int b) {
		System.out.println("Sum:"+(a+b));
	}

	
	void myMethod(int n) {
		System.out.println("Sum:"+(n+n));
	}
	public static void main(String[] args) {
		Project4 obj=new Project4();
		obj.myMethod(5);
		obj.myMethod("Arun");
		obj.myMethod(25,31);
	}
}
