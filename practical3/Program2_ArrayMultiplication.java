
import java.util.*;
class Program2_ArrayMultiplication {
    public static void main(String[] commandArgs) {
        Scanner sourceObj=new Scanner(System.in);
        int[][] valueA=new int[2][2],valueB=new int[2][2],valueC=new int[2][2];
        for(int index=0;index<2;index++)for(int innerIndex=0;innerIndex<2;innerIndex++)valueA[index][innerIndex]=sourceObj.nextInt();
        for(int index=0;index<2;index++)for(int innerIndex=0;innerIndex<2;innerIndex++)valueB[index][innerIndex]=sourceObj.nextInt();
        for(int index=0;index<2;index++)for(int innerIndex=0;innerIndex<2;innerIndex++)for(int buttonObj=0;buttonObj<2;buttonObj++)valueC[index][innerIndex]+=valueA[index][buttonObj]*valueB[buttonObj][innerIndex];
        for(int index=0;index<2;index++) {
            for(int innerIndex=0;innerIndex<2;innerIndex++)System.out.print(valueC[index][innerIndex]+" ");
            System.out.println();
        }
    }
}
