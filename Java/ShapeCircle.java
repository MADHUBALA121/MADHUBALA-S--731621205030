package mb;
	class Circle {
	    double radius;
	    Circle(double radius) {
	        this.radius = radius;
	    }
	    double Area() {
	        return Math.PI * radius * radius;
	    }
	    double Circumference() {
	        return 2 * Math.PI * radius;
	    }
	    void display() {
	        System.out.println("Area: " + Area());
	        System.out.println("Circumference: " + Circumference());
	    }
	}

	public class ShapeCircle {
	    public static void main(String[] args) {
	        Circle circle = new Circle(7.0);
	        circle.display();
	        circle.radius = 9.0;
	        System.out.println("After Change");
	        circle.display();
	    }
	}
