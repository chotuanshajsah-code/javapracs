
class User {
    int id;
    String name,mobile;
    User(int index,String numberValue,String memberObj) {
        id=index;
        name=numberValue;
        mobile=memberObj;
    }
}
class Customer extends User {
    String address;
    int order;
    Customer(int index,String numberValue,String memberObj,String valueA,int o) {
        super(index,numberValue,memberObj);
        address=valueA;
        order=o;
    }
}
class Program5_OnlineShopping extends Customer {
    String membership;
    double discount;
    Program5_OnlineShopping(int index,String numberValue,String memberObj,String valueA,int o,String textObj,double valueD) {
        super(index,numberValue,memberObj,valueA,o);
        membership=textObj;
        discount=valueD;
    }
    void bill(double amount) {
        System.out.println("Final bill = "+(amount-amount*discount/100));
    }
    public static void main(String[] inputArgs) {
        Program5_OnlineShopping panelObj=new Program5_OnlineShopping(1,"Rahul","9876543210","Mumbai",101,"Gold",10);
        panelObj.bill(2000);
    }
}
