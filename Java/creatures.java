package mb;
class Creature {
 void move() {
     System.out.println("The creature moves");
 }
}
class Leopard extends Creature {
 void move() {
     System.out.println("The leopard runs swiftly");
 }
}
public class creatures {
 public static void main(String[] args) {
     Creature genericCreature = new Creature();
     genericCreature.move(); 
     Leopard leopard = new Leopard();
     leopard.move();
 }
}

