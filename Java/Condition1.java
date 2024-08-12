public class SumArray {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 15}; // Example array
        int sum = 0;

        // Traverse the array and calculate the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Print the sum
        System.out.println("Sum of given array is " + sum);
    }
}
