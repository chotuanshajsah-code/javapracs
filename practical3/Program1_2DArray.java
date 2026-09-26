
import java.util.*;
class Program1_2DArray {
    public static void main(String[] commandArgs) {
        Scanner sourceObj=new Scanner(System.in);
        int resultValue=sourceObj.nextInt(),valueC=sourceObj.nextInt();
        int[][] valueA=new int[resultValue][valueC];
        for(int index=0;index<resultValue;index++)for(int innerIndex=0;innerIndex<valueC;innerIndex++)valueA[index][innerIndex]=sourceObj.nextInt();
        System.out.println("Transpose:");
        for(int innerIndex=0;innerIndex<valueC;innerIndex++) {
            for(int index=0;index<resultValue;index++)System.out.print(valueA[index][innerIndex]+" ");
            System.out.println();
        }
        int prod=1;
        for(int index=0;index<Math.min(resultValue,valueC);index++)prod*=valueA[index][index];
        System.out.println("Diagonal product = "+prod);
        int totalValue=0;
        for(int[] row:valueA)for(int inputArgs:row)if(inputArgs%10==4)totalValue+=inputArgs;
        System.out.println("Sum ending with 4 = "+totalValue);
        System.out.println("Upper diagonal:");
        for(int index=0;index<resultValue;index++) {
            for(int innerIndex=0;innerIndex<valueC;innerIndex++)System.out.print(innerIndex>=index?valueA[index][innerIndex]+" ":" ");
            System.out.println();
        }
        System.out.println("Lower diagonal:");
        for(int index=0;index<resultValue;index++) {
            for(int innerIndex=0;innerIndex<valueC;innerIndex++)System.out.print(innerIndex<=index?valueA[index][innerIndex]+" ":" ");
            System.out.println();
        }
        int[] inputArgs=new int[resultValue*valueC];
        int buttonObj=0;
        for(int[] row:valueA)for(int valueZ:row)inputArgs[buttonObj++]=valueZ;
        Arrays.sort(inputArgs);
        System.out.print("Sorted: ");
        for(int valueZ:inputArgs)System.out.print(valueZ+" ");
    }
}
