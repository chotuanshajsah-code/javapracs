
import java.util.*;
class Program4_BankThrow {
    public static void main(String[] inputArgs) {
        double balance=10000;
        Scanner sourceObj=new Scanner(System.in);
        double valueA=sourceObj.nextDouble();
        try {
            if(valueA>balance)throw new IllegalArgumentException("Insufficient balance");
            balance-=valueA;
            System.out.println(balance);
        }
        catch(IllegalArgumentException eventObj) {
            System.out.println(eventObj.getMessage());
        }
    }
}
