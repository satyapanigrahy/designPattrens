package designpatterns.factory;

public class EconomyClass implements ITicket {

    public EconomyClass(){

    }
    @Override
    public Drinks drinksMenu() {
        return new EconomyClassDrinksMenu();
    }

    @Override
    public FoodMenu foodMenu() {
        return new EconomyClassFoodMenu();
    }

    @Override
    public SeatDetails seatDetails() {
        return new EconomyClassSeatDetails();
    }
}
