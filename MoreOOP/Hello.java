package MoreOOP;

import java.time.LocalDate;

public class Hello {
    public static void main(String[] args) {
        User youngerUser = new User();

        youngerUser.name = "Vinisy Junior";
        youngerUser.birthDay = LocalDate.parse("1995-01-25");

        Book book = new Book("Black Swan","Alice");
        AudioBook dracula = new AudioBook("Dracula","Stolker",30000);

        System.out.println(dracula.toString());

//        youngerUser.borrow(book);

        System.out.printf("%s was born back in %s and he is now %d years old. \n", youngerUser.name, youngerUser.birthDay.toString(),youngerUser.age());

        System.out.printf("%s has borrowed this books : %s \n",youngerUser.name, youngerUser.books.toString());
    }
}
