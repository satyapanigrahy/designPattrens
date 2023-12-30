package designpatterns.factory;

public interface TicketClass {

    Drinks getDrinksMenu();
    FoodMenu getFoodMenu();
    SeatDetails getSeatDetails();
}
