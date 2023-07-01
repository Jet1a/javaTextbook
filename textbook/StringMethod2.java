package textbook;

public class StringMethod2 {
    public static void main(String[] args) {
        String message = "Happy birthday";
        System.out.println("Before : "+message);
        //Replace
        message = message.replace("birthday","today");
        System.out.println("After : "+message);
        //String to Array ต้องสัญลักษณ์
        String fruits = "Mango,Melon,Lime";
        String [] fruit = fruits.split(",");
        System.out.println(fruit[1]);
        //substring(0,-1);
        String name = "Parker";
        String word = name.substring(0,4);
        System.out.print(word);

        char [] alphabet = name.toCharArray();
        System.out.println(alphabet[1]);
        //Array char to String
        String result = String.copyValueOf(alphabet);
        System.out.println(result);
        //Delete Space Blank
        name = name.trim();
        System.out.println(name.length());
        //แปลง Int > String
        int number = 100;
        String sum = String.valueOf(number);
    }
}
