package textbook;
/* Widening Casting --> (Auto)
แปลงจากข้อมูลขนาดเล็กไปใหญ่
ิbyte -> short -> char -> int -> long -> float -> double
Narrowing Casting
แปลงข้อมูลจากใหญ่ไปเล็ก
double -> float -> long -> int -> char -> short -> byte
*/ 

public class TypeCasting {
    public static void main(String[] args) {
        float numFloat = 3.14f;
        int numInt = (int)numFloat;
        System.out.println(numInt);

        /* เปลี่ยนจากใหญ่มาเล็กต้องทำเอง กำหนด type
         double numDouble = 10.0;
         int numInt = (int)numDouble;
        */
    }
}
    
