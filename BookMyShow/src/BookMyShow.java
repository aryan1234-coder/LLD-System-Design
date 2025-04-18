import Enum.City;
import Enum.SeatCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {

    TheatreController theatreController;
    MovieController movieController;


     BookMyShow() {

        theatreController = new TheatreController();
        movieController = new MovieController();

    }

    private void createBooking(City userCity,String movieTitle) {
         List<Movie> movies=movieController.getMoviesByCity(userCity);

         Movie interestedMovie=null;
         for(Movie movie:movies){
             if((movie.getMovieTitle().equals(movieTitle))){
                 interestedMovie=movie;
             }
         }

         Map<Theatre,List<Show>> showTheatreWise=theatreController.getAllShow(interestedMovie,userCity);



    }

    private void inialtize(){
         // create movies
        // create theatre

        createMovies();
        createTheatre();

    }

    private void createTheatre(){
         Movie avenger=movieController.getMovieByName("AVENGERS THE END GAME");
         Movie drama=movieController.getMovieByName("DRAMAS THE END GAME");

         Theatre inoxTheatre=new Theatre();
         inoxTheatre.setTheatreId(1);
         inoxTheatre.setCity(City.Bangalore);
         inoxTheatre.setScreenList(createScreen());
         List<Show> inoxShow=new ArrayList<>();

         Show inoxMorningShow=createShow(1,inoxTheatre.getScreenList().get(0),avenger,8);
         Show inoxEveningShow=createShow(2,inoxTheatre.getScreenList().get(0),drama,12);

         inoxShow.add(inoxEveningShow);
         inoxShow.add(inoxMorningShow);
         inoxTheatre.setShowList(inoxShow);

         Theatre pvrTheatre=new Theatre();
         pvrTheatre.setTheatreId(2);
         pvrTheatre.setCity(City.Delhi);
         pvrTheatre.setScreenList(createScreen());
         List<Show> pvrShow=new ArrayList<>();
         Show pvrShowMorning= createShow(3,pvrTheatre.getScreenList().get(0),avenger,16);
         Show pvrShowEvening=createShow(4,pvrTheatre.getScreenList().get(0),drama,12);

         pvrShow.add(pvrShowMorning);
         pvrShow.add(pvrShowEvening);
         pvrTheatre.setShowList(pvrShow);

         theatreController.addTheatre(inoxTheatre,City.Bangalore);
         theatreController.addTheatre(pvrTheatre,City.Delhi);

    }

    private Show createShow(int showId,Screen screen,Movie movie,int showStartTime) {
         Show show=new Show();
         show.setShowId(showId);
         show.setScreen(screen);
         show.setMovie(movie);
         show.setShowStartTime(showStartTime);

         return show;

    }

    private List<Screen> createScreen(){
         List<Screen> screenList=new ArrayList<>();
         Screen screen1=new Screen();
         screen1.setScreenId(1);
         screen1.setAllSeats(createSeat());
         screenList.add(screen1);
         return screenList;


    }
    private List<Seat> createSeat(){
         List<Seat> seatList=new ArrayList<>();

         for(int i=0;i<40;i++){
             Seat seat=new Seat();
             seat.setSeatId(i);
             seat.setSeatCategory(SeatCategory.SILVER);
             seatList.add(seat);

         }

         for(int i=40;i<70;i++){
             Seat seat=new Seat();
             seat.setSeatId(i);
             seat.setSeatCategory(SeatCategory.GOLD);
             seatList.add(seat);

         }
         for(int i=70;i<100;i++){
             Seat seat=new Seat();
             seat.setSeatId(i);
             seat.setSeatCategory(SeatCategory.SILVER);
             seatList.add(seat);

         }
         return seatList;

    }

    private void createMovies(){
         Movie avengers = new Movie();
         avengers.setMovieId(1);
         avengers.setMovieTitle("AVENGERS THE END GAME");
         avengers.setMovieDuration(128);

         Movie dramas = new Movie();
         dramas.setMovieId(2);
         dramas.setMovieTitle("DRAMAS THE END GAME");
         dramas.setMovieDuration(150);

         movieController.addMovie(avengers, City.Bangalore);
         movieController.addMovie(avengers, City.Delhi);
         movieController.addMovie(avengers,City.Kanpur);
        movieController.addMovie(avengers,City.Lucknow);
        movieController.addMovie(avengers,City.Hyderbad);

         movieController.addMovie(dramas, City.Bangalore);
         movieController.addMovie(dramas, City.Delhi);
        movieController.addMovie(dramas, City.Hyderbad);
        movieController.addMovie(dramas, City.Kanpur);
        movieController.addMovie(dramas, City.Lucknow);









    }

}
