package Project;
import java.util.Scanner;
public class MinmaxLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0, min=Integer.MAX_VALUE;
        while(true){
            System.out.print("Enter number : ");
            int number=sc.nextInt();
            if(number<0)break;
            if(number>max) max=number;
            if(number<min) min=number;
        }
        System.out.println("Max Value : "+max);
        System.out.println("Min Value : "+min);
    }
}
