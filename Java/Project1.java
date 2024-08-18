package mb;
class AnimalFamily {
 public void makeSound() {
     System.out.println("Some generic animal family sound");
 }
}
class Lion extends AnimalFamily {
 @Override
 public void makeSound() {
     System.out.println("Roar Roar");
 }
}
class Dolphin extends AnimalFamily {
 public void makeSound() {
     System.out.println("Click Click");
 }
}
public class Project1 {
 public static void main(String[] args) {
     AnimalFamily myLion = new Lion();  
     AnimalFamily myDolphin = new Dolphin();
     
     myLion.makeSound(); 
     myDolphin.makeSound(); 
 }
}



