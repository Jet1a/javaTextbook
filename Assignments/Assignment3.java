package Assignments;
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" The number is even");
        }else{
            System.out.println(num+" The number is odd");

        }
        
    }
    
}
