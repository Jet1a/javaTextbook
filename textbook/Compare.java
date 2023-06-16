package textbook;
public class Compare {
    public static void main(String[] args) {
        // true/flase
        int a=10,b=5;
        boolean c=(a==b);
        System.out.println(c);
        System.out.println(a+" is it = "+b+" ? is = "+(a==b));
        System.out.println(a!=b);
        // &&   ||   !
        // and  or  not
        // t,t  t,f  opposite
        int d=10,e=20;
        boolean f = (a==b); //false
        boolean g = (a<b); // true
        System.out.println((d&e));
        System.out.println((a==b) && (a<=b)); //flase
        //                    F         T
        System.out.println((a==b) || (a<=b)); //true
        //                 T   F
        System.out.println(!(a==b)); // ทำให้ตรงข้าม true

    }
}
