package mb;
class Mounika{
 double getArea() {
     return 0;
 }
}
class Rec1 extends Mounika {
 private double length;
 private double width;
 Rec1(double length, double width) {
     this.length = length;
     this.width = width;
 }
 double getArea() {
     return length * width;
 }
}
public class RectangleProblem {
 public static void main(String[] args) {
     Rec1 myRectangle = new Rec1(5.0, 3.0);
     double area = myRectangle.getArea(); 
     System.out.println("The area of the rectangle is: " + area);
 }
}
