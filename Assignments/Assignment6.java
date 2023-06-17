package Assignments;
import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.print("Enter Temperature (Fahrenheit) : ");
        float frh = kb.nextFloat();
        float cel = (frh-32)*5/9;
        System.out.println(frh+" Fahrenheit = "+cel+" Celsius" );
    }
}
