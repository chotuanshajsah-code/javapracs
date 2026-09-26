
import java.util.Scanner;

public class Program7_Fibonacci {
    public static void main(String[] commandArgs) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int numberValue = inputScanner.nextInt();

        int valueA = 0;
        int valueB = 1;

        System.out.print("Fibonacci series: ");

        for (int index = 1; index <= numberValue; index++) {
            System.out.print(valueA + " ");
            int valueC = valueA + valueB;
            valueA = valueB;
            valueB = valueC;
        }
    }
}
