
import Enum.City;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.inialtize();

        bookMyShow.createBooking(City.Bangalore,"AVENGERS THE END GAME");
        bookMyShow.createBooking(City.Bangalore,"DRAMAS THE END GAME");



    }
}