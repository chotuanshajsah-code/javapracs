
import java.util.*;
class Program5_StringTokenizer {
    public static void main(String[] commandArgs) {
        Scanner sourceObj=new Scanner(System.in);
        StringTokenizer textObj=new StringTokenizer(sourceObj.nextLine());
        while(textObj.hasMoreTokens())System.out.print(new StringBuilder(textObj.nextToken()).reverse()+" ");
    }
}
