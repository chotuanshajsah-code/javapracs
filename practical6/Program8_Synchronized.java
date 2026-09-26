
class Program8_Synchronized {
    static double balance=1000;
    static synchronized void deposit() {
        balance+=500;
        System.out.println(balance);
    }
    static synchronized void withdraw() {
        if(balance>=300)balance-=300;
        System.out.println(balance);
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
