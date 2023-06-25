package JAVAOOP;
//Inheritance การนิยามคลาสใหม่จากคลาสที่มีอยู่แล้ว
//การสืบทอดคุณสมบัติจากคลาสแม่มาคลาสลูก
/* public class Programmer extends Employee {
    public Programmer(String name,Double salary){
    super(name,salary);
    System.out.println("Skill Coding");
    */
    class Programmer extends Employee{

// Method overloading หน้าที่เหมือนกันแต่ต่างที่พารามีเตอร์
// Method Overriding กำหนดการทำงานให้เมธอดที่สืบทอด มาจากการถ่ายทอดคุณสมบัติ

    //Overloading method
    public void skill(){
        System.out.println("None Skill");
    }
    public void skill(String language){
        System.out.println("Skill : "+language);
    }             //  โยนข้อมูลเท่าไหร่ก็ได้
    public void skill(String...language){
        for(int i=0;i<language.length;i++){
            System.out.println("Skill : "+language[i]+" ");
        }
    }
    //Overriding Method
    public void bonus(){
        System.out.println("Bonus : 30%");
    }
}
