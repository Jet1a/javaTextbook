package textbook;

public class StingMethod {
    public static void main(String[] args) {
        String str = "Hello";
        String city = new String("Vegas");


        //Concatenation = > ต่อ String
        System.out.println(str+" "+city);
        System.out.println(city.concat("Sony"));
        //Length
        int len=city.length();
        System.out.println(len);    
        //Position
        System.out.println(city.charAt(3));
        //Check char
        boolean result = str.equals(city);
        System.out.println(result);
        boolean results = str.equalsIgnoreCase(city);
        System.out.println(results);
        //Startwith // Endwith
        String name = "Peter Parker";
        boolean resultName = name.startsWith("Peter");
        if (resultName){
            System.out.println("True");
        }else System.out.println("False");
        //หาตำแหน่งคำ
        System.out.println(name.indexOf("Parker"));
    }
}
