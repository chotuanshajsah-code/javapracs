
class Program9_FibonacciSquare {
    public static void main(String[] inputArgs) {
        Thread fileObj=new Thread() {
            public void run() {
                int valueA=0,valueB=1;
                while(valueA<=20) {
                    System.out.println("Fibonacci = "+valueA);
                    int valueC=valueA+valueB;
                    valueA=valueB;
                    valueB=valueC;
                }
            }
        }
        ;
        Thread sourceObj=new Thread() {
            public void run() {
                for(int index=0;index<=20;index++)System.out.println("Square = "+index*index);
            }
        }
        ;
        fileObj.start();
        sourceObj.start();
    }
}
