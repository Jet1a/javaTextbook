package FileWriter;
import java.io.*;
    public class FileDemo1 {
    public static void main(String[] args) {
        //File f=new File("Demo.txt");
        try{
            FileWriter writer = new FileWriter(new File("Introduction.txt"));
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Hello Chat\n");
            bw.write("Am Broke");
            // writer.write("Hello World");
            // writer.write("Are you Ok");
            //writer.close();
            bw.close();
            System.out.println("เขียนไฟล์สำเร็จแล้ว!");
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
