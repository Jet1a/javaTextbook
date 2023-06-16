package textbook;
public class TypeTest {
    public static void main(String[] args) {
        Integer a = 1;
        float b = 3.14f;
        double c ;
        boolean d;
        char e;
        String f = "Hello Type";
        double g = b;
        //output true,false
        boolean result = a.toString() instanceof String; //instanceof ทำงานร้วมกับ คลาสเท่านั้น
        boolean results = a instanceof Integer;
        System.out.println(result);
        System.out.println(results);
        System.out.println(g);
    }
}
