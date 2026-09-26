
import java.util.Scanner;

public class Program4_Armstrong {
    public static void main(String[] commandArgs) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberValue = inputScanner.nextInt();
        int tempValue = numberValue;
        int totalValue = 0;

        while (numberValue != 0) {
            int digit = numberValue % 10;
            totalValue = totalValue + digit * digit * digit;
            numberValue = numberValue / 10;
        }

        if (totalValue == tempValue) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
