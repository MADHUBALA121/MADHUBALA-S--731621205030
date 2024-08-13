package mb;

class Dog {
    String name;
    String breed;
    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    void setName(String name) {
        this.name = name;
    }
    void setBreed(String breed) {
        this.breed = breed;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

public class Breed{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Charlie", "Bailey");
        Dog dog2 = new Dog("Cooper", "Bull");
        dog1.display();
        dog2.display();
        System.out.println("\nAfter change");
        dog1.setName("Jimmy");
        dog1.setBreed("Jack");
        dog2.setName("Rocky");
        dog2.setBreed("Frankie");
        dog1.display();
        dog2.display();
    }
}