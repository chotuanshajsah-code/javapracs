
class Program6_StaticStudent {
    int roll;
    String name;
    static String college="Mithibai College";
    static int count;
    Program6_StaticStudent(int resultValue,String numberValue) {
        roll=resultValue;
        name=numberValue;
        count++;
    }
    void display() {
        System.out.println(roll+" "+name+" "+college);
    }
    static void totalStudents() {
        System.out.println("Total students = "+count);
    }
    public static void main(String[] inputArgs) {
        new Program6_StaticStudent(1,"Rahul").display();
        new Program6_StaticStudent(2,"Rohan").display();
        totalStudents();
    }
}
