package Nonprimative;
//ชุดคำสั่งเขียนรวมเป็นกลุ่มเพื่อเรียกใช้งาน ลดความซ้ำซ้อน
//ใช้ได้ทุกที แก้ไขได้ภายหลัง ทำให้มีระเบียบและสะดวก
public class Method {
    public static void main(String[] args) {
        //การเรียกใช้งาน
        display();
        sum();
    }
    //Method building
    static void display(){
        //Statement
        System.out.println("Hello World");
    }
    static void sum(){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = a+b+c;
        System.out.println(d);
    }
}
