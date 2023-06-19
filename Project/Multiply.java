package Project;
import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter begining number : ");
        int start = sc.nextInt();
        System.out.print("Enter ended number : ");
        int end = sc.nextInt();
        System.out.println("****************");
        for(int m=start;m<=end;m++){
            System.out.println("Round "+ m);
            for(int x = 1;x<=12;x++){
                System.out.println(m+" x " +x+" = "+(m*x));
            }
        }  
    }
}
