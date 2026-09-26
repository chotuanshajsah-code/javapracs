
import java.util.Scanner;

public class Program8_Calculator {
    public static void main(String[] commandArgs) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double valueA = inputScanner.nextDouble();

        System.out.print("Enter second number: ");
        double valueB = inputScanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = inputScanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result = " + (valueA + valueB));
                break;
            case '-':
                System.out.println("Result = " + (valueA - valueB));
                break;
            case '*':
                System.out.println("Result = " + (valueA * valueB));
                break;
            case '/':
                if (valueB != 0)
                    System.out.println("Result = " + (valueA / valueB));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
