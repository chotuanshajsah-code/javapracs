
import java.util.Scanner;

public class Program5_SwapNumbers {
    public static void main(String[] commandArgs) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int valueA = inputScanner.nextInt();

        System.out.print("Enter second number: ");
        int valueB = inputScanner.nextInt();

        valueA = valueA + valueB;
        valueB = valueA - valueB;
        valueA = valueA - valueB;

        System.out.println("After swapping:");
        System.out.println("First number = " + valueA);
        System.out.println("Second number = " + valueB);
    }
}
