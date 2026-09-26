
public class Program1_OddNumbers {
    public static void main(String[] commandArgs) {
        int count = 0;

        for (int index = 1; index <= 500; index++) {
            if (index % 2 != 0) {
                count++;
            }
        }

        System.out.println("Total odd numbers = " + count);
    }
}
