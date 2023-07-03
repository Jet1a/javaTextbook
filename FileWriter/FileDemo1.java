import java.io.*;
public class FileDemo1 {
    public static void main(String[] args) {
        File f=new File("Demo.txt");
        try{
            FileWriter writer = new FileWriter(new File("Score.txt"));
            writer.write("Hello World");
            writer.write("Are you Ok");
            writer.close();
            System.out.println("เขียนไฟล์สำเร็จแล้ว!");
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
