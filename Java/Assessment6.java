package mb;
class CircularObject {
  private double radius;

  public CircularObject(double radius) {
    this.radius = radius;
  }

  double calculateArea() {
    return Math.PI * radius * radius;
  }

  double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }
}

class RectangularPrism {
  private double length;
  private double width;

  public RectangularPrism(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double calculateArea() {
    return 2 * (length * width + length * getHeight() + width * getHeight());
  }

  private double getHeight() {
    return 1.0; // Placeholder value for simplicity
  }

  double calculatePerimeter() {
    return 2 * (length + width);
  }
}

class TriangularShape {
  private double base;
  private double height;
  private double side1;
  private double side2;

  public TriangularShape(double base, double height, double side1, double side2) {
    this.base = base;
    this.height = height;
    this.side1 = side1;
    this.side2 = side2;
  }

  double calculateArea() {
    return 0.5 * base * height;
  }

  double calculatePerimeter() {
    return base + side1 + side2;
  }
}

public class Assessment6 {
  public static void main(String[] args) {
    CircularObject circle = new CircularObject(5);
    RectangularPrism rectangle = new RectangularPrism(4, 3);
    TriangularShape triangle = new TriangularShape(3, 4, 5, 4);

    System.out.println("Circle Area: " + circle.calculateArea());
    System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

    System.out.println("Rectangle Area: " + rectangle.calculateArea());
    System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

    System.out.println("Triangle Area: " + triangle.calculateArea());
    System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
  }
}