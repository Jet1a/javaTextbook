package looplopp;
import java.util.Scanner;
public class ControlStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Condition if , Switch..Case
        // if statement (true)
        // if(เงื่อนไข) คำสั่งเมื่อเงื่อนไขเป็นจริง;
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        // and (&&) or (||) not (!) ตรงข้าม
        if(!(age>=10)){
             System.out.println("Crybaby!");
        } 
        else if(age>=15 && age<=39){
            System.out.println("Your are more than a kid!");
        } // else if ถ้าก่อนหน้าเป็นจริงจะจบโปรแกรมเลย
        else if(age>=40 && age<= 89){
            System.out.println("You are an elder now");
        }
        else if(age>=90){
            System.out.println("How you still alive!?");
        // {Else} (if it false)
        }else{
            System.out.println("Outta here kid");
        }
        System.out.println("End");
        
    }
}
