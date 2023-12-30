package designpatterns.factory;

public class EconomyClassSeatDetails implements SeatDetails {

    public EconomyClassSeatDetails(){

    }
    @Override
    public String getSeatDetails() {
        return "Seat No. 34B, class: Economy";
    }
}
