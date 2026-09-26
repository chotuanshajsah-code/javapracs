
import java.io.*;
import java.util.*;
class Program4_SearchWord {
    public static void main(String[] inputArgs)throws Exception {
        Scanner sourceObj=new Scanner(System.in);
        String word=sourceObj.nextLine();
        Scanner fileObj=new Scanner(new File("JavaFile1.txt"));
        int numberValue=0;
        while(fileObj.hasNext())if(fileObj.next().equalsIgnoreCase(word))numberValue++;
        fileObj.close();
        System.out.println("Occurrences = "+numberValue);
    }
}
