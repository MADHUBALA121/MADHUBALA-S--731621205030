import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int result = 0;
        int digits = 0;
        while (originalNumber != 0) {
            originalNumber /= 10;
            digits++;
        }
        
        originalNumber = number;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            
            result += power;
            originalNumber /= 10;
        }
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
