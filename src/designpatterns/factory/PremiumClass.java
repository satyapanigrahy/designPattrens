package designpatterns.factory;

public class PremiumClass implements TicketClass{
    @Override
    public Drinks getDrinksMenu() {
        return new PrimiumClassDrinksMenu();
    }

    @Override
    public FoodMenu getFoodMenu() {
        return new PremiumClassFoodMenu();
    }

    @Override
    public SeatDetails getSeatDetails() {
        return new PremiumClassSeatDetails();
    }
}
