
import java.io.*;
class Program2_CopyFile {
    public static void main(String[] inputArgs)throws Exception {
        FileInputStream valueA=new FileInputStream("JavaFile1.txt");
        FileOutputStream valueB=new FileOutputStream("JavaFile2.txt");
        int valueC;
        while((valueC=valueA.read())!=-1)valueB.write(valueC);
        valueA.close();
        valueB.close();
    }
}
