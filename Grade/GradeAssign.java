package Grade;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class GradeAssign {
    public static void main(String[] args) {
        PrintWriter output = null;
        try {
            Scanner input = new Scanner(new File("Grade/Grade.txt"));
            output = new PrintWriter(new File("Grade/Score.txt"));
            String n1 = "";
            while(input.hasNext()){
                n1 = input.nextLine();   
                int pos = n1.indexOf(" ");
                String grade = n1.substring(pos,n1.length());       
                grade = grade.trim();
                //System.out.println(grade);
                double score = Double.parseDouble(grade);
                
                if(score>50){
                    grade = "A";
                    }else if (score>40){
                    grade = "B";
                    }else if (score>30){
                    grade = "C";
                    }else if (score>20){
                    grade = "D";     
                    }else grade = "E";
                    //System.out.println("Score : "+score+" Grade : "+grade);
                    output.println(n1+" "+grade);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            output.close();
    }
}
