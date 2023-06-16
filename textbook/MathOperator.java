package textbook;
import java.util.Scanner;
public class MathOperator {
    //Operator(symbol) & Operand(variable)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        int a = 10;
        int b = 50;
        System.out.println("num1 + num2 : " + (num1+num2));
        System.out.println("a + b : " + (a+b));
        System.out.println("a % b : " + (b%a));

    }
}
