
import java.util.*;
class Program3_String {
    public static void main(String[] commandArgs) {
        Scanner sourceObj=new Scanner(System.in);
        int numberValue=sourceObj.nextInt();
        sourceObj.nextLine();
        String[] valueA=new String[numberValue];
        for(int index=0;index<numberValue;index++)valueA[index]=sourceObj.nextLine();
        Arrays.sort(valueA);
        for(String inputArgs:valueA)System.out.println(inputArgs);
        String inputArgs=sourceObj.nextLine();
        int words=inputArgs.trim().isEmpty()?0:inputArgs.trim().split("\\s+").length;
        System.out.println("Words = "+words);
        System.out.println("Characters = "+inputArgs.length());
    }
}
