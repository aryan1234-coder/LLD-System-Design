import Product.Vehicle;

import java.util.Date;

public class Reservation {

    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date bookedFromDate;
    Date bookedTillDate;
    Long fromTimestamp;
    Long toTimestamp;
    Location pickupLocation;
    Location dropOffLocation;
    ReservationType    reserVationType;
    ReservationStatus reservationStatus;
    Location location;

    public int createReservation(User user, Vehicle vehicle) {
        reservationId=1232;
        this.user=user;
        this.vehicle=vehicle;
        reserVationType=ReservationType.DAILY;
        reservationStatus=ReservationStatus.SCHEDULED;

        return reservationId;
    }

    //performing crud operations




}
