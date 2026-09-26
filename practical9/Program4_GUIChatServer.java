
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
class Program4_GUIChatServer extends Frame implements ActionListener {
    TextField textObj=new TextField(25);
    PrintWriter out;
    Program4_GUIChatServer()throws Exception {
        add(textObj);
        Button valueB=new Button("Send");
        add(valueB);
        valueB.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(400,150);
        setVisible(true);
        ServerSocket ss=new ServerSocket(7000);
        Socket sourceObj=ss.accept();
        out=new PrintWriter(sourceObj.getOutputStream(),true);
    }
    public void actionPerformed(ActionEvent eventObj) {
        out.println(textObj.getText());
        textObj.setText("");
    }
    public static void main(String[] inputArgs)throws Exception {
        new Program4_GUIChatServer();
    }
}
