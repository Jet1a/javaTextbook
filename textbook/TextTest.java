package textbook;
public class TextTest {
    /*
     String = Group of word
     Symbol = ""
     Char = Single Letter
     Symbol = ''
     char mix = String
     */
    public static void main(String[] args) {
        String a = "100", b = "3.14";
        int c;
        // String => int
        c = Integer.parseInt(a); //can replace a as "100"
        c = c + 50;
        System.out.println(a);
        System.out.println(c);
        // String => Double
        double d = Double.parseDouble(b);
        d = d + 3.55;
        System.out.println(d);
        // Integer => String
        int num1 = 100;
        String age = String.valueOf(num1); //เช็คค่าที่โยนมาเป็นตัวเลขหรืออื่นๆ
        System.out.println(age);
    }
}
