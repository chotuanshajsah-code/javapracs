
class Program5_ATMThreads {
    public static void main(String[] inputArgs) {
        Runnable valueA=()-> {
            try {
                System.out.println("Card Inserted");
                Thread.sleep(500);
                System.out.println("PIN Verified");
                System.out.println("Transaction Processing");
            }
            catch(Exception eventObj) {
            }
        }
        ;
        Runnable valueB=()-> {
            try {
                System.out.println("Checking Balance");
                Thread.sleep(500);
                System.out.println("Amount Debited");
                System.out.println("SMS Sent");
            }
            catch(Exception eventObj) {
            }
        }
        ;
        new Thread(valueA).start();
        new Thread(valueB).start();
    }
}
