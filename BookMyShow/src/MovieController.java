import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import Enum.City;

public class MovieController {


    HashMap<City, List<Movie>> movieList;
    List<Movie> allMovies;

    MovieController() {
        movieList = new HashMap<City, List<Movie>>();
        allMovies = new ArrayList<Movie>();
    }

    void addMovie(Movie movie,City city) {
        allMovies.add(movie);

        if(movieList.containsKey(city)){
                movieList.get(city).add(movie);
        }
        else{
            List<Movie> newList= new ArrayList<>();
            newList.add(movie);
            movieList.put(city, newList);

        }


    }
    Movie getMovieByName(String name){

        for(Movie movie:allMovies){
            if(movie.getMovieTitle().equals(name)){
                return movie;
            }
        }
        return null;
    }
    List<Movie> getMoviesByCity(City city){
        return movieList.get(city);
    }
}
