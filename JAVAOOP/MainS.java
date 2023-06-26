package JAVAOOP;
//interface มีหลักการคล้ายกับ abstract class 
//เพื่อกำหนดโครงสร้างของเมธอด โดยไม่กำหนดการทำงานลงไป
public class MainS {
    /*public static void main(String[] args) {
        Person p1 = new Person();
        p1.Register();
    */
    public static void main(String[] args) {
        Ironman i1 = new Ironman();
        i1.setName("Ironman");
        i1.setAge("50");
        i1.skill("Rich");
        i1.displayHero();

        Spidey sp = new Spidey();
        sp.setName("Spider");
        sp.setAge("18");
        sp.weapon("Web");
    }
}
