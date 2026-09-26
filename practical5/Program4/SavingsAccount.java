
class SavingsAccount implements Account {
    double balance;
    SavingsAccount(double valueB) {
        balance=valueB;
    }
    public void deposit(double valueA) {
        balance+=valueA;
    }
    public void withdraw(double valueA) {
        if(valueA<=balance)balance-=valueA;
        else System.out.println("Insufficient balance");
    }
    public void checkBalance() {
        System.out.println("Balance = "+balance);
    }
    public static void main(String[] inputArgs) {
        SavingsAccount valueA=new SavingsAccount(1000);
        valueA.deposit(500);
        valueA.withdraw(200);
        valueA.checkBalance();
    }
}
