
import java.awt.*;
class Program6_Calculator extends Frame {
    Program6_Calculator() {
        setTitle("Calculator");
        setLayout(new BorderLayout());
        add(new TextField("0"),BorderLayout.NORTH);
        Panel panelObj=new Panel(new GridLayout(4,4));
        String[] valueA= {
            "7","8","9","/","4","5","6","*","1","2","3","-","0",".","+","="
        }
        ;
        for(String sourceObj:valueA)panelObj.add(new Button(sourceObj));
        add(panelObj);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] inputArgs) {
        new Program6_Calculator();
    }
}
