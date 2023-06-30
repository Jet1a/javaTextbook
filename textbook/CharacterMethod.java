package textbook;

public class CharacterMethod {
    public static void main(String[] args) {
        // char alphabet = 'A';
        // char [] group={'A','B','C','ฟ'};
        Character alphabet = new Character('A');
        char c = 'b';
        // Chech Character (true,false)
        System.out.println(Character.isLetter(alphabet));
        System.out.println(Character.isDigit(c));

        if(Character.isUpperCase(c)){
            System.out.print("Upper case");
        }else System.out.println("Lower Case");

        System.out.println(Character.toLowerCase(alphabet));
    }
}
