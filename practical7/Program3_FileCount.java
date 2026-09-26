
import java.io.*;
class Program3_FileCount {
    public static void main(String[] inputArgs)throws Exception {
        BufferedReader valueB=new BufferedReader(new FileReader("JavaFile1.txt"));
        int lineNo=0,wordValue=0,valueC=0;
        String sourceObj;
        while((sourceObj=valueB.readLine())!=null) {
            lineNo++;
            valueC+=sourceObj.length();
            if(!sourceObj.trim().isEmpty())wordValue+=sourceObj.trim().split("\\s+").length;
        }
        valueB.close();
        System.out.println("Lines = "+lineNo);
        System.out.println("Words = "+wordValue);
        System.out.println("Characters = "+valueC);
    }
}
