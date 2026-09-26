
abstract class Payment {
    double amount;
    Payment(double valueA) {
        amount=valueA;
    }
    void displayReceipt() {
        System.out.println("Amount = "+amount);
    }
    abstract void processPayment();
}
class Program7_DigitalPayment extends Payment {
    String wallet;
    Program7_DigitalPayment(double valueA,String wordValue) {
        super(valueA);
        wallet=wordValue;
    }
    void processPayment() {
        System.out.println("Payment transferred to "+wallet);
    }
    public static void main(String[] inputArgs) {
        Program7_DigitalPayment panelObj=new Program7_DigitalPayment(1500,"wallet123");
        panelObj.displayReceipt();
        panelObj.processPayment();
    }
}
