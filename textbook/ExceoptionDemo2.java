package textbook;

import java.util.Scanner;

public class ExceoptionDemo2 {
    public static void main(String[] args) {
        //Finally คือใช้แล้วยังทำงานต่อได้
    //     try{
    //         Scanner sc = new Scanner(System.in);
    //         System.out.print("Enter Number : ");
    //         int number = sc.nextInt();
    //         System.out.println(number);
    //     }catch(Exception e){
    //         e.printStackTrace();
    //     }finally{
    //         //Other cmd
    //         System.out.println("Continue");
    //     }
    // }
        try{
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Number : ");
         int number = sc.nextInt();
         if(number<0){
            throw new Exception("Must be more than zero");
        } 
        System.out.println(number);

        } catch(Exception e){
            e.printStackTrace();
        }
    
    }
}
