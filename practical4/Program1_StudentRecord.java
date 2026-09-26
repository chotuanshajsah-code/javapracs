
import java.util.*;
class Program1_StudentRecord {
    int id;
    String name,course;
    double valueA,innerIndex,panelObj;
    Program1_StudentRecord() {
        id=0;
        name="Unknown";
        course="None";
    }
    Program1_StudentRecord(int index,String numberValue,String valueC,double inputArgs,double valueY,double valueZ) {
        id=index;
        name=numberValue;
        course=valueC;
        valueA=inputArgs;
        innerIndex=valueY;
        panelObj=valueZ;
    }
    double total() {
        return valueA+innerIndex+panelObj;
    }
    double percentage() {
        return total()/3;
    }
    void accept() {
        Scanner sourceObj=new Scanner(System.in);
        id=sourceObj.nextInt();
        sourceObj.nextLine();
        name=sourceObj.nextLine();
        course=sourceObj.nextLine();
        valueA=sourceObj.nextDouble();
        innerIndex=sourceObj.nextDouble();
        panelObj=sourceObj.nextDouble();
    }
    void display() {
        System.out.println(id+" "+name+" "+course);
        System.out.println("Total = "+total());
        System.out.println("Percentage = "+percentage());
    }
    public static void main(String[] inputArgs) {
        Program1_StudentRecord firstString=new Program1_StudentRecord();
        firstString.display();
        Program1_StudentRecord secondString=new Program1_StudentRecord(1,"Rahul","BSc CS",80,75,85);
        secondString.display();
    }
}
