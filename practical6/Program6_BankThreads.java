
class Program6_BankThreads {
    static double balance=1000;
    static void deposit() {
        balance+=500;
        System.out.println("Deposit = "+balance);
    }
    static void withdraw() {
        balance-=300;
        System.out.println("Withdraw = "+balance);
    }
    public static void main(String[] inputArgs) {
        new Thread() {
            public void run() {
                deposit();
            }
        }
        .start();
        new Thread() {
            public void run() {
                withdraw();
            }
        }
        .start();
    }
}
