package LoopLoop;
import java.util.Scanner;
public class SwitchCase {
    /*
     * switch(สื่งที่ต้องการตรวจสอบ){
     * 
     *  case ค่าที่ 1 : คำสั่งที่ 1;
     *       break;
     *  case ค่าที่ 2 : คำสั่งที่ 2;
     *       break;
     *      ......
     * case ค่าที่ N : คำสั่งที่ N;
     *       break;
     * default : คำสั่งเมื่อไม่มีค่าที่ตรงกับที่ระบุในc case
     * }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number : ");
        int month = sc.nextInt();
        String name;
        // if(month==1){
        //    System.out.println("Jan");
        //}else if(month == 2){
        //    System.out.println("Feb");
        //}else if(month == 3){
        //    System.out.println("Mar");
        //}else{
        //    System.out.print("Other Month");
        //}
        switch(month){
            case 1:
                name = "January";
                break;
            case 2:
                name = "Feburary";
                break;
            case 3:
                name = "Mar";
                break;
            default:
                name = "Other";
                break;
        }
        System.out.println(name);
    }
}
