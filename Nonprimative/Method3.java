package Nonprimative;
import java.util.Scanner;
public class Method3 {
    public static void main(String[] args) {
        int [] numberA = {10,20,30,40,50};
        displayArr(numberA);
        displayExt(numberA);
        // for(int i=0;i<numberA.length;i++){
        //     System.out.println("numberA["+i+"]="+numberA[i]);
        // }
        System.out.println("+++++++++++++++++++++++++");
        int [] numberB = {-50,-30,-20,-10,0,100};
        displayArr(numberB);
        displayExt(numberA);
        }
        // for(int i=0;i<numberB.length;i++){
        //      System.out.println("numberB["+i+"]="+numberB[i]);
        // }
    static void displayArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Order = "+i+" Value : "+arr[i]);
        }
    }
    static void displayExt(int [] arr){
        System.out.print("{");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1) System.out.print(",");
        }
        System.out.println("}");
    }
}
