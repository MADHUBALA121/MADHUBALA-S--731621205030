package mb;
class Transport {
    public void accelerate() {
        System.out.println("The transport is accelerating");
    }
}
class Sedan extends Transport {
    public void accelerate() {
        System.out.println("The sedan accelerates by 20 mph");
    }
}
class MountainBike extends Transport {
    public void accelerate() {
        System.out.println("The mountain bike accelerates by 5 mph");
    }
}
public class Assessment2 {
    public static void main(String[] args) {
        Transport mySedan = new Sedan(); 
        Transport myMountainBike = new MountainBike(); 
        
        mySedan.accelerate(); 
        myMountainBike.accelerate(); 
    }
}
