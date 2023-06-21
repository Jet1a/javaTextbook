package LoopLoop;
public class WhileLoop {
    /* ทำศ้ำเรื่อยๆจนกว่าจะเท็จ
     * While
     * For
     * Do..While
     */
    // break โดดออกจากลูป continue หยุดทำแล้วย้อนไปเริ่มใหม่
    public static void main(String[] args) {
        //while(เงื่อนไข){
            //คำสั่งที่ทำซ้ำเมื่อเป็นจริง
        int count = 1;
        while(count <= 10){ // or while(true)
            System.out.println("Round = "+count+" Hello World");
            count++;
            if(count==5){
                break;
            }
        }
    }
}
