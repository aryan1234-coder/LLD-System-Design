import java.util.ArrayList;
import java.util.List;

public class Show {

    int showId;;
    Movie movie;
    Screen screen;

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public int getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(int showStartTime) {
        this.showStartTime = showStartTime;
    }

    public List<Integer> getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(List<Integer> bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    int showStartTime;
    List<Integer> bookedSeat=new ArrayList<>();

}
