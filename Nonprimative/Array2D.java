package Nonprimative;

public class Array2D {
    public static void main(String[] args) {
        //ชื่อตัวแปร [เลขแถว][เลขคอลัม]
        String[][]products={
            {"apple","banana"},
            {"orange", "grape"},
            {"papaya", "melon"}
        };
        for(int row = 0;row<products.length;row++){
            for(int column=0;column<products[row].length;column++){
                System.out.println("Line : "+row+" Column : "+column+" Total : "+products[row][column]);
            }
        }

    }
}
