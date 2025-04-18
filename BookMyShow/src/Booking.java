import java.util.List;

public class Booking {
    Show show;
    List<Seat> seatBooked;
    Payment payment;

    public List<Seat> getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(List<Seat> seatBooked) {
        this.seatBooked = seatBooked;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
