package Nonprimative;

public class VariableArg {
    public static void main(String[] args) {
        summation(5, 5,10,50,70,100,40);
    }
    public static void summation(int a , int b){
        int sum = a+b;
        System.out.println("Sum of "+a+" and " + b +" is : "+sum);
    }
    public static void summation(int a , int b, int c){
        int sum = a+b+c;
        System.out.println("Sum of "+a+" and " + b +" is : "+sum);
    }
    public static void summation(int...number){
        int sum = 0;
        for(int i=0;i<number.length;i++){
            sum += number[i];
        }
        System.out.println("Sum : "+sum);
    }
}
