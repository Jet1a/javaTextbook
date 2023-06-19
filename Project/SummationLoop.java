package Project;
import java.util.Scanner;
public class SummationLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number : ");
        int a=sc.nextInt();
        System.out.print("Enter ended number : ");
        int b=sc.nextInt();
        System.out.println("-----------------");
        int sum = 0;
        while(a<=b){
            if(a<0)break;
            sum+=a;
            a++;
        }
        System.out.println("Total : "+sum);
        System.out.println("===================");
        int count = 0;
        int total = 0;
        while(true){
            System.out.print("Enter number = ");
            int number=sc.nextInt();
            if(number<0)break;
            count++;
            total+=number;
        }
        System.out.println("Total : "+total);
        System.out.println("Total Count : "+ count);
        System.out.println("Percentage : "+ (total/count));

    }

}
