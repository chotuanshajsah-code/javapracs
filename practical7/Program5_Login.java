
import java.awt.*;
class Program5_Login extends Frame {
    Program5_Login() {
        setTitle("Login");
        setLayout(new FlowLayout());
        add(new Label("User"));
        add(new TextField(20));
        add(new Label("Password"));
        TextField panelObj=new TextField(20);
        panelObj.setEchoChar('*');
        add(panelObj);
        add(new Button("login"));
        add(new Button("register"));
        setSize(300,180);
        setVisible(true);
    }
    public static void main(String[] inputArgs) {
        new Program5_Login();
    }
}
