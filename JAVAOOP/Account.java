package JAVAOOP;
// Method overloading หน้าที่เหมือนกันแต่ต่างที่พารามีเตอร์
// Method Overriding กำหนดการทำงานให้เมธอดที่สืบทอด มาจากการถ่ายทอดคุณสมบัติ
public class Account extends Employee {
    public Account(String name,Double salary){
        super(name,salary);
        System.out.println("I am Accounting");
    }
}
