import java.util.Scanner;
public class InputTutorial {
    public static void main(String[] args) {
        // รับค่าข้อมูล
        // ข้อมูลแบบไหนบ้าง ตัวเลข ข้อความ
        // ข้อความตัวเลข -> ตำนวณได้ ไม่ได้

        // ประกาศใช้งานคลาส        รับข้อมูล
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word : ");
        String name = sc.nextLine();// รับค่า String จากแป้นพิมพ์
        System.out.print("Enter Year = ");
        int year = sc.nextInt();//รับค่า Int จากแป้นพิมพ์
        int age = 2023 - year;
        System.out.print("Your year : "+year);
        System.out.print(" Your age : "+age);
        System.out.println(" Your word : "+name);
    } 
}
