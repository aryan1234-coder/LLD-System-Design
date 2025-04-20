import Enum.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {


    HashMap<City, List<Theatre>> cityVsTheatre;
    List<Theatre> theatreList;

    public TheatreController() {
        cityVsTheatre = new HashMap<City, List<Theatre>>();
        theatreList = new ArrayList<Theatre>();
    }

    public void addTheatre(Theatre theatre,City city) {
        theatreList.add(theatre);

        if(cityVsTheatre.containsKey(city)) {
            cityVsTheatre.get(city).add(theatre);
        }
        else{
            List<Theatre> theatres= new ArrayList<>();
            theatres.add(theatre);
            cityVsTheatre.put(city, theatres);

        }

    }

    Map<Theatre,List<Show>> getAllShow(Movie movie,City city) {

        Map<Theatre,List<Show>> thetreVsShow=new HashMap<>();

        List<Theatre> listOfAllTheatre=cityVsTheatre.get(city);

        for(Theatre theatre:listOfAllTheatre){

            List<Show> givenMovieShow=new ArrayList<>();
            List<Show> shows=theatre.getShowList();
            for(Show show:shows){
                if(show.movie.getMovieId()==movie.getMovieId()){
                   givenMovieShow.add(show);
                }
            }
            if(!givenMovieShow.isEmpty()){
                thetreVsShow.put(theatre,givenMovieShow);
            }
        }

        return thetreVsShow;


    }

}
