package textbook;
/* การสร้างตัวแปร
ประกอบด้วยตัวเลจ ตัวอักษร เครื่องหมาย
อักษรแรกห้างขึ้นต้นด้วยตัวเลขกับอักษรพิเศษยกเว้น _
ห้ามซ้ำคำสงวน
Case Sensitive
*/
public class Variable {
    public static void main(String[] args) {
        //นิยามตัวแปรไม่ระยุค่าเริ่มต้น
        int number1;
        float number2;
        double number3;
        boolean status;
        char alphabet;
        //นิยามตัวแปรระยุค่าเริ่มต้น
        int number = 10;
        int num2 = 20;
        num2 = 69;
        System.out.println("Your number is: "+number);
        System.out.println(num2);
        float count = 20.5f; //float
        char d = 'A';
        boolean s=true;
        //นิยามหลายบรรทัด
        int a=0,b=1;
        //นิยามค่าคงที่ เปลี่ยนแปลงไม่ได้ ตัวพิมพ์ใหญ่ทั้งหมด!!!!
        final int NS = 200;
        //Global,Local Variable
        {
            int c = 300; //ทำงานแค่ในขอบเขตนี้ Local
            System.out.println(c);
            System.out.println("A = " + a);
        }
        //ค่าต่ำสุด สูงสุด
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
    }
}
