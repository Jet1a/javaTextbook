package Assignments;
import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        String result = "";
        result = (year>2023) ? (year - 543) + " A.D" : (year + 543) + " B.E";
        System.out.println(result);
    }
    
}
