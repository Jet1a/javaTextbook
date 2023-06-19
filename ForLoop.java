public class ForLoop {
    //For Loop(int i = 1;i<=10;i++){
    //คำสั่งเมื่อเงื่อนไขเป็นจริง;
    public static void main(String[] args) {
        // for((ตัวแปรเริ่มต้น;เงื่อนไข;การเพิ่มค่า / ลดค่า){
        for(int count=1;count<=10;count++){
            System.out.println("Hello World");
            if(count>5) break;
        }
        for(int n=100;n>=10;n--){
            System.out.println(n);
            if(n==50) break;
        }
    }
}
