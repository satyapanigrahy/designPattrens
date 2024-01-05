package designpatterns.factory;

public class PremiumClass implements ITicket {
    @Override
    public Drinks drinksMenu() {
        return new PrimiumClassDrinksMenu();
    }

    @Override
    public FoodMenu foodMenu() {
        return new PremiumClassFoodMenu();
    }

    @Override
    public SeatDetails seatDetails() {
        return new PremiumClassSeatDetails();
    }
}
