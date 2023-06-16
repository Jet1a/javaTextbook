package textbook;
public class Compound {
    public static void main(String[] args) {
        int x = 10 , y = 5;
        x += y;
        System.out.println(x);
        y -= x;
        System.out.println(y);

        /*
        ลำดับความสำคัญตัวดำเนินการ
        --------->
        ()
        ++,--
        *,/,%
        +,-
        <,<=,>,>=
        ==.!=
        &&
        ||
        %=,/=,*=,-=,+=,=
        */
        
        float f = 5+8*9;
        System.out.println(f);
        int h = 5*2 - 40/5;
        System.out.println(h);
    }
}
