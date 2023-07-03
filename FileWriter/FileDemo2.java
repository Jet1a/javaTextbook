package FileWriter;
import java.io.*;
class FileDemo2{
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(new File("Score.txt"));
            BufferedReader br = new BufferedReader(reader);
            String message = "";
            while((message = br.readLine())!=null){
                System.out.println(message);
            }
            // int data;
            // while((data=reader.read()) !=-1){
            //     System.out.printf("%c\n",data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // } catch (FileNotFoundException e){
        //     System.out.println("File not found");
        // }
    }
}