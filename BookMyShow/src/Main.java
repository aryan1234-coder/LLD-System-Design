
import Enum.City;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.inialtize();

        System.out.println("Available Cities:");
        for (City city : City.values()) {
            System.out.println("- " + city);
        }

        System.out.print("Enter your city: ");
        City selectedCity = City.valueOf(sc.next().trim());

        List<Movie> movies = bookMyShow.movieController.getMoviesByCity(selectedCity);
        System.out.println("\nMovies in " + selectedCity + ":");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + 1 + ". " + movies.get(i).getMovieTitle());
        }

        System.out.print("Select movie by number: ");
        int movieIndex = sc.nextInt() - 1;
        Movie selectedMovie = movies.get(movieIndex);

        Map<Theatre, List<Show>> showMap = bookMyShow.theatreController.getAllShow(selectedMovie, selectedCity);
        List<Show> allShows = new ArrayList<>();
        System.out.println("\nAvailable Shows:");
        int count = 1;
        for (Map.Entry<Theatre, List<Show>> entry : showMap.entrySet()) {
            Theatre theatre = entry.getKey();
            for (Show show : entry.getValue()) {
                System.out.println(count + ". Theatre: "+ theatre.getTheatreId() + ", Show ID: " + show.getShowId() + ", Start Time: " + show.getShowStartTime());
                allShows.add(show);
                count++;
            }
        }

        System.out.print("Select show by number: ");
        int showIndex = sc.nextInt() - 1;
        Show selectedShow = allShows.get(showIndex);

        // Step 4: Show available seats
        List<Seat> allSeats = selectedShow.getScreen().getAllSeats();
        List<Integer> bookedSeats = selectedShow.getBookedSeat();
        System.out.println("\nAvailable Seats:");
        for (Seat seat : allSeats) {
            if (!bookedSeats.contains(seat.getSeatId())) {
                System.out.println("Seat ID: " + seat.getSeatId() + " - " + seat.getSeatCategory());
            }
        }

        System.out.print("Enter seat ID to book: ");
        int seatId = sc.nextInt();

        if (!bookedSeats.contains(seatId)) {
            bookedSeats.add(seatId);
            Booking booking = new Booking();
            List<Seat> booked = new ArrayList<>();
            for (Seat s : allSeats) {
                if (s.getSeatId() == seatId) {
                    booked.add(s);
                    break;
                }
            }
            booking.setSeatBooked(booked);
            booking.setShow(selectedShow);
            System.out.println("✅ Booking Successful!");
        } else {
            System.out.println("❌ Seat already booked. Please try another seat.");
        }

        bookMyShow.createBooking(City.Bangalore,"AVENGERS THE END GAME");
        bookMyShow.createBooking(City.Bangalore,"DRAMAS THE END GAME");



    }
}