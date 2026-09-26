
import java.util.*;
class Program2_StudentMarks {
    public static void main(String[] inputArgs) {
        try {
            Scanner sourceObj=new Scanner(System.in);
            int valueA=sourceObj.nextInt(),valueB=sourceObj.nextInt(),valueC=sourceObj.nextInt();
            System.out.println("Average = "+(valueA+valueB+valueC)/3);
            int[] valueZ= {
                1,2
            }
            ;
            System.out.println(valueZ[5]);
        }
        catch(InputMismatchException eventObj) {
            System.out.println("Invalid input");
        }
        catch(ArithmeticException eventObj) {
            System.out.println("Arithmetic error");
        }
        catch(ArrayIndexOutOfBoundsException eventObj) {
            System.out.println("Invalid index");
        }
        catch(NumberFormatException eventObj) {
            System.out.println("Invalid number");
        }
    }
}
