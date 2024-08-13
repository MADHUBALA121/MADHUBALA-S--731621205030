package mb;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age; 
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Parent {
    public static void main(String[] args) {
        Person person1 = new Person("MADHU", 22);
        Person person2 = new Person("BALA", 21);
        person1.display();
        person2.display();
    }
} 