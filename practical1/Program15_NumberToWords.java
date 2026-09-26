
import java.util.Scanner;

public class Program15_NumberToWords {
    public static void main(String[] commandArgs) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = inputScanner.next();

        for (int index = 0; index < number.length(); index++) {
            char ch = number.charAt(index);

            switch (ch) {
                case '0':
                    System.out.print("zero ");
                    break;
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
                default:
                    System.out.print("Invalid input");
            }
        }
    }
}
