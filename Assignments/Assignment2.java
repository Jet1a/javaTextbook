package Assignments;
import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number : ");
        int num2 = sc.nextInt();
        if(num1<num2){
            System.out.println(num1+" is less than "+num2);
        }else if(num1==num2){
            System.out.println(num1+" is equal to "+num2);
        }else{
            System.out.println(num1+" is greater than "+num2);

        }

        
    }
}
