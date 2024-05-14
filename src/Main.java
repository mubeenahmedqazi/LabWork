import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies=new ArrayList<>();
        System.out.println(movies.isEmpty());
        System.out.println(movies.size());
        movies.add(new Movie("Movie 1",2024,6));
        movies.add(new Movie("Movie 2",2024,6));
        movies.add(new Movie("Movie 3",2024,6));
        System.out.println(movies.size());
        for(Movie temp:movies){
            System.out.println(temp);
        }
        movies.remove(new Movie("Movie 2",2024,6));
        System.out.println();
        for(Movie temp:movies){
            System.out.println(temp);
            movies.set(1,new Movie("Movie 4",2024,6));

        }
        for(Movie temp:movies){
            temp.setRating(temp.getRating()+1);
            System.out.println(temp);
        }
        System.out.println(movies.indexOf(new Movie("Movie 4",2024,6)));
    }
}
