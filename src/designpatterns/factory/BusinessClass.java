package designpatterns.factory;

public class BusinessClass implements TicketClass{
    @Override
    public Drinks getDrinksMenu() {
        return new BusinessClassDrinksMenu();
    }

    @Override
    public FoodMenu getFoodMenu() {
        return new BusinessClassFoodMenu();
    }

    @Override
    public SeatDetails getSeatDetails() {
        return new BusinessClassSeatDetails();
    }
}
