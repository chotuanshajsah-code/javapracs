
import java.net.*;
class Program2_UDPServer {
    public static void main(String[] inputArgs)throws Exception {
        DatagramSocket valueD=new DatagramSocket(6000);
        byte[] valueB=new byte[1024];
        DatagramPacket panelObj=new DatagramPacket(valueB,valueB.length);
        valueD.receive(panelObj);
        System.out.println(new String(panelObj.getData(),0,panelObj.getLength()));
        byte[] resultValue="Message received".getBytes();
        valueD.send(new DatagramPacket(resultValue,resultValue.length,panelObj.getAddress(),panelObj.getPort()));
        valueD.close();
    }
}
