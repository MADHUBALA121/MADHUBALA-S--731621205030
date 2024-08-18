package mb;
abstract class GeometricShape {
 abstract double calculateArea();
}
class Ellipse extends GeometricShape {
 double majorAxis, minorAxis;
 Ellipse(double majorAxis, double minorAxis) {
     this.majorAxis = majorAxis;
     this.minorAxis = minorAxis;
 }
 double calculateArea() {
     return Math.PI * majorAxis * minorAxis;
 }
}
class Square extends GeometricShape {
 double side;
 Square(double side) {
     this.side = side;
 }
 double calculateArea() {
     return side * side;
 }
}
class Parallelogram extends GeometricShape {
 double base, height;
 Parallelogram(double base, double height) {
     this.base = base;
     this.height = height;
 }
 double calculateArea() {
     return base * height;
 }
}
public class Assessment3 {

 public static void main(String[] args) {
     GeometricShape myEllipse = new Ellipse(5, 3);
     GeometricShape mySquare = new Square(4);  
     GeometricShape myParallelogram = new Parallelogram(3, 7); 
     
     System.out.println("Ellipse area: " + myEllipse.calculateArea());
     System.out.println("Square area: " + mySquare.calculateArea());
     System.out.println("Parallelogram area: " + myParallelogram.calculateArea());
 }
}

