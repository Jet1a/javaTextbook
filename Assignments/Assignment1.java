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

    }
    
}
