package mb;
class Bird {
    void move() {
        System.out.println("Bird flies");
    }

    void makeSound() {
        System.out.println("Bird chirps");
    }
}

class Panthera {
    void move() {
        System.out.println("Panthera walks and runs");
    }

    void makeSound() {
        System.out.println("Panthera roars");
    }
}

public class Assessment7 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Panthera panther = new Panthera();

        bird.move();
        bird.makeSound();

        panther.move();
        panther.makeSound();
    }
}

