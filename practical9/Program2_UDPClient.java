
import java.net.*;
import java.util.*;
class Program2_UDPClient {
    public static void main(String[] inputArgs)throws Exception {
        DatagramSocket valueD=new DatagramSocket();
        Scanner sourceObj=new Scanner(System.in);
        byte[] valueB=sourceObj.nextLine().getBytes();
        valueD.send(new DatagramPacket(valueB,valueB.length,InetAddress.getByName("localhost"),6000));
        byte[] resultValue=new byte[1024];
        DatagramPacket panelObj=new DatagramPacket(resultValue,resultValue.length);
        valueD.receive(panelObj);
        System.out.println(new String(panelObj.getData(),0,panelObj.getLength()));
        valueD.close();
    }
}
