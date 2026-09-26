
public class Program2_PrimeNumbers {
    public static void main(String[] commandArgs) {
        System.out.println("Prime numbers from 1 to 500:");

        for (int index = 2; index <= 500; index++) {
            int count = 0;

            for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
                if (index % innerIndex == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(index + " ");
            }
        }
    }
}
