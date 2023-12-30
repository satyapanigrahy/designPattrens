package designpatterns.factory;

public class EconomyClass implements TicketClass {

    public EconomyClass(){

    }
    @Override
    public Drinks getDrinksMenu() {
        return new EconomyClassDrinksMenu();
    }

    @Override
    public FoodMenu getFoodMenu() {
        return new EconomyClassFoodMenu();
    }

    @Override
    public SeatDetails getSeatDetails() {
        return new EconomyClassSeatDetails();
    }
}
