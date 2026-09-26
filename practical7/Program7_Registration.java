
import java.awt.*;
class Program7_Registration extends Frame {
    Program7_Registration() {
        setTitle("Registration Form");
        setLayout(new FlowLayout());
        add(new Label("Name"));
        add(new TextField(20));
        add(new Label("Father Name"));
        add(new TextField(20));
        add(new Label("Age"));
        add(new TextField(10));
        add(new Label("Gender"));
        CheckboxGroup groupObj=new CheckboxGroup();
        add(new Checkbox("Male",groupObj,true));
        add(new Checkbox("Female",groupObj,false));
        add(new Label("Course"));
        Choice valueC=new Choice();
        valueC.add("Java");
        valueC.add("Python");
        add(valueC);
        add(new Label("Hobbies"));
        add(new Checkbox("Drawing"));
        add(new Checkbox("Singing"));
        add(new Checkbox("Music"));
        add(new Checkbox("Others"));
        add(new Label("Address"));
        add(new TextArea(5,20));
        setSize(500,450);
        setVisible(true);
    }
    public static void main(String[] inputArgs) {
        new Program7_Registration();
    }
}
