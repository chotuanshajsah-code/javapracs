
class Manager implements Employee {
    String name;
    double salary;
    Manager(String numberValue,double sourceObj) {
        name=numberValue;
        salary=sourceObj;
    }
    public void calculateSalary() {
        System.out.println("Salary = "+salary);
    }
    public void displayDetails() {
        System.out.println("Manager: "+name);
    }
    public static void main(String[] inputArgs) {
        Manager memberObj=new Manager("Rahul",50000);
        memberObj.displayDetails();
        memberObj.calculateSalary();
        Developer valueD=new Developer("Aman",40000);
        valueD.displayDetails();
        valueD.calculateSalary();
    }
}
