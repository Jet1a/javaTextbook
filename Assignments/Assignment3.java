package Assignments;
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        String result = "";
        if(num%2==0){
            result = num+" The number is even";
        }else{
            result = num+" The number is odd";
        }
        //Ternary Operator --> if..else แบบลดรูป
        //ตัวแปร = (เงื่อนไข)  ?     คำสั่งเมื่อเงื่อไขเป็นจริง     :    คำสั่งเมื่อเงื่อนไขเป็นเท็จ
        result = (num%2==0) ? num+" The number is even" : num+" The number is odd";
        System.out.println(result);
    }
    
}
