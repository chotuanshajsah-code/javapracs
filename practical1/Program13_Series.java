
import java.util.Scanner;

public class Program13_Series {
    public static void main(String[] commandArgs) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int numberValue = inputScanner.nextInt();

        double totalValue = 0;
        long fact = 1;

        for (int index = 1; index <= numberValue; index++) {
            fact = fact * index;
            totalValue = totalValue + (double)(index * index) / fact;
        }

        System.out.println("Sum = " + totalValue);
    }
}
