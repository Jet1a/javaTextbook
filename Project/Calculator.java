package Project;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("-- Welcome to Calculator --");
        System.out.println("-- Enter your number --");
        System.out.print("First number:\t");
        float a = input.nextFloat();
        System.out.print("Second number:\t");
        float b = input.nextFloat();
        System.out.println("------ OPERATION ------");
        System.out.println("(1) - Addition");
        System.out.println("(2) - Subtraction");
        System.out.println("(3) - Multiply");
        System.out.println("(4) - Divided");
        System.out.print("Please enter your selection:\t");
        int select = input.nextInt(); 
        if(select == 1){
            double resultAdd=a+b;
            System.out.println("Result: "+resultAdd);
        }else if(select == 2){
            double resultSub=a-b;
            System.out.println("Result: "+resultSub);
        }else if(select == 3){
            double resultMul=a*b;
            System.out.println("Result: "+resultMul);
        }else if(select == 4){
            double resultDiv=a/b;
            System.out.println("Result: "+resultDiv);
        }else{
            System.out.println("Invalid Selection!");
        }
        System.out.println("----- End of Program -----");
    }
}
