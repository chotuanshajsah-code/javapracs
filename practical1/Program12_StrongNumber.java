
public class Program12_StrongNumber {
    public static void main(String[] commandArgs) {
        if (commandArgs.length == 0) {
            System.out.println("Enter a number as command line argument.");
            return;
        }

        int numberValue = Integer.parseInt(commandArgs[0]);
        int tempValue = numberValue;
        int totalValue = 0;

        while (numberValue != 0) {
            int digit = numberValue % 10;
            int fact = 1;

            for (int index = 1; index <= digit; index++) {
                fact = fact * index;
            }

            totalValue = totalValue + fact;
            numberValue = numberValue / 10;
        }

        if (totalValue == tempValue) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a Strong number");
        }
    }
}
