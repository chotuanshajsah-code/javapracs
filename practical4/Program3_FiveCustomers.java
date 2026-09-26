
class Program3_FiveCustomers {
    long no;
    String name;
    double bal;
    Program3_FiveCustomers(long numberValue,String sourceObj,double valueB) {
        no=numberValue;
        name=sourceObj;
        bal=valueB;
    }
    public static void main(String[] inputArgs) {
        Program3_FiveCustomers[] valueA= {
            new Program3_FiveCustomers(1,"A",1000),new Program3_FiveCustomers(2,"B",2000),new Program3_FiveCustomers(3,"C",3000),new Program3_FiveCustomers(4,"D",4000),new Program3_FiveCustomers(5,"E",5000)
        }
        ;
        for(Program3_FiveCustomers valueB:valueA)System.out.println(valueB.no+" "+valueB.name+" "+valueB.bal);
    }
}
