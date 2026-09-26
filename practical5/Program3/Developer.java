
class Developer implements Employee {
    String name;
    double salary;
    Developer(String numberValue,double sourceObj) {
        name=numberValue;
        salary=sourceObj;
    }
    public void calculateSalary() {
        System.out.println("Salary = "+salary);
    }
    public void displayDetails() {
        System.out.println("Developer: "+name);
    }
}
