package mb;

public class projec1 {
	int b=20;//instance variable
	static int c=30;
	public static void main(String[] args) {
		int a=10;//Local Variables
		System.out.println("Local Variables:"+a);
		projec1 obj=new projec1();
		System.out.println(obj.b);
		System.out.println(projec1.c);
}
}