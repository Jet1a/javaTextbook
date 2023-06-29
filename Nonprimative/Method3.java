package Nonprimative;
import java.util.Scanner;
public class Method3 {
    public static void main(String[] args) {
        int [] numberA = {10,20,30,40,50};
        displayArr(numberA);
        // int [] numberC = copyArray(numberA);
        // displayArr(numberC);
        System.out.println("Search : "+searchElement(numberA, 60));
       
        // displayExt(numberA);
        // System.out.println("Max Value : "+ findMaxInArray(numberA));
        // System.out.println("Max Index : "+ findMaxIndex(numberA));
        // for(int i=0;i<numberA.length;i++){
        //     System.out.println("numberA["+i+"]="+numberA[i]);
        // }
        System.out.println("+++++++++++++++++++++++++");
        int [] numberB = {-50,-30,-20,-10,0,100};
        System.out.println("Compare Array : "+ compareArray(numberA, numberB));
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

    static int findMaxInArray(int [] arr){
        //find most value in Array
        int maxValue = arr[0];
        for(int i=0;i<arr.length;i++){
            if(maxValue<arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    static int findMaxIndex(int [] arr){
        int maxIndex = arr[0];
        for (int index = 0 ;index < arr.length;index++) {
            if (maxIndex < arr[index]) {
                maxIndex = index+1;
            }
        }
        return maxIndex;
    }
    static boolean compareArray(int [] a, int [] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++){
            if(b[i]!=a[i]){
                return false;
            }
        }
        return true;
    }
    static void swapElement(int [] a, int x , int y){
        int temp = a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static int [] copyArray(int [] a){
        int[] newArr =new int [a.length];
        for(int i=0;i<a.length;i++){
            newArr[i]=a[i];
        }
        return newArr;
    }
    static int searchElement(int [] arr , int number){
        for(int i=0;i<arr.length;i++){
            if(number==arr[i]){
                return i+1;
            }
        }
        return -1;
    }
}
