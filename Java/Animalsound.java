package mb;
class Animal {
 void makeSound() {
     System.out.println("The animal make a different sounds");
 }
}

//Subclass Cat
class Cat extends Animal {
 void makeSound() {
     System.out.println("The cat sounds meows");
 }
}
public class Animalsound {
 public static void main(String[] args) {
     Animal myAnimal = new Animal();
     myAnimal.makeSound();
     Cat myCat = new Cat();
     myCat.makeSound();
 }
}

