package designpatterns.factory;

public class BusinessClassSeatDetails implements SeatDetails {
    @Override
    public String seatDetails() {
        return "Seat No. 104F, class: Business";
    }
}
