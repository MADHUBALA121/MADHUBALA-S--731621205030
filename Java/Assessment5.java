package mb;
abstract class Sports {
    abstract void play();
}

class Football extends Sports {
    void play() {
        System.out.println("Playing football");
    }
}

class Basketball extends Sports {
    void play() {
        System.out.println("Playing basketball");
    }
}

class Rugby extends Sports {
    void play() {
        System.out.println("Playing rugby");
    }
}
public class Assessment5 {
    public static void main(String[] args) {
        Sports[] sports = {new Football(), new Basketball(), new Rugby()};
        for (Sports sport : sports) {
            sport.play();
        }
    }
}


