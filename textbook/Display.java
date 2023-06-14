package textbook;
/*
--- Variable ---

ชื่อคลาส ชื่อไฟล์ ต้องเหมือนกัน
ชื่อคลาสต้องเป็นตัวพิมพ์ใหญ่ MyClass,Hello
ตัวแปรต้องเป็นตัวพิมพ์เล็ก age,number
ค่าคงที่ ต้องพิมพ์ใหญ่หมด SIZE,WEIGHT

--- Data Type ---

--> Primitive Data Types
> Integer (byte,short,int,long) 8 > 16 > 32 > 64 bit
> Floating-Point (float,double) 32 > 64 ((Decimal))
> Character (char) ได้แค่หนึ่งตัวอักษร 16 bit
> Boolean (boolean) 8 bit
--> Non-primitive Data Types

*/

public class Display{
    
    public static void main(String[] args) {

        System.out.println("Hello Test");
        System.out.println("Welcome to hell");
        //output จะเอ๋ตัวเอง
        /*
        Many line comment
        Hello Test
        Welcome to hell
        */ 

        System.out.print("Hello Test");
        System.out.println("Welcome to hell");
        //output 
        // Hello TestWelcome to hell
    }
}