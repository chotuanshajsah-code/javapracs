
class Device {
    int id;
    String name,power;
    Device(int index,String numberValue) {
        id=index;
        name=numberValue;
        power="OFF";
    }
    void turnOn() {
        power="ON";
    }
    void turnOff() {
        power="OFF";
    }
}
class Program4_SmartLight extends Device {
    int brightness;
    String color;
    Program4_SmartLight(int index,String numberValue,int valueB,String valueC) {
        super(index,numberValue);
        brightness=valueB;
        color=valueC;
    }
    void display() {
        System.out.println(id+" "+name+" "+power);
        System.out.println(brightness+" "+color);
    }
    public static void main(String[] inputArgs) {
        Program4_SmartLight sourceObj=new Program4_SmartLight(1,"Light",50,"White");
        sourceObj.turnOn();
        sourceObj.display();
    }
}
