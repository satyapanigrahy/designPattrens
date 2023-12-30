package designpatterns.factory;

public class PremiumClassSeatDetails implements SeatDetails {
    @Override
    public String getSeatDetails() {
        return "Seat No. 45F, class: Premium";
    }
}
