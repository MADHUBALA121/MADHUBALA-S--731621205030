package mb;

public class project2 {
	void myMethod1() {
		System.out.println("Instance Method");
	}
	static void myMethod2() {
		System.out.println("Static Method");
	}
    public static void main(String[] args) {
    	project2 obj=new project2();
    	obj.myMethod1();
    	project2.myMethod2();
    }
}
