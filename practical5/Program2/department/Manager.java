
package department;
import company.Employee;
public class Manager implements Employee {
    public void calculateSalary() {
        System.out.println("Manager salary = 50000");
    }
    public static void main(String[] inputArgs) {
        new Manager().calculateSalary();
    }
}
