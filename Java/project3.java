package mb;

public class project3 {
	String name;
	project3(String name){
		this(10,20);
		this.name = name;
		this.greeting();
	}
	project3(int a,int b){
		System.out.println("Addition:" + (a+b));
	}
	void greeting() {
		System.out.println("Welcome " + name);
	}
	public static void main(String[] args) {
		project3 obj=new project3("MADHU");
	}
}
