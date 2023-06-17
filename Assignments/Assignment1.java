package Assignments;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height (cm) : ");
        double height = sc.nextDouble();
        height /= 100;
        System.out.print("Enter your weight (kg) : ");
        double weight = sc.nextDouble();

        double bmi = weight/(height*height);
        System.out.println("Your BMI is : "+bmi);
        String result = "";

        if(bmi>=30){
            result ="Danger Fat";
        }else if(bmi>=25 && bmi<= 29.9){
            result = "Getting Fat";
        }else if(bmi>=23 && bmi<= 24.9){
            result = "Overweight";
        }else if(bmi>=18.5 && bmi<= 22.9){
            result = "Perfect!!";
        }else{
            result = "Under weight";
        }

        System.out.println(result);


    }
    
}
