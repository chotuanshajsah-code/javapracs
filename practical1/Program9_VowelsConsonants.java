
import java.util.Scanner;

public class Program9_VowelsConsonants {
    public static void main(String[] commandArgs) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = inputScanner.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int index = 0; index < str.length(); index++) {
            char ch = Character.toLowerCase(str.charAt(index));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
