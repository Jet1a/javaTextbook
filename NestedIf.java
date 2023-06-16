import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age<=15){
            System.out.println("Amatuer");
            if(age==15){
                System.out.println("Grade 9");
            }
            if(age==14){
                System.out.println("Grade 8");
            }else{
                System.out.println("Nursery");
            }
        }else{
            System.out.println("Senior");
        }
        
    }
}
