package Project;
import java.util.Scanner;
public class ModLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter number : ");
            int number=sc.nextInt();
            if(number<0)break;
            if(number%2==0) System.out.println(number + " is even");
            else System.out.println(number+" is odd");
            System.out.println("----------------------");
        }

    }
}
