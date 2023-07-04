package Assignments;
import java.lang.Math;
public class MathDemo {
    public static void main(String[] args) {
        //
        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        // int r = 2;
        // double area = Math.PI * r*r;
        // System.out.println(area);

        int number = -30;
        System.out.println("Absolute : "+Math.abs(number));

        double number1 = 14.4;
        System.out.println("ปัดขึ้น : "+Math.ceil(number1));
        System.out.println("ปัดลง : " + Math.floor(number1));
        // > .5 ขึ้น , < .5 ลง
        System.out.println("ปัดลง : " + Math.rint(number1));
        // > .5 ขึ้น , < .4 ลง
        System.out.println("ปัดลง : " + Math.round(number1));
        //Square Root
        System.out.println(Math.sqrt(4));
        //Exponent
        Math.pow(5, 3);
    }
}
