
import java.util.Scanner;

public class Program10_Palindrome {
    public static void main(String[] commandArgs) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = inputScanner.nextLine();

        String rev = "";

        for (int index = str.length() - 1; index >= 0; index--) {
            rev = rev + str.charAt(index);
        }

        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
