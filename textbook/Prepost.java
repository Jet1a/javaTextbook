package textbook;

public class Prepost {
    public static void main(String[] args) {
        // ตัวดำเนินการเพิ่มค่า ลดค่า
        // ++a , a++ , --b , b--
        int a=5;
        //เพิ่มก่อนใช้
        System.out.println(a); //5
        System.out.println(++a);//6
        System.out.println(a); //6
        //ใช้ก่อนเพิ่ม
        a=5;
        System.out.println(a); //5
        System.out.println(a++);//5
        System.out.println(a); //6

        int b=5;
        System.out.println(b); //5
        System.out.println(b--);//5
        System.out.println(b); //4
    }
}
