
import java.util.Scanner;

public class Program3_SumOfDigits {
    public static void main(String[] commandArgs) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberValue = inputScanner.nextInt();
        int totalValue = 0;

        while (numberValue != 0) {
            totalValue = totalValue + numberValue % 10;
            numberValue = numberValue / 10;
        }

        System.out.println("Sum of digits = " + totalValue);
    }
}
