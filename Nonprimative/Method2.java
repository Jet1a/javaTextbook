package Nonprimative;
import java.util.Scanner;
public class Method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int result = MaxNumber(10, 5);
        System.out.println("Maxnumber : "+result);
    }

    static int MaxNumber(int a, int b){
        int max = 0;
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}
