
import java.io.*;
import java.util.*;
class Program1_CreateFile {
    public static void main(String[] inputArgs)throws Exception {
        Scanner sourceObj=new Scanner(System.in);
        FileWriter fileObj=new FileWriter("JavaFile1.txt");
        for(int index=0;index<4;index++)fileObj.write(sourceObj.nextLine()+"\n");
        fileObj.close();
    }
}
