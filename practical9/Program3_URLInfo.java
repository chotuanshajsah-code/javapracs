
import java.net.*;
import java.util.*;
class Program3_URLInfo {
    public static void main(String[] inputArgs)throws Exception {
        Scanner sourceObj=new Scanner(System.in);
        URL urlObj=new URL(sourceObj.nextLine());
        System.out.println(urlObj.getProtocol());
        System.out.println(urlObj.getHost());
        System.out.println(urlObj.getPort());
        System.out.println(urlObj.getPath());
        System.out.println(urlObj.getFile());
    }
}
