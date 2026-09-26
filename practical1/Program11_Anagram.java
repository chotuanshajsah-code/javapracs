
import java.util.Arrays;
import java.util.Scanner;

public class Program11_Anagram {
    public static void main(String[] commandArgs) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String valueA = inputScanner.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.print("Enter second string: ");
        String valueB = inputScanner.nextLine().replaceAll("\\s", "").toLowerCase();

        char[] inputArgs = valueA.toCharArray();
        char[] valueY = valueB.toCharArray();

        Arrays.sort(inputArgs);
        Arrays.sort(valueY);

        if (Arrays.equals(inputArgs, valueY)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}
