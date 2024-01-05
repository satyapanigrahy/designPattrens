package designpatterns.factory;

public class BusinessClass implements ITicket {
    @Override
    public Drinks drinksMenu() {
        return new BusinessClassDrinksMenu();
    }

    @Override
    public FoodMenu foodMenu() {
        return new BusinessClassFoodMenu();
    }

    @Override
    public SeatDetails seatDetails() {
        return new BusinessClassSeatDetails();
    }
}
