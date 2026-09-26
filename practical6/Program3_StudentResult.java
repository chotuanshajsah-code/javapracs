
import java.util.*;
class Program3_StudentResult {
    public static void main(String[] inputArgs) {
        try {
            Scanner sourceObj=new Scanner(System.in);
            String name=sourceObj.nextLine();
            try {
                int valueA=sourceObj.nextInt(),valueB=sourceObj.nextInt(),valueC=sourceObj.nextInt();
                try {
                    System.out.println(name+" Average = "+(valueA+valueB+valueC)/3);
                }
                catch(ArithmeticException eventObj) {
                    System.out.println("Cannot calculate average");
                }
                try {
                    int[] memberObj= {
                        valueA,valueB,valueC
                    }
                    ;
                    System.out.println(memberObj[5]);
                }
                catch(ArrayIndexOutOfBoundsException eventObj) {
                    System.out.println("Invalid subject index");
                }
            }
            catch(Exception eventObj) {
                System.out.println("Invalid marks");
            }
        }
        catch(InputMismatchException eventObj) {
            System.out.println("Invalid input");
        }
    }
}
