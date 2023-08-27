package Movie;

import java.util.Arrays;

public class MovieList {
    private Movie[] movielist;
    private int numberOfStories;

    public MovieList(int capacity) {
        this.movielist = new Movie[capacity];
        this.numberOfStories = 0;
    }

    public int getNumberOfStories() {
        return numberOfStories;
    }

    public boolean isAvailable(){
        if (numberOfStories < movielist.length){
            return true;
        }else
            return false;
    }

    public boolean addMovie(String title, double hours, int grade){
        if (numberOfStories < movielist.length) {
            movielist[numberOfStories] = new Movie(title, hours, grade);
            numberOfStories++;
            return true;
        } else {
            System.out.println("Movie list is full. Cannot add more movies.");
            return false;
        }
    }

    public Movie getMovieAt(int slot){
        if ((slot >= 1) && (slot <= numberOfStories)) {
            return movielist[slot - 1];
        }else{
            return null;
        }
    }
    public boolean resize(int size){
        if (size > numberOfStories){
            Movie[] newMovielist = new Movie[size];
            movielist = newMovielist;
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        return "MovieList [movielist=" + Arrays.toString(movielist) + "]";
    }

    // public Movie searchForMovieTitle(String title){
    // }
    
    
}
