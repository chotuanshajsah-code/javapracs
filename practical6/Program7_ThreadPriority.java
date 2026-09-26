
class Program7_ThreadPriority {
    static double balance=1000;
    public static void main(String[] inputArgs) {
        Thread valueA=new Thread() {
            public void run() {
                balance+=500;
                System.out.println("Deposit");
            }
        }
        ;
        Thread valueB=new Thread() {
            public void run() {
                balance-=300;
                System.out.println("Withdraw");
            }
        }
        ;
        valueA.setPriority(10);
        valueB.setPriority(1);
        valueA.start();
        valueB.start();
    }
}
