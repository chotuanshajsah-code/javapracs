
import java.util.Scanner;

public class Program14_OddSeries {
    public static void main(String[] commandArgs) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int numberValue = inputScanner.nextInt();

        int totalValue = 0;
        int sign = 1;

        for (int index = 1; index <= numberValue; index += 2) {
            totalValue = totalValue + sign * index;
            sign = -sign;
        }

        System.out.println("Sum = " + totalValue);
    }
}
