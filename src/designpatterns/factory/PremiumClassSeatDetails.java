package designpatterns.factory;

public class PremiumClassSeatDetails implements SeatDetails {
    @Override
    public String seatDetails() {
        return "Seat No. 45F, class: Premium";
    }
}
