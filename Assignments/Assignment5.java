package Assignments;
import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value : ");
        int cash = sc.nextInt();
        if(cash >= 1000){
            System.out.println((cash/1000)+" Bank of 1000 Cash");
            cash%=1000;
        }
        if(cash >= 500){
            System.out.println((cash/500)+" Bank of 500 Cash");
            cash%=500;
        }
        if(cash >= 100){
            System.out.println((cash/100)+" Bank of 100 Cash");
            cash%=100;
        }
        if(cash >= 50){
            System.out.println((cash/50)+" Bank of 50 Cash");
            cash%=50;
        }
        if(cash >= 20){
            System.out.println((cash/20)+" Bank of 20 Cash");
            cash%=20;
            System.out.println("Left cash"+cash);
        }
    }   
}
