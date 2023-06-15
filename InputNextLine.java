import java.util.Scanner;
public class InputNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        // String name = sc.next(); ไม่อ่านค่าว่าง
        System.out.println("Your name is : "+name);
        // Escape
        /*
            \n = new line
            \t = tab
        */
        System.out.println("Hello\nWorld");
    }
}
