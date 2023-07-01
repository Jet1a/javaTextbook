package textbook;
import java.util.Scanner;
public class ExceptionDemo {

    public static void main(String[] args) {
        //Try...Catch try{
            //cmd
        //}catch(Exception e){
            //when cmd = false

        try{

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number : ");
            int number = sc.nextInt();
            System.out.println(number);

            int a = 10 , b = 2;
            int c = a/b;
            System.out.println(c);

            int [] item = {10,20,30};
            System.out.println(item[4]);

        } catch (ArithmeticException e){
            System.out.println("It zero");
                    //เฉพาะIndex
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Incorrect Index");
                //แบบไม่รนะบุกรณี
        } catch (Exception e){
            System.out.println("Please Enter only number");
        }


    }
}
