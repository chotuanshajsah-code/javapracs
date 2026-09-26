
package studentinfo;
import java.util.*;
public class Student {
    int studentId;
    String studentName,course;
    double marks;
    public void acceptDetails() {
        Scanner sourceObj=new Scanner(System.in);
        studentId=sourceObj.nextInt();
        sourceObj.nextLine();
        studentName=sourceObj.nextLine();
        course=sourceObj.nextLine();
        marks=sourceObj.nextDouble();
    }
    public void displayDetails() {
        System.out.println(studentId+" "+studentName+" "+course);
        System.out.println("Grade = "+calculateGrade());
    }
    public String calculateGrade() {
        if(marks>=90)return "A+";
        if(marks>=80)return "A";
        if(marks>=70)return "B";
        if(marks>=60)return "C";
        return "D";
    }
}
