
import java.util.*;
class Program1_Exceptions {
    public static void main(String[] inputArgs) {
        try {
            int valueA=10/0;
        }
        catch(ArithmeticException eventObj) {
            System.out.println("ArithmeticException");
        }
        try {
            int[] valueA= {
                1,2
            }
            ;
            System.out.println(valueA[5]);
        }
        catch(ArrayIndexOutOfBoundsException eventObj) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        try {
            Integer.parseInt("abc");
        }
        catch(NumberFormatException eventObj) {
            System.out.println("NumberFormatException");
        }
        try {
            new Scanner("abc").nextInt();
        }
        catch(InputMismatchException eventObj) {
            System.out.println("InputMismatchException");
        }
        try {
            String sourceObj=null;
            sourceObj.length();
        }
        catch(NullPointerException eventObj) {
            System.out.println("NullPointerException");
        }
        try {
            "Java".charAt(9);
        }
        catch(StringIndexOutOfBoundsException eventObj) {
            System.out.println("StringIndexOutOfBoundsException");
        }
        try {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException eventObj) {
            System.out.println("IllegalArgumentException");
        }
    }
}
