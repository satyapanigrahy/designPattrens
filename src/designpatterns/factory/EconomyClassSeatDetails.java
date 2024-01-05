package designpatterns.factory;

public class EconomyClassSeatDetails implements SeatDetails {

    public EconomyClassSeatDetails(){

    }
    @Override
    public String seatDetails() {
        return "Seat No. 34B, class: Economy";
    }
}
