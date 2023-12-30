package designpatterns.factory;

public class BusinessClassSeatDetails implements SeatDetails {
    @Override
    public String getSeatDetails() {
        return "Seat No. 104F, class: Business";
    }
}
