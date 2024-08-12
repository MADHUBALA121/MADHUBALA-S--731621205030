class Car {
    String color;
    String model;
    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }
    void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }
}
public class Main{
    public static void main(String[] args) {
        Car myCar = new Car("Red", "Toyota");
        myCar.displayInfo(); // Output: Car Model: Toyota, Color: Red
    }
}
