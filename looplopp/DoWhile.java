package looplopp;
public class DoWhile {
    public static void main(String[] args) {
        // do {
            //คำสั่งเมื่อเป็นจริง
        //while(เงื่อนไข)ว
        int count = 0;
        do{
            System.out.println(count);
            count++;
        }while(count<=5);
        
        for(int k = 1;k<=3;k++){
            System.out.print("Round "+k);
            //loop ใน
            for(int j = 1;j<=5;j++){
                System.out.println(" Round = "+j);
            }
        }
    }
}
