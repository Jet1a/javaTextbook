package Nonprimative;

public class ArrayForLoop {
    public static void main(String[] args) {
        int[]number={10,20,30,40,50,60,70,80,90,100};
        //for(int i = 0;i<number.length;i++){
        //    System.out.println(number[i]);
        //}
        String[]fruits = {"Apple","Banana","Orange"};
        for(String data : fruits){
            System.out.println(data);
        }
        int sum=0;
        for(int item : number){
            sum += item;
        }
        System.out.println(sum);
    }
}
