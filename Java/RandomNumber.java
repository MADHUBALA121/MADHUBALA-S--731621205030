import java.util.Random;
import java.util.Scanner;

public class RandomNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the lower bound : ");
        int lowerBound = scanner.nextInt();
        
        System.out.print("Enter the upper bound  : ");
        int upperBound = scanner.nextInt();
        int randomNumber = random.nextInt(upperBound - lowerBound) + lowerBound;
        
        System.out.println("Random Number: " + randomNumber);
    }
}
