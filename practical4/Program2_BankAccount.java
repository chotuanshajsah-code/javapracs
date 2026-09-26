
class Program2_BankAccount {
    long no;
    String name;
    double bal;
    Program2_BankAccount() {
        no=0;
        name="Unknown";
    }
    Program2_BankAccount(long numberValue,String sourceObj,double valueB) {
        no=numberValue;
        name=sourceObj;
        bal=valueB;
    }
    void deposit(double inputArgs) {
        bal+=inputArgs;
    }
    void withdraw(double inputArgs) {
        if(inputArgs<=bal)bal-=inputArgs;
        else System.out.println("Insufficient balance");
    }
    void display() {
        System.out.println(no+" "+name+" "+bal);
    }
    public static void main(String[] inputArgs) {
        Program2_BankAccount valueB=new Program2_BankAccount(1001,"Rahul",5000);
        valueB.deposit(1000);
        valueB.withdraw(500);
        valueB.display();
    }
}
