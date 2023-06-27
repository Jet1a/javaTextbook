package Nonprimative;
import java.util.Scanner;
//ชุดคำสั่งเขียนรวมเป็นกลุ่มเพื่อเรียกใช้งาน ลดความซ้ำซ้อน
//ใช้ได้ทุกที แก้ไขได้ภายหลัง ทำให้มีระเบียบและสะดวก
public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //การเรียกใช้งาน   Argument โปรแกรมหลัก
    //     display("lnwza");
    //     fullName("Omega","Century");
    //     plus(1, 69);
    // }
    // //Method building         parameter
    // static void display(String message){
    //     //Statement
    //     System.out.println(message);
    // }
    // static void fullName(String firstn , String lastn){
    //     System.out.println("Firstname : "+firstn+"\nLastname : "+lastn);
    // }
    // static void plus(int first,int second){
    //     int c = first+second;
    //     System.out.println(c);
    // }
        System.out.print("Enter your salary : ");
        double salary = sc.nextDouble();
        System.out.println("Salary : "+salary);
        double bonus = getBonus();
        System.out.println("Salary w Bonus : "+(salary+bonus));
        String myIp = getIP();
        System.out.println(myIp);
    }
    // modifier ชนิดข้อมูลที่จะส่งออกมาทำงานในโปรแกรมหลัก ชื่อเมธอด(){}
    // ถ้ามี void จะไม่มี return ค่ากลับไป
    static String getIP(){
        return "127.0.0.1";
    }
    static Double getBonus(){
        return 2500.50;
    }
}
    
