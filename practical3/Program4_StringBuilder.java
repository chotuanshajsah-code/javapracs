
import java.util.*;
class Program4_StringBuilder {
    public static void main(String[] commandArgs) {
        Scanner sourceObj=new Scanner(System.in);
        String fileObj=sourceObj.next(),lineNo=sourceObj.next();
        System.out.println("Username: "+new StringBuilder(fileObj.toLowerCase()+"."+lineNo.toLowerCase()));
        String panelObj=sourceObj.next();
        System.out.println(panelObj.length()>=8?"Strong Password":"Weak Password");
        sourceObj.nextLine();
        String sms=sourceObj.nextLine();
        System.out.println("Characters Used : "+sms.length());
        System.out.println("Characters Left : "+(160-sms.length()));
        StringBuilder valueB=new StringBuilder();
        valueB.append("Milk : 50\nBread : 40\nButter : 80\nTotal : 170");
        System.out.println(valueB);
    }
}
